package com.url.service.impl;

import cn.hutool.core.io.IoUtil;
import cn.hutool.core.util.CharsetUtil;
import cn.hutool.crypto.digest.DigestUtil;
import com.url.generator.RedisIdGenerator;
import com.url.modle.Url;
import com.url.service.UrlService;
import com.url.utils.NumUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @author ceshi
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2018/3/3014:51
 */
@Service
@PropertySource("classpath:config/config.properties")
public class UrlServiceImpl implements UrlService {

    @Value("${key}")
    private String key;
    @Value("${keyMd5}")
    private String keyMd5;

    @Autowired
    RedisIdGenerator redisIdGenerator;

    private StringRedisTemplate stringRedisTemplate;
    private HashOperations hashOperations;

    @Autowired
    public void setStringRedisTemplate(StringRedisTemplate stringRedisTemplate) {
        this.stringRedisTemplate = stringRedisTemplate;
        hashOperations = this.stringRedisTemplate.opsForHash();
    }

    @Override
    public Url getUrl(String id) {
        String url ;
        Object object = hashOperations.get(key,id);
        if (object==null){
            return null;
        }
        url = (String) object;
        Url u = new Url();
        u.setId(id);
        u.setUrl(url);
        return u;
    }

    @Override
    public String getSurl(String md5) {
        Object object = hashOperations.get(keyMd5,md5);
        if (object==null){
            return null;
        }
        return (String )object;
    }

    @Override
    public void saveSurl(String md5, String id) {
        hashOperations.put(keyMd5,md5,id);
    }

    @Override
    public String saveUrl(Url url) {
        String lUrl = url.getUrl();
        if(!lUrl.startsWith("http://")&&!lUrl.startsWith("https://")){
            url.setUrl("http://"+lUrl);
        }
        /**
         * 计算url的md5
         */
        String md5Hex = DigestUtil.md5Hex(IoUtil.toStream(url.getUrl(), CharsetUtil.CHARSET_UTF_8));
        //判断该md5是否已经存在
        String sUrl = getSurl(md5Hex);

        if(sUrl!=null){
            Url lurl = getUrl(sUrl);
            if(lurl!=null&&lurl.getUrl().equals(url.getUrl())){
                return sUrl;
            }
        }
        Long l = redisIdGenerator.next();
        String id = NumUtils.long2String(l);
        url.setId(id);
        hashOperations.put(key, url.getId(), url.getUrl());
        hashOperations.put(keyMd5, md5Hex, id);

        return id;
    }
}

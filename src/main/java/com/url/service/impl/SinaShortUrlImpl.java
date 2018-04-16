package com.url.service.impl;

import cn.hutool.core.util.RandomUtil;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.url.modle.SinaShortUrl;
import com.url.service.SinaShortUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.net.URLEncoder;

/**
 * 新浪短链接生成
 * @author YI
 * @date 2018-4-11 19:11:24
 */
@Service
@PropertySource("classpath:config/config.properties")
public class SinaShortUrlImpl implements SinaShortUrlService {
    @Value("${keySina}")
    private String keySina;
    @Value("${api}")
    private String api;
    @Value("${source}")
    private String source;

    private StringRedisTemplate stringRedisTemplate;
    private HashOperations hashOperations;

    @Autowired
    public void setStringRedisTemplate(StringRedisTemplate stringRedisTemplate) {
        this.stringRedisTemplate = stringRedisTemplate;
        hashOperations = this.stringRedisTemplate.opsForHash();
    }

    @Override
    public SinaShortUrl getShortUrl(String longUrl) {
        SinaShortUrl shortUrl = null;
        if(!longUrl.startsWith("http://")&&!longUrl.startsWith("https://")){
            longUrl = new StringBuffer().append("http://"+longUrl).toString();
        }

        try {
            String url = new StringBuffer().append(api).append("source=").append(source).append("&url_long=").append(URLEncoder.encode(longUrl, "utf-8")).toString();
            String result = HttpUtil.get(url);
            shortUrl = JSONUtil.toBean(JSONUtil.parseObj(result), SinaShortUrl.class);
            hashOperations.put(keySina, RandomUtil.simpleUUID(), shortUrl.toString());
        }catch (Exception e){
            e.printStackTrace();
        }

        return shortUrl;
    }
}

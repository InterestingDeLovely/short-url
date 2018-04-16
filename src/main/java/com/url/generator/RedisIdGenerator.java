package com.url.generator;

import com.url.config.LongRedisSerializer;
import com.url.exception.RunException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.redis.core.BoundHashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;

/**
 * Redis初始化
 * @author YI
 * @date 2018-4-16 11:39:54
 */
@Service
@PropertySource("classpath:application.properties")
public class RedisIdGenerator implements IdGenerator{


    private RedisTemplate <String,String> redisTemplate;

    private BoundHashOperations <String,String,Long> hashOperations;
    /**
     * 默认步长，为100
     */
    private  final Integer  STEP_SIZE = 1024;
    private String idKey = "shortUrl";

    /**
     * 储存自增主键的key值
     */
    private static final String LOCAL_KEY= "me.eae.urls.idGenerator_key";

    /**
     * 系统初始化时起始值
     */
    private Long startNum ;

    @Override
    public Long next() {
        hashOperations = redisTemplate.boundHashOps(LOCAL_KEY);
        return hashOperations.increment(idKey,STEP_SIZE);
    }

    @Override
    public void init(){
        StringRedisSerializer stringSerializer = new StringRedisSerializer();
        LongRedisSerializer longRedisSerializer = new LongRedisSerializer();
        redisTemplate.setHashKeySerializer(stringSerializer);
        redisTemplate.setKeySerializer(stringSerializer);
        redisTemplate.setHashValueSerializer(longRedisSerializer);
        hashOperations = redisTemplate.boundHashOps(LOCAL_KEY);
        if(!hashOperations.hasKey(idKey)){
            hashOperations.put(idKey,startNum);
        }
        redisTemplate.setHashKeySerializer(stringSerializer);
        System.out.println(hashOperations.get(idKey));
    }


    @Autowired
    public void setRedisTemplate(RedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @Value("${com.url.generator.RedisIdGenerator.startNum}")
    public void setStartNum(Long startNum) {
        if(startNum<0||startNum>STEP_SIZE){
            throw new RunException(500, "com.url.generator.RedisIdGenerator.startNum 参数设置非法，取值应在1-1024之间", new Exception());
        }
        this.startNum = startNum;
    }
}

package com.url.config;

import com.url.generator.IdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @author ceshi
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2018/4/215:54
 */
@Component
public class InitIdGenerator implements ApplicationRunner {
    @Autowired
    IdGenerator idGenerator;

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        idGenerator.init();
    }
}

package com.wonders.xlab.myproj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

/**
 * Created by wangqiang on 16/2/1.
 */
@SpringBootApplication
public class Application {

    @Bean
    public Jackson2ObjectMapperBuilder jackson2ObjectMapperBuilder() {
        return new Jackson2ObjectMapperBuilder()
                .indentOutput(true);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

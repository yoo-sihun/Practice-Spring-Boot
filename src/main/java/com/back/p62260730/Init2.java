package com.back.p62260730;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
public class Init2 {

//    @Autowired
//    private Person p1;

    @Autowired
    private Doctor p1;

    @Bean
    @Order(1)
    ApplicationRunner test() {
        return args -> {
            p1.introduce();
            p1.breathe();
            p1.diagnosis();
        };
    }
}

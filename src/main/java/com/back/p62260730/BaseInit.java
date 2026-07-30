package com.back.p62260730;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration // 빈 등록용
public class BaseInit {

    @Bean
    public Doctor getDoctor() {
        return new APerson();
    }

    @Bean
    public Person getPerseon() {
        return new APerson();
    }

//    @Bean
//    public ApplicationRunner init() {
//        return new MyApplicationRunner();
//    }


    @Bean
    @Order(2)
    public ApplicationRunner init() {
        return args -> {
            System.out.println("초기 데이터를 로딩합니다.");
        };
    }
}
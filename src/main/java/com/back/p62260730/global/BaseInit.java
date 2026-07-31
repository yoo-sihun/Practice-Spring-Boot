package com.back.p62260730.global;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 빈 등록용
public class BaseInit {

    @Bean
    public ApplicationRunner init() {
        return args -> {
            System.out.println("초기 데이터를 로딩합니다.");
        };
    }
}
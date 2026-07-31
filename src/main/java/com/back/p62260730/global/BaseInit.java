package com.back.p62260730.global;

import com.back.p62260730.domain.post.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 빈 등록용
public class BaseInit {

    @Autowired
    private PostRepository postRepository;
    @Bean
    public ApplicationRunner init() {
        return args -> {
            System.out.println("post의 row 개수를 셉니다");
            postRepository.count(); // select count(*) from post;
        };
    }
}
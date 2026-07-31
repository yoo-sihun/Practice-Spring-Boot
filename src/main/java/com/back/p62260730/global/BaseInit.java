package com.back.p62260730.global;

import com.back.p62260730.domain.post.repository.PostRepository;
import com.back.p62260730.domain.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 빈 등록용
public class BaseInit {

    @Autowired
    private PostRepository postRepository;
    private PostService postService; // 창고관리인

    @Bean
    public ApplicationRunner init() {
        return args -> {
            System.out.println("초기화 작업을 수행합니다.");
            work1();
            work2();
        };
    }

    void work1() {

            if(postService.count() > 0) {
                return;
            }

            postService.write("제목1", "내용1");
            postService.write("제목2", "내용2");


        }

        void work2() {
            postService.findById(1);
            // select * from post where id = 1;
        }
    }
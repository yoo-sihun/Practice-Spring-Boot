package com.back.p62260730.domain.service;


import com.back.p62260730.domain.post.entity.Post;
import org.springframework.stereotype.Component;

@Component
// PostRepository 대신 사용
// 비즈니스 로직 만든느 곳
public class PostService {

    public Post write(String title, String body) {
        if(title.length() >= 100) {
            System.out.println("제목은 100자 이하로 작성해주세요");
            return null;
        }

        Post post1 = new Post(title, "내용1")
    }

}

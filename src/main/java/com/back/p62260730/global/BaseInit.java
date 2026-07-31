package com.back.p62260730.global;

import com.back.p62260730.domain.post.entity.Post;
import com.back.p62260730.domain.post.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Optional;

@Configuration // 빈 등록용
public class BaseInit {

    @Autowired
    private PostRepository postRepository;
    @Bean
    public ApplicationRunner init() {
        return args -> {
            System.out.println("초기화 작업을 수행합니다");
            if(postRepository.count() > 0) {
                return;
            }
            postRepository.count(); // select count(*) from post;
            // post 하나 저장
            Post post = new Post();
            post.setTitle("제목1");
            post.setBody("내용1");
            postRepository.save(post);
            // insert into post ...

            // post 조회
            // Optional로 나오는거 기억
            Optional<Post> opPost = postRepository.findById(1);

            if(opPost.isPresent()) {
                System.out.println(opPost.get().getTitle());
                System.out.println(opPost.get().getBody());
            }

        };
    }

}
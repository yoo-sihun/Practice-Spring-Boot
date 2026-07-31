package com.back.p62260730.domain.service;


import com.back.p62260730.domain.post.entity.Post;
import com.back.p62260730.domain.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Component
@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;
// 트랜잭션 범위는 jpa가 제공하는 메서드 단위로 트랜잭션 기능이 잡힌다.
    //jpa -> jakarta
    // @Transactional은 spring패키지 사용
    public Post write(String title, String body) {
        Post post = new Post(title, body);
        return postRepository.save(post); // insert into .. sql문 발생 => sql문이 db에 반영될려면 commit
        // 기본적으로 jpa가 제공하는 기능은 그 자 체로 트랜잭션 범위를 가진다.
    }

    public void delete(Post post) {
        postRepository.delete(post);
    }

    public Optional<Post> findById(int id) {
        return postRepository.findById(id); // 트랜잭션 시작 ->  select * from post -> 트랜잭션 종료 -> 커밋
    }

    public long count() {
        return postRepository.count();
    }
}
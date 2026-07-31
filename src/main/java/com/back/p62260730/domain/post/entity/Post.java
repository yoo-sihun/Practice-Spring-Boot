package com.back.p62260730.domain.post.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter // 어노테이션. 표식(자바, 프레임워크, IDE)
@Entity
@NoArgsConstructor
// 롬복은 모두 받는 AllArgsConstructor랑 NoArgsConstructor만 만들어 줄 수있다
// 아니면 final이라는 표식을 남기면 이걸 골라서 받을 수 있는 @RequireArgsConstructor있다
// 단순히 생성자 만들기 쉽게 하기 위해 final 붙이면 안된다
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; // int
    private String title; //varchar(255)
    private String body; //varchar(255)
    private LocalDateTime createDate;
    private LocalDateTime modifyDate;
    // 엔티티 구조를 바꿀경우 ddl-auto 사용중일땐 파일 db파일 지웠다가 다시 rerun하기

    public Post(String title, String body) {
        this.title = title;
        this.body = body;
        this.createDate = LocalDateTime.now();
        this.modifyDate = createDate;

    }
}

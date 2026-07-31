package com.back.p62260730.domain.post.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter // 어노테이션. 표식(자바, 프레임워크, IDE)
@Entity
@NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; // int
    private String title; //varchar(255)
    private String body; //varchar(255)
    // 엔티티 구조를 바꿀경우 ddl-auto 사용중일땐 파일 db파일 지웠다가 다시 rerun하기

}

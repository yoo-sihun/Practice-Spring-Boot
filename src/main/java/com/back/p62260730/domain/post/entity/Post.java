package com.back.p62260730.domain.post.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Setter
@Getter // 어노테이션. 표식(자바, 프레임워크, IDE)
@Entity
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
// 롬복은 모두 받는 AllArgsConstructor랑 NoArgsConstructor만 만들어 줄 수있다
// 아니면 final이라는 표식을 남기면 이걸 골라서 받을 수 있는 @RequireArgsConstructor있다
// 단순히 생성자 만들기 쉽게 하기 위해 final 붙이면 안된다
public class Post extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String title; //varchar(255)
    private String body;//varchar(255)


    public Post(String title, String body) {
        this.title = title;
        this.body = body;
    }
    public void modify(String title, String body) {
        this.title = title;
        this.body = body;
    }
}

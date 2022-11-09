package com.mustache.bbs.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "article2")
@NoArgsConstructor
@Getter
@AllArgsConstructor
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // db에 ID생성 맡김
    private Long id;

    private String title;
    private String contents;

    public Article(String title, String content) {
        this.title = title;
        this.contents = contents;
    }
}
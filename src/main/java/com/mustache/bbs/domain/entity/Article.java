package com.mustache.bbs.domain.entity;

import com.mustache.bbs.domain.ArticleDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
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

    public static ArticleDto of(Article article){
        return new ArticleDto(article.getId(),article.getTitle(),article.getContents());
    }
}
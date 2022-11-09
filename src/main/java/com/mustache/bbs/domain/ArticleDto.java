package com.mustache.bbs.domain;

import com.mustache.bbs.domain.entity.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class ArticleDto {
    private Long id;
    private String title;
    private String contents;

    public Article toEntity() {
        return new Article(this.id, this.title,this.contents);
    }
}

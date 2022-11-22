package com.mustache.bbs.domain;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ArticleResponse {
    private Long id;
    private String title;
    private String contents;
}

package com.mustache.bbs.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ArticleAddResponse {
    private Long id;
    private String title;
    private String contents;
}

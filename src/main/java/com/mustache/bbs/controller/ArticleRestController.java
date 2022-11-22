package com.mustache.bbs.controller;


import com.mustache.bbs.domain.ArticleAddRequest;
import com.mustache.bbs.domain.ArticleAddResponse;
import com.mustache.bbs.domain.ArticleDto;
import com.mustache.bbs.service.ArticleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/articles")
public class ArticleRestController {
    private final ArticleService articleService;

    public ArticleRestController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ArticleDto> getArticle(@PathVariable Long id){
        ArticleDto articleDto = articleService.getArticleById(id);
        return ResponseEntity.ok().body(articleDto);
    }

    @PostMapping("/add")
    public ResponseEntity<ArticleAddResponse> addArticle(ArticleAddRequest dto){
        ArticleAddResponse response = articleService.add(dto);
        return ResponseEntity.ok().body(response);
    }

}

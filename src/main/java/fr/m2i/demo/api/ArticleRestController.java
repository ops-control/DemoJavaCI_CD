package fr.m2i.demo.api;

import fr.m2i.demo.bo.Article;
import fr.m2i.demo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ArticleRestController {
    @Autowired
    private ArticleService articleService;
    @GetMapping("/articles")
    public List<Article> getAll(){
        List<Article> articles = articleService.getAll();
        return articles;

    }
}

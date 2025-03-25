package fr.m2i.demo.service;

import fr.m2i.demo.bo.Article;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleService {
    public List<Article> getAll(){
        // Récupérer tout les articles
        List<Article> articles = new ArrayList<>();
        articles.add(new Article(1L, " Chocolatine"));
        articles.add(new Article(2L, " Donald"));
        articles.add(new Article(3L, " Pain chocola"));
        return articles;
    }
}

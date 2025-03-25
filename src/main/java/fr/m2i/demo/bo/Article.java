package fr.m2i.demo.bo;

public class Article {
    private Long id;
    private String title;

    public Article(String title) {
        this.title = title;
    }

    public Article(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Article() {
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

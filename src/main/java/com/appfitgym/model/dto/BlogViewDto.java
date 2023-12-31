package com.appfitgym.model.dto;

public class BlogViewDto {

    private Long id;

    private String title;
    private String description;
    private String author;

    private Long authorId;



    private String date;
    private String image;

    private String authorImage;

    public Long getAuthorId() {
        return authorId;
    }

    public BlogViewDto setAuthorId(Long authorId) {
        this.authorId = authorId;
        return this;
    }
    public String getAuthorImage() {
        return authorImage;
    }

    public BlogViewDto setAuthorImage(String authorImage) {
        this.authorImage = authorImage;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Long getId() {
        return id;
    }

    public BlogViewDto setId(Long id) {
        this.id = id;
        return this;
    }

    public BlogViewDto setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public BlogViewDto setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public BlogViewDto setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getDate() {
        return date;
    }
    public BlogViewDto setDate(String date) {
        this.date = date;
        return this;
    }

    public String getImage() {
        return image;
    }

    public BlogViewDto setImage(String image) {
        this.image = image;
        return this;
    }
}

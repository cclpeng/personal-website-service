package com.tutorial.mongo.db.demo.model;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Post {

    @Id
    private String id;
    private List<String> tags;
    private String content;
    private String title;
    private String folder;

    //constructors
    public Post(List<String> tags, String content, String title, String folder) {
        this.tags = tags;
        this.content = content;
        this.title = title;
    }

    //getters
    public String getId() {
        return id;
    }
    public List<String> getTags() {
        return tags;
    }
    public String getContent() {
        return content;
    }
    public String getTitle() {
        return title;
    }
    public String getFolder() {
        return folder;
    }

    //toString
    @Override
    public String toString() {
        return "Post{" +
                "id='" + id + '\'' +
                ", tags=" + tags +
                ", content='" + content + '\'' +
                ", title='" + title + '\'' +
                ", folder='" + folder + '\'' +
                '}';
    }
}

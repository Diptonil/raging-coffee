package com.example.courseapi.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="topic")
public class TopicModel {

    @Id
    @Column(name="id")
    private int id;
    @Column(name="title", length=32, nullable=false, unique=false)
    private String title;
    @Column(name="description", length=128, nullable=true, unique=false)
    private String description;

    TopicModel() {}

    public TopicModel(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

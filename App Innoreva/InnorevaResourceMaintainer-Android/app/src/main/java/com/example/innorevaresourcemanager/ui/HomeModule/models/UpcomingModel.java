package com.example.innorevaresourcemanager.ui.HomeModule.models;

public class UpcomingModel {
    String id, url, title, description;

    public UpcomingModel() {
    }

    public UpcomingModel(String id, String url, String title, String description) {
        this.id = id;
        this.url = url;
        this.title = title;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

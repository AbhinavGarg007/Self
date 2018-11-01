package com.example.emp354.myapplication2.ApiWithToken.POJOBooksCategory2;


import java.util.List;

public class SubCategories1 {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<SubCategories1> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(List<SubCategories1> subCategories) {
        this.subCategories = subCategories;
    }

    private String name;
    private String url;
    private String id;
    private List<SubCategories1> subCategories;
}

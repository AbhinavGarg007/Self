package com.example.emp354.myapplication2.ApiWithToken.POJOCategory;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BooksInfo {

    @SerializedName("language")
    @Expose
    private Object language;
    @SerializedName("binding")
    @Expose
    private Object binding;
    @SerializedName("pages")
    @Expose
    private Object pages;
    @SerializedName("publisher")
    @Expose
    private Object publisher;
    @SerializedName("year")
    @Expose
    private Integer year;
    @SerializedName("authors")
    @Expose
    private List<Object> authors = null;

    public Object getLanguage() {
        return language;
    }

    public void setLanguage(Object language) {
        this.language = language;
    }

    public Object getBinding() {
        return binding;
    }

    public void setBinding(Object binding) {
        this.binding = binding;
    }

    public Object getPages() {
        return pages;
    }

    public void setPages(Object pages) {
        this.pages = pages;
    }

    public Object getPublisher() {
        return publisher;
    }

    public void setPublisher(Object publisher) {
        this.publisher = publisher;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public List<Object> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Object> authors) {
        this.authors = authors;
    }
}

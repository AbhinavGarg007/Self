package com.example.emp354.myapplication2.ApiWithToken.POJOBooksCategory2;

public class BooksCategoryModel {
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

    public BooksCategory getBooksCategory() {
        return booksCategory;
    }

    public void setBooksCategory(BooksCategory booksCategory) {
        this.booksCategory = booksCategory;
    }

    private String title;
    private String description;
    private BooksCategory booksCategory;
}

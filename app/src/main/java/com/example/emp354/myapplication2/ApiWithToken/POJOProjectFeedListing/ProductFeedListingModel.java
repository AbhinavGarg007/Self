package com.example.emp354.myapplication2.ApiWithToken.POJOProjectFeedListing;

public class ProductFeedListingModel {
    private String title;
    private String description;
    private ApiGroups apiGroups;

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

    public ApiGroups getApiGroups() {
        return apiGroups;
    }

    public void setApiGroups(ApiGroups apiGroups) {
        this.apiGroups = apiGroups;
    }
}

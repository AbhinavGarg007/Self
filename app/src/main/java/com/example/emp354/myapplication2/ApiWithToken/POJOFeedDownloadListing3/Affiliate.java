package com.example.emp354.myapplication2.ApiWithToken.POJOFeedDownloadListing3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Affiliate {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("apiListings")
    @Expose
    private ApiListings apiListings;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ApiListings getApiListings() {
        return apiListings;
    }

    public void setApiListings(ApiListings apiListings) {
        this.apiListings = apiListings;
    }
}

package com.example.emp354.myapplication2.ApiWithToken.POJOFeedDownloadListing2;

import com.example.emp354.myapplication2.ApiWithToken.POJOFeedDownloadListing.AvailableVariants__________;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MensClothing {
    @SerializedName("availableVariants")
    @Expose
    private AvailableVariants availableVariants;
    @SerializedName("apiName")
    @Expose
    private String apiName;

    public AvailableVariants getAvailableVariants() {
        return availableVariants;
    }

    public void setAvailableVariants(AvailableVariants availableVariants) {
        this.availableVariants = availableVariants;
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

}

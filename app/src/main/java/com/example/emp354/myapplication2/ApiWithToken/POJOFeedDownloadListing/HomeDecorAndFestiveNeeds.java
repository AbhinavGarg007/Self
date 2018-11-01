package com.example.emp354.myapplication2.ApiWithToken.POJOFeedDownloadListing;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HomeDecorAndFestiveNeeds {
    @SerializedName("availableVariants")
    @Expose
    private AvailableVariants___________________________________________________ availableVariants;
    @SerializedName("apiName")
    @Expose
    private String apiName;

    public AvailableVariants___________________________________________________ getAvailableVariants() {
        return availableVariants;
    }

    public void setAvailableVariants(AvailableVariants___________________________________________________ availableVariants) {
        this.availableVariants = availableVariants;
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }
}

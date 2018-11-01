package com.example.emp354.myapplication2.ApiWithToken.POJOFeedDownloadListing;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NetworkComponents {
    @SerializedName("availableVariants")
    @Expose
    private AvailableVariants_______ availableVariants;
    @SerializedName("apiName")
    @Expose
    private String apiName;

    public AvailableVariants_______ getAvailableVariants() {
        return availableVariants;
    }

    public void setAvailableVariants(AvailableVariants_______ availableVariants) {
        this.availableVariants = availableVariants;
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

}

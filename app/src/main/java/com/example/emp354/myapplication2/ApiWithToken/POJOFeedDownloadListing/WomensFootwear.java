package com.example.emp354.myapplication2.ApiWithToken.POJOFeedDownloadListing;

public class WomensFootwear {
    @SerializedName("availableVariants")
    @Expose
    private AvailableVariants________________________________________________________ availableVariants;
    @SerializedName("apiName")
    @Expose
    private String apiName;

    public AvailableVariants________________________________________________________ getAvailableVariants() {
        return availableVariants;
    }

    public void setAvailableVariants(AvailableVariants________________________________________________________ availableVariants) {
        this.availableVariants = availableVariants;
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }
}
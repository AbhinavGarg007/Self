package com.example.emp354.myapplication2.ApiWithToken.POJOFeedDownloadListing2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AvailableVariants {
    @SerializedName("v1.1.0")
    @Expose
    private V110 v110;

    public V110 getV110() {
        return v110;
    }

    public void setV110(V110 v110) {
        this.v110 = v110;
    }
}

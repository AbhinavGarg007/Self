package com.example.emp354.myapplication2.ApiWithToken.POJOProjectFeedListing;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AvailableVariants {

    @SerializedName("v0.1.0")
    @Expose
    private V010 v010;


    @SerializedName("v1.1.0")
    @Expose
    private V110 v110;


    public V010 getV010() {
        return v010;
    }

    public void setV010(V010 v010) {
        this.v010 = v010;
    }

    public V110 getV110() {
        return v110;
    }

    public void setV110(V110 v110) {
        this.v110 = v110;
    }
}

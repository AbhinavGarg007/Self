package com.example.emp354.myapplication2.ApiWithToken.POJOSearchQuery;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LifeStyleInfo {

    @SerializedName("sleeve")
    @Expose
    private Object sleeve;
    @SerializedName("neck")
    @Expose
    private Object neck;
    @SerializedName("idealFor")
    @Expose
    private Object idealFor;

    public Object getSleeve() {
        return sleeve;
    }

    public void setSleeve(Object sleeve) {
        this.sleeve = sleeve;
    }

    public Object getNeck() {
        return neck;
    }

    public void setNeck(Object neck) {
        this.neck = neck;
    }

    public Object getIdealFor() {
        return idealFor;
    }

    public void setIdealFor(Object idealFor) {
        this.idealFor = idealFor;
    }
}

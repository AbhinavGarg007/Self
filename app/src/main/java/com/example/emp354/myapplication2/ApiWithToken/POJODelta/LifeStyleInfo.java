package com.example.emp354.myapplication2.ApiWithToken.POJODelta;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LifeStyleInfo {

    @SerializedName("sleeve")
    @Expose
    private Object sleeve;
    @SerializedName("neck")
    @Expose
    private Object neck;
    @SerializedName("idealFor")
    @Expose
    private List<String> idealFor = null;

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

    public List<String> getIdealFor() {
        return idealFor;
    }

    public void setIdealFor(List<String> idealFor) {
        this.idealFor = idealFor;
    }
}

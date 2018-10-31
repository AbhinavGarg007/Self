package com.example.emp354.myapplication2.ApiWithToken.POJODelta;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SpecificationList {

    @SerializedName("key")
    @Expose
    private String key;
    @SerializedName("values")
    @Expose
    private List<Value> values = null;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public List<Value> getValues() {
        return values;
    }

    public void setValues(List<Value> values) {
        this.values = values;
    }
}

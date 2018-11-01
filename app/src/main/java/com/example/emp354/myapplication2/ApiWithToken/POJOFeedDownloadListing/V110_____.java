package com.example.emp354.myapplication2.ApiWithToken.POJOFeedDownloadListing;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class V110_____ {
    @SerializedName("resourceName")
    @Expose
    private String resourceName;
    @SerializedName("post")
    @Expose
    private Object post;
    @SerializedName("put")
    @Expose
    private Object put;
    @SerializedName("get")
    @Expose
    private String get;
    @SerializedName("deltaGet")
    @Expose
    private Object deltaGet;
    @SerializedName("delete")
    @Expose
    private Object delete;

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public Object getPost() {
        return post;
    }

    public void setPost(Object post) {
        this.post = post;
    }

    public Object getPut() {
        return put;
    }

    public void setPut(Object put) {
        this.put = put;
    }

    public String getGet() {
        return get;
    }

    public void setGet(String get) {
        this.get = get;
    }

    public Object getDeltaGet() {
        return deltaGet;
    }

    public void setDeltaGet(Object deltaGet) {
        this.deltaGet = deltaGet;
    }

    public Object getDelete() {
        return delete;
    }

    public void setDelete(Object delete) {
        this.delete = delete;
    }
}

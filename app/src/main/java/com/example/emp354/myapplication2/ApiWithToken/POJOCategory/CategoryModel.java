package com.example.emp354.myapplication2.ApiWithToken.POJOCategory;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CategoryModel {

    @SerializedName("nextUrl")
    @Expose
    private String nextUrl;
    @SerializedName("validTill")
    @Expose
    private Integer validTill;
    @SerializedName("lastProductId")
    @Expose
    private String lastProductId;
    @SerializedName("products")
    @Expose
    private List<Product> products = null;

    public String getNextUrl() {
        return nextUrl;
    }

    public void setNextUrl(String nextUrl) {
        this.nextUrl = nextUrl;
    }

    public Integer getValidTill() {
        return validTill;
    }

    public void setValidTill(Integer validTill) {
        this.validTill = validTill;
    }

    public String getLastProductId() {
        return lastProductId;
    }

    public void setLastProductId(String lastProductId) {
        this.lastProductId = lastProductId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}

package com.example.emp354.myapplication2.ApiWithToken.POJOProductFeed;

public class ProductFeedModel {
    private String nextUrl;
    private String validTill;
    private ProductInfoList productInfoList;

    public String getNextUrl() {
        return nextUrl;
    }

    public void setNextUrl(String nextUrl) {
        this.nextUrl = nextUrl;
    }

    public String getValidTill() {
        return validTill;
    }

    public void setValidTill(String validTill) {
        this.validTill = validTill;
    }

    public ProductInfoList getProductInfoList() {
        return productInfoList;
    }

    public void setProductInfoList(ProductInfoList productInfoList) {
        this.productInfoList = productInfoList;
    }
}

package com.example.emp354.myapplication2.ApiWithToken.POJOSearchQuery;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Product {

    @SerializedName("productBaseInfoV1")
    @Expose
    private ProductBaseInfoV1 productBaseInfoV1;
    @SerializedName("productShippingInfoV1")
    @Expose
    private ProductShippingInfoV1 productShippingInfoV1;
    @SerializedName("categorySpecificInfoV1")
    @Expose
    private CategorySpecificInfoV1 categorySpecificInfoV1;

    public ProductBaseInfoV1 getProductBaseInfoV1() {
        return productBaseInfoV1;
    }

    public void setProductBaseInfoV1(ProductBaseInfoV1 productBaseInfoV1) {
        this.productBaseInfoV1 = productBaseInfoV1;
    }

    public ProductShippingInfoV1 getProductShippingInfoV1() {
        return productShippingInfoV1;
    }

    public void setProductShippingInfoV1(ProductShippingInfoV1 productShippingInfoV1) {
        this.productShippingInfoV1 = productShippingInfoV1;
    }

    public CategorySpecificInfoV1 getCategorySpecificInfoV1() {
        return categorySpecificInfoV1;
    }

    public void setCategorySpecificInfoV1(CategorySpecificInfoV1 categorySpecificInfoV1) {
        this.categorySpecificInfoV1 = categorySpecificInfoV1;
    }
}

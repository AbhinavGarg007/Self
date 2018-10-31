package com.example.emp354.myapplication2.ApiWithToken.POJOSearchQuery;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProductShippingInfoV1 {

    @SerializedName("shippingCharges")
    @Expose
    private ShippingCharges shippingCharges;
    @SerializedName("estimatedDeliveryTime")
    @Expose
    private String estimatedDeliveryTime;
    @SerializedName("sellerName")
    @Expose
    private String sellerName;
    @SerializedName("sellerAverageRating")
    @Expose
    private Double sellerAverageRating;
    @SerializedName("sellerNoOfRatings")
    @Expose
    private Integer sellerNoOfRatings;
    @SerializedName("sellerNoOfReviews")
    @Expose
    private Integer sellerNoOfReviews;

    public ShippingCharges getShippingCharges() {
        return shippingCharges;
    }

    public void setShippingCharges(ShippingCharges shippingCharges) {
        this.shippingCharges = shippingCharges;
    }

    public String getEstimatedDeliveryTime() {
        return estimatedDeliveryTime;
    }

    public void setEstimatedDeliveryTime(String estimatedDeliveryTime) {
        this.estimatedDeliveryTime = estimatedDeliveryTime;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Double getSellerAverageRating() {
        return sellerAverageRating;
    }

    public void setSellerAverageRating(Double sellerAverageRating) {
        this.sellerAverageRating = sellerAverageRating;
    }

    public Integer getSellerNoOfRatings() {
        return sellerNoOfRatings;
    }

    public void setSellerNoOfRatings(Integer sellerNoOfRatings) {
        this.sellerNoOfRatings = sellerNoOfRatings;
    }

    public Integer getSellerNoOfReviews() {
        return sellerNoOfReviews;
    }

    public void setSellerNoOfReviews(Integer sellerNoOfReviews) {
        this.sellerNoOfReviews = sellerNoOfReviews;
    }
}

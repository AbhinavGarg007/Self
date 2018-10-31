package com.example.emp354.myapplication2.ApiWithToken.POJODelta;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ShippingCharges {

    @SerializedName("amount")
    @Expose
    private Double amount;
    @SerializedName("currency")
    @Expose
    private String currency;

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}

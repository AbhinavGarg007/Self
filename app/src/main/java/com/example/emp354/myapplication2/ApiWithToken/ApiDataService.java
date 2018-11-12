package com.example.emp354.myapplication2.ApiWithToken;

import com.example.emp354.myapplication2.ApiWithToken.POJOProjectFeedListing.ProductFeedListingModel;
import com.example.emp354.myapplication2.ApiWithToken.POJOalloffers.AllOffersListModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface ApiDataService {

    /*@Headers({"Fk-Affiliate-Id:mrabhinavgarg", "Fk-Affiliate-Token:1010739fcd354253a3e8679f8c1f8ebc"})
    @GET("mrabhinavgarg.json")
    Call<ProductFeedListingModel> getAllData();*/

   /* @Headers({"Fk-Affiliate-Id:mrabhinavgarg", "Fk-Affiliate-Token:1010739fcd354253a3e8679f8c1f8ebc"})
    @GET("reh.json?expiresAt=1541006200024&sig=f480e57c348d70f946644d013cce737b")
    Call<ProductFeedListingModel> getAllData();*/


    /*@Headers({"Fk-Affiliate-Id:mrabhinavgarg", "Fk-Affiliate-Token:1010739fcd354253a3e8679f8c1f8ebc"})
    @GET("json")
    Call<DataModel> getAllData();*/


    @Headers({"Fk-Affiliate-Id:mrabhinavgarg", "Fk-Affiliate-Token:1010739fcd354253a3e8679f8c1f8ebc"})
    @GET("json")
    Call<AllOffersListModel> getAllData();
}

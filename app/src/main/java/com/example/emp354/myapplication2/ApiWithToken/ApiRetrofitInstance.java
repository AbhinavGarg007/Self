package com.example.emp354.myapplication2.ApiWithToken;

import android.util.Log;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiRetrofitInstance {

   /* private static final String BASE_URL="https://www.googleapis.com/customsearch/";*/


    //for product feed listing api
   /* private static final String BASE_URL="https://affiliate-api.flipkart.net/affiliate/api/";*/

    //for all offers
    private static final String BASE_URL="https://affiliate-api.flipkart.net/affiliate/offers/v1/all/";

    //for dotd
    /*private static final String BASE_URL="https://affiliate-api.flipkart.net/affiliate/offers/v1/dotd/";*/


    //for product feed
    /*private static final String BASE_URL="https://affiliate-api.flipkart.net/affiliate/feeds/mrabhinavgarg/category/";*/


    //to get category
    /*private static final String BASE_URL="https://affiliate-api.flipkart.net/affiliate/1.0/feeds/mrabhinavgarg/category/";*/

    //for search query based
   /* private static final String BASE_URL="https://affiliate-api.flipkart.net/affiliate/1.0/search.json?query=sony+mobiles&resultCount=5";*/


    private static Retrofit retrofitImage;

    public  static Retrofit getApiRetrofitInstance()

    {
        Log.d("ImageSearch","getting retrofit instance");
        if(retrofitImage==null)
        {
            retrofitImage=new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofitImage;
    }
}

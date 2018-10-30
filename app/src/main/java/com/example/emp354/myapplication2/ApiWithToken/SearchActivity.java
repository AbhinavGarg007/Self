package com.example.emp354.myapplication2.ApiWithToken;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.emp354.myapplication2.ApiWithToken.POJOalloffers.AllOffersListModel;
import com.example.emp354.myapplication2.ApiWithToken.POJOdotd.DModel;
import com.example.emp354.myapplication2.ApiWithToken.POJOdotd.DataModel;
import com.example.emp354.myapplication2.R;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SearchActivity extends AppCompatActivity implements View.OnClickListener {

    List<DModel> dataModelList=new ArrayList<>();

    Button btnSearch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        btnSearch=findViewById(R.id.btn_search);

        btnSearch.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btn_search:
                fetchData();
        }

    }

    private void fetchData()
    {
        ApiDataService service=ApiRetrofitInstance.getApiRetrofitInstance().create(ApiDataService.class);
        Call<AllOffersListModel> call=service.getAllData();
        call.enqueue(new Callback<AllOffersListModel>() {
            @Override
            public void onResponse(Call<AllOffersListModel> call, Response<AllOffersListModel> response) {
                if(response!=null) {
                    Log.d("response",response.raw().message());
                    Log.d("response",String.valueOf(response.body().getAllOffersList().size()));
                Intent intent=new Intent(SearchActivity.this,ResultActivity.class);
                /*intent.putExtra("dotd",response.body());*/
                  intent.putExtra("allOffers",response.body());
                startActivity(intent);
                }
                   /* dataModelList=response.body().getDotdList();
                    Toast.makeText(SearchActivity.this,"Success",Toast.LENGTH_SHORT).show();
                Log.d("response",response.raw().message());
                Log.d("response",String.valueOf(response.body().getDotdList().size()));
                int listsize=response.body().getDotdList().size();*/

               /* for(int i=0;i<listsize;i++)
                {
                    Log.d("response",response.body().getDotdList().get(i).getTitle());
                    Log.d("response",response.body().getDotdList().get(i).getDescription());
                    Log.d("response",response.body().getDotdList().get(i).getUrl());
                    int urlsize=response.body().getDotdList().get(i).getImageUrls().size();
                    for(int j=0;j<urlsize;j++)
                    {
                        Log.d("response",response.body().getDotdList().get(i).getImageUrls().get(j).getUrl());
                        Log.d("response",response.body().getDotdList().get(i).getImageUrls().get(j).getResolutionType());
                    }
                    Log.d("response",response.body().getDotdList().get(i).getAvailability());
                }*/

            }

            @Override
            public void onFailure(Call<AllOffersListModel> call, Throwable t) {

                Toast.makeText(SearchActivity.this,"Failure",Toast.LENGTH_SHORT).show();
            }
        });
    }
}

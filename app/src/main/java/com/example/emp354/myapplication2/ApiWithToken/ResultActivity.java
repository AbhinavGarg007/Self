package com.example.emp354.myapplication2.ApiWithToken;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.emp354.myapplication2.ApiWithToken.POJOalloffers.AllOffersListModel;
import com.example.emp354.myapplication2.ApiWithToken.POJOdotd.DataModel;
import com.example.emp354.myapplication2.ApiWithToken.adapter.RecyclerAdapterAllOffers;
import com.example.emp354.myapplication2.ApiWithToken.adapter.RecyclerAdapterDOTD;
import com.example.emp354.myapplication2.R;

public class ResultActivity extends AppCompatActivity {
    DataModel dataModel;
    AllOffersListModel allOffersListModel;
    RecyclerView recyclerView;
    RecyclerAdapterDOTD recyclerAdapterDOTD;
    RecyclerAdapterAllOffers recyclerAdapterAllOffers;
    LinearLayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        recyclerView=findViewById(R.id.recyclerview_dotd);
        layoutManager=new LinearLayoutManager(this);

        Intent resultIntent=getIntent();
       /* dataModel=resultIntent.getParcelableExtra("dotd");*/
        allOffersListModel=resultIntent.getParcelableExtra("allOffers");

        //for dotd offers
        /*recyclerAdapterDOTD=new RecyclerAdapterDOTD(this,dataModel);
        recyclerView.setAdapter(recyclerAdapterDOTD);*/

        //for all offers
        recyclerAdapterAllOffers=new RecyclerAdapterAllOffers(this,allOffersListModel);
        recyclerView.setAdapter(recyclerAdapterAllOffers);



        recyclerView.setLayoutManager(layoutManager);
    }
}

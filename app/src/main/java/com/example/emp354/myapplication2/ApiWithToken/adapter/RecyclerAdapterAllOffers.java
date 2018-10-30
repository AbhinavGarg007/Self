package com.example.emp354.myapplication2.ApiWithToken.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.emp354.myapplication2.ApiWithToken.POJOalloffers.AllOffersList;
import com.example.emp354.myapplication2.ApiWithToken.POJOalloffers.AllOffersListModel;
import com.example.emp354.myapplication2.R;

import java.util.List;

public class RecyclerAdapterAllOffers extends RecyclerView.Adapter {

    private Context mContext;
    private AllOffersListModel mAllOffersListModel;
    private List<AllOffersList> allOffersListList;

    public RecyclerAdapterAllOffers(Context context,AllOffersListModel allOffersListModel)
    {
        mContext=context;
        mAllOffersListModel=allOffersListModel;
        if(mAllOffersListModel!=null)
        {
            allOffersListList=mAllOffersListModel.getAllOffersList();
        }
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_all_offers,parent,false);
        AllOffersViewHolder allOffersViewHolder=new AllOffersViewHolder(view);
        return allOffersViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        AllOffersViewHolder allOffersViewHolder=(AllOffersViewHolder) holder;

        allOffersViewHolder.tvStart.setText(allOffersListList.get(position).getStartTime());
        allOffersViewHolder.tvEnd.setText(allOffersListList.get(position).getEndTime());
        allOffersViewHolder.tvTitle.setText(allOffersListList.get(position).getTitle());
        allOffersViewHolder.tvDesc.setText(allOffersListList.get(position).getDescription());
        allOffersViewHolder.tvUrl.setText(allOffersListList.get(position).getUrl());
        allOffersViewHolder.tvCategory.setText(allOffersListList.get(position).getCategory());
        allOffersViewHolder.tvAvailability.setText(allOffersListList.get(position).getAvailability());
        allOffersViewHolder.tvUrl1.setText(allOffersListList.get(position).getImageUrls().get(0).getUrl());
        allOffersViewHolder.tvReso1.setText(allOffersListList.get(position).getImageUrls().get(0).getResolutionType());
        allOffersViewHolder.tvUrl2.setText(allOffersListList.get(position).getImageUrls().get(1).getUrl());
        allOffersViewHolder.tvReso2.setText(allOffersListList.get(position).getImageUrls().get(1).getResolutionType());
        allOffersViewHolder.tvUrl3.setText(allOffersListList.get(position).getImageUrls().get(2).getUrl());
        allOffersViewHolder.tvReso3.setText(allOffersListList.get(position).getImageUrls().get(2).getResolutionType());
        allOffersViewHolder.tvUrl4.setText(allOffersListList.get(position).getImageUrls().get(3).getUrl());
        allOffersViewHolder.tvReso4.setText(allOffersListList.get(position).getImageUrls().get(3).getResolutionType());


    }

    @Override
    public int getItemCount() {
        return allOffersListList.size();
    }

    public class AllOffersViewHolder  extends RecyclerView.ViewHolder {
        TextView tvStart,tvEnd,tvTitle,tvDesc,tvUrl,tvCategory,tvAvailability,tvUrl1,tvUrl2,tvUrl3,tvUrl4,tvReso1,tvReso2,tvReso3,tvReso4;
        public AllOffersViewHolder(View itemView) {
            super(itemView);

            tvStart=itemView.findViewById(R.id.tv_start_time_ao);
            tvEnd=itemView.findViewById(R.id.tv_end_time_ao);
            tvTitle=itemView.findViewById(R.id.tv_title_ao);
            tvDesc=itemView.findViewById(R.id.tv_description_ao);
            tvAvailability=itemView.findViewById(R.id.tv_availability_ao);
            tvUrl=itemView.findViewById(R.id.tv_url_ao);
            tvCategory=itemView.findViewById(R.id.tv_category_ao);
            tvUrl1=itemView.findViewById(R.id.tv_url1_ao);
            tvReso1=itemView.findViewById(R.id.tv_resolutionType1_ao);
            tvUrl2=itemView.findViewById(R.id.tv_url2_ao);
            tvReso2=itemView.findViewById(R.id.tv_resolutionType2_ao);
            tvUrl3=itemView.findViewById(R.id.tv_url3_ao);
            tvReso3=itemView.findViewById(R.id.tv_resolutionType3_ao);
            tvUrl4=itemView.findViewById(R.id.tv_url4_ao);
            tvReso4=itemView.findViewById(R.id.tv_resolutionType4_ao);
        }
    }
}

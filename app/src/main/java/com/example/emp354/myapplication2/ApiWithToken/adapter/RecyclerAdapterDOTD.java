package com.example.emp354.myapplication2.ApiWithToken.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.emp354.myapplication2.ApiWithToken.POJOdotd.DModel;
import com.example.emp354.myapplication2.ApiWithToken.POJOdotd.DataModel;
import com.example.emp354.myapplication2.R;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapterDOTD extends RecyclerView.Adapter {

    private Context mContext;
    private DataModel mDataModel;
    private List<DModel> dModelList=new ArrayList<>();
    private int size;

    public RecyclerAdapterDOTD(Context context,DataModel dataModel)
    {
        mContext=context;
        mDataModel=dataModel;
        if(mDataModel!=null)
        {
            dModelList=dataModel.getDotdList();
            size=dModelList.size();
        }
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_dotd,parent,false);
        DotdHolder dotdHolder=new DotdHolder(view);
        return dotdHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        DotdHolder dotdHolder=(DotdHolder) holder;


            dotdHolder.tvTitle.setText(dModelList.get(position).getTitle());
            dotdHolder.tvDesc.setText(dModelList.get(position).getDescription());
            dotdHolder.tvUrl.setText(dModelList.get(position).getUrl());
            dotdHolder.tvAvailability.setText(dModelList.get(position).getAvailability());
            dotdHolder.tvUrl1.setText(dModelList.get(position).getImageUrls().get(0).getUrl());
            dotdHolder.tvReso1.setText(dModelList.get(position).getImageUrls().get(0).getResolutionType());
            dotdHolder.tvUrl2.setText(dModelList.get(position).getImageUrls().get(1).getUrl());
            dotdHolder.tvReso2.setText(dModelList.get(position).getImageUrls().get(1).getResolutionType());
            dotdHolder.tvUrl3.setText(dModelList.get(position).getImageUrls().get(2).getUrl());
            dotdHolder.tvReso3.setText(dModelList.get(position).getImageUrls().get(2).getResolutionType());
            dotdHolder.tvUrl4.setText(dModelList.get(position).getImageUrls().get(3).getUrl());
            dotdHolder.tvReso4.setText(dModelList.get(position).getImageUrls().get(3).getResolutionType());



    }

    @Override
    public int getItemCount() {
        return dModelList.size();
    }

    public class DotdHolder extends RecyclerView.ViewHolder
    {
        TextView tvTitle,tvDesc,tvUrl,tvAvailability,tvUrl1,tvUrl2,tvUrl3,tvUrl4,tvReso1,tvReso2,tvReso3,tvReso4;

        public DotdHolder(View itemView) {
            super(itemView);
            tvTitle=itemView.findViewById(R.id.tv_title_dotd);
            tvDesc=itemView.findViewById(R.id.tv_description_dotd);
            tvAvailability=itemView.findViewById(R.id.tv_availability_dotd);
            tvUrl=itemView.findViewById(R.id.tv_url_dotd);

            tvUrl1=itemView.findViewById(R.id.tv_url1_dotd);
            tvReso1=itemView.findViewById(R.id.tv_resolutionType1_dotd);
            tvUrl2=itemView.findViewById(R.id.tv_url2_dotd);
            tvReso2=itemView.findViewById(R.id.tv_resolutionType2_dotd);
            tvUrl3=itemView.findViewById(R.id.tv_url3_dotd);
            tvReso3=itemView.findViewById(R.id.tv_resolutionType3_dotd);
            tvUrl4=itemView.findViewById(R.id.tv_url4_dotd);
            tvReso4=itemView.findViewById(R.id.tv_resolutionType4_dotd);
        }
    }
}

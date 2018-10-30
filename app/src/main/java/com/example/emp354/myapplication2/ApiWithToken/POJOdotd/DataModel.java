package com.example.emp354.myapplication2.ApiWithToken.POJOdotd;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

public class DataModel implements Parcelable {

    private List<DModel> dotdList;


    public List<DModel> getDotdList() {
        return dotdList;
    }

    public void setDotdList(List<DModel> dotdList) {
        this.dotdList = dotdList;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.dotdList);
    }

    public DataModel() {
    }

    protected DataModel(Parcel in) {
        this.dotdList = new ArrayList<DModel>();
        in.readList(this.dotdList, DModel.class.getClassLoader());
    }

    public static final Parcelable.Creator<DataModel> CREATOR = new Parcelable.Creator<DataModel>() {
        @Override
        public DataModel createFromParcel(Parcel source) {
            return new DataModel(source);
        }

        @Override
        public DataModel[] newArray(int size) {
            return new DataModel[size];
        }
    };
}

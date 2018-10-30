package com.example.emp354.myapplication2.ApiWithToken.POJOalloffers;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

public class AllOffersListModel implements Parcelable {

    private List<AllOffersList> allOffersList;


    public List<AllOffersList> getAllOffersList() {
        return allOffersList;
    }

    public void setAllOffersList(List<AllOffersList> allOffersList) {
        this.allOffersList = allOffersList;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedList(this.allOffersList);
    }

    public AllOffersListModel() {
    }

    protected AllOffersListModel(Parcel in) {
        this.allOffersList = in.createTypedArrayList(AllOffersList.CREATOR);
    }

    public static final Parcelable.Creator<AllOffersListModel> CREATOR = new Parcelable.Creator<AllOffersListModel>() {
        @Override
        public AllOffersListModel createFromParcel(Parcel source) {
            return new AllOffersListModel(source);
        }

        @Override
        public AllOffersListModel[] newArray(int size) {
            return new AllOffersListModel[size];
        }
    };
}

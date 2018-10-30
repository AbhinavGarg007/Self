package com.example.emp354.myapplication2.ApiWithToken.POJOalloffers;

import android.os.Parcel;
import android.os.Parcelable;

public class ImageUrls implements Parcelable {
    private String url;
    private String resolutionType;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getResolutionType() {
        return resolutionType;
    }

    public void setResolutionType(String resolutionType) {
        this.resolutionType = resolutionType;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.url);
        dest.writeString(this.resolutionType);
    }

    public ImageUrls() {
    }

    protected ImageUrls(Parcel in) {
        this.url = in.readString();
        this.resolutionType = in.readString();
    }

    public static final Parcelable.Creator<ImageUrls> CREATOR = new Parcelable.Creator<ImageUrls>() {
        @Override
        public ImageUrls createFromParcel(Parcel source) {
            return new ImageUrls(source);
        }

        @Override
        public ImageUrls[] newArray(int size) {
            return new ImageUrls[size];
        }
    };
}

package com.example.emp354.myapplication2.ApiWithToken.POJOdotd;

import android.os.Parcel;
import android.os.Parcelable;

public class ImageUrl implements Parcelable {

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

    public ImageUrl() {
    }

    protected ImageUrl(Parcel in) {
        this.url = in.readString();
        this.resolutionType = in.readString();
    }

    public static final Parcelable.Creator<ImageUrl> CREATOR = new Parcelable.Creator<ImageUrl>() {
        @Override
        public ImageUrl createFromParcel(Parcel source) {
            return new ImageUrl(source);
        }

        @Override
        public ImageUrl[] newArray(int size) {
            return new ImageUrl[size];
        }
    };
}

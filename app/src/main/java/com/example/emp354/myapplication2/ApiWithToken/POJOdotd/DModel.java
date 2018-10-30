package com.example.emp354.myapplication2.ApiWithToken.POJOdotd;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

public class DModel implements Parcelable {

   private String title;
   private String description;
   private String url;
   private List<ImageUrl> imageUrls;
   private String availability;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<ImageUrl> getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(List<ImageUrl> imageUrls) {
        this.imageUrls = imageUrls;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeString(this.url);
        dest.writeList(this.imageUrls);
        dest.writeString(this.availability);
    }

    public DModel() {
    }

    protected DModel(Parcel in) {
        this.title = in.readString();
        this.description = in.readString();
        this.url = in.readString();
        this.imageUrls = new ArrayList<ImageUrl>();
        in.readList(this.imageUrls, ImageUrl.class.getClassLoader());
        this.availability = in.readString();
    }

    public static final Parcelable.Creator<DModel> CREATOR = new Parcelable.Creator<DModel>() {
        @Override
        public DModel createFromParcel(Parcel source) {
            return new DModel(source);
        }

        @Override
        public DModel[] newArray(int size) {
            return new DModel[size];
        }
    };
}

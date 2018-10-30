package com.example.emp354.myapplication2.ApiWithToken.POJOalloffers;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

public class AllOffersList implements Parcelable {

    private String startTime;
    private String endTime;
    private String title;
    private String description;
    private String url;
    private String category;
    private List<ImageUrls> imageUrls;
    private String availability;

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<ImageUrls> getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(List<ImageUrls> imageUrls) {
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
        dest.writeString(this.startTime);
        dest.writeString(this.endTime);
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeString(this.url);
        dest.writeString(this.category);
        dest.writeTypedList(this.imageUrls);
        dest.writeString(this.availability);
    }

    public AllOffersList() {
    }

    protected AllOffersList(Parcel in) {
        this.startTime = in.readString();
        this.endTime = in.readString();
        this.title = in.readString();
        this.description = in.readString();
        this.url = in.readString();
        this.category = in.readString();
        this.imageUrls = in.createTypedArrayList(ImageUrls.CREATOR);
        this.availability = in.readString();
    }

    public static final Parcelable.Creator<AllOffersList> CREATOR = new Parcelable.Creator<AllOffersList>() {
        @Override
        public AllOffersList createFromParcel(Parcel source) {
            return new AllOffersList(source);
        }

        @Override
        public AllOffersList[] newArray(int size) {
            return new AllOffersList[size];
        }
    };
}

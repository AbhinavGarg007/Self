package com.example.emp354.myapplication2.ApiWithToken.POJOSearchQuery;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CategorySpecificInfoV1 {
    @SerializedName("keySpecs")
    @Expose
    private List<String> keySpecs = null;
    @SerializedName("detailedSpecs")
    @Expose
    private List<String> detailedSpecs = null;
    @SerializedName("specificationList")
    @Expose
    private List<SpecificationList> specificationList = null;
    @SerializedName("booksInfo")
    @Expose
    private BooksInfo booksInfo;
    @SerializedName("lifeStyleInfo")
    @Expose
    private LifeStyleInfo lifeStyleInfo;

    public List<String> getKeySpecs() {
        return keySpecs;
    }

    public void setKeySpecs(List<String> keySpecs) {
        this.keySpecs = keySpecs;
    }

    public List<String> getDetailedSpecs() {
        return detailedSpecs;
    }

    public void setDetailedSpecs(List<String> detailedSpecs) {
        this.detailedSpecs = detailedSpecs;
    }

    public List<SpecificationList> getSpecificationList() {
        return specificationList;
    }

    public void setSpecificationList(List<SpecificationList> specificationList) {
        this.specificationList = specificationList;
    }

    public BooksInfo getBooksInfo() {
        return booksInfo;
    }

    public void setBooksInfo(BooksInfo booksInfo) {
        this.booksInfo = booksInfo;
    }

    public LifeStyleInfo getLifeStyleInfo() {
        return lifeStyleInfo;
    }

    public void setLifeStyleInfo(LifeStyleInfo lifeStyleInfo) {
        this.lifeStyleInfo = lifeStyleInfo;
    }

}

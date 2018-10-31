package com.example.emp354.myapplication2.ApiWithToken.POJOSearchQuery;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ProductBaseInfoV1 {
    @SerializedName("productId")
    @Expose
    private String productId;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("productDescription")
    @Expose
    private String productDescription;
    @SerializedName("imageUrls")
    @Expose
    private ImageUrls imageUrls;
    @SerializedName("productFamily")
    @Expose
    private List<String> productFamily = null;
    @SerializedName("maximumRetailPrice")
    @Expose
    private MaximumRetailPrice maximumRetailPrice;
    @SerializedName("flipkartSellingPrice")
    @Expose
    private FlipkartSellingPrice flipkartSellingPrice;
    @SerializedName("flipkartSpecialPrice")
    @Expose
    private FlipkartSpecialPrice flipkartSpecialPrice;
    @SerializedName("productUrl")
    @Expose
    private String productUrl;
    @SerializedName("productBrand")
    @Expose
    private String productBrand;
    @SerializedName("inStock")
    @Expose
    private Boolean inStock;
    @SerializedName("codAvailable")
    @Expose
    private Boolean codAvailable;
    @SerializedName("discountPercentage")
    @Expose
    private Double discountPercentage;
    @SerializedName("offers")
    @Expose
    private List<String> offers = null;
    @SerializedName("categoryPath")
    @Expose
    private String categoryPath;
    @SerializedName("attributes")
    @Expose
    private Attributes attributes;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public ImageUrls getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(ImageUrls imageUrls) {
        this.imageUrls = imageUrls;
    }

    public List<String> getProductFamily() {
        return productFamily;
    }

    public void setProductFamily(List<String> productFamily) {
        this.productFamily = productFamily;
    }

    public MaximumRetailPrice getMaximumRetailPrice() {
        return maximumRetailPrice;
    }

    public void setMaximumRetailPrice(MaximumRetailPrice maximumRetailPrice) {
        this.maximumRetailPrice = maximumRetailPrice;
    }

    public FlipkartSellingPrice getFlipkartSellingPrice() {
        return flipkartSellingPrice;
    }

    public void setFlipkartSellingPrice(FlipkartSellingPrice flipkartSellingPrice) {
        this.flipkartSellingPrice = flipkartSellingPrice;
    }

    public FlipkartSpecialPrice getFlipkartSpecialPrice() {
        return flipkartSpecialPrice;
    }

    public void setFlipkartSpecialPrice(FlipkartSpecialPrice flipkartSpecialPrice) {
        this.flipkartSpecialPrice = flipkartSpecialPrice;
    }

    public String getProductUrl() {
        return productUrl;
    }

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public Boolean getInStock() {
        return inStock;
    }

    public void setInStock(Boolean inStock) {
        this.inStock = inStock;
    }

    public Boolean getCodAvailable() {
        return codAvailable;
    }

    public void setCodAvailable(Boolean codAvailable) {
        this.codAvailable = codAvailable;
    }

    public Double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(Double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public List<String> getOffers() {
        return offers;
    }

    public void setOffers(List<String> offers) {
        this.offers = offers;
    }

    public String getCategoryPath() {
        return categoryPath;
    }

    public void setCategoryPath(String categoryPath) {
        this.categoryPath = categoryPath;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }
}

package com.example.emp354.myapplication2.ApiWithToken.POJOProductFeed;

public class ProductBaseInfo {
    private ProductIdentifier productIdentifier;
    private ProductAttributes productAttributes;
    private ProductShippingBaseInfo productShippingBaseInfo;
    private String offset;

    public ProductIdentifier getProductIdentifier() {
        return productIdentifier;
    }

    public void setProductIdentifier(ProductIdentifier productIdentifier) {
        this.productIdentifier = productIdentifier;
    }

    public ProductAttributes getProductAttributes() {
        return productAttributes;
    }

    public void setProductAttributes(ProductAttributes productAttributes) {
        this.productAttributes = productAttributes;
    }

    public ProductShippingBaseInfo getProductShippingBaseInfo() {
        return productShippingBaseInfo;
    }

    public void setProductShippingBaseInfo(ProductShippingBaseInfo productShippingBaseInfo) {
        this.productShippingBaseInfo = productShippingBaseInfo;
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }
}

package com.example.testapidethayhung.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ListProduct {
    @SerializedName("products")
    private List<Product> listProduct;

    public List<Product> getListProduct() {
        return listProduct;
    }
}

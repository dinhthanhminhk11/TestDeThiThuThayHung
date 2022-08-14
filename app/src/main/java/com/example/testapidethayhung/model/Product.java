package com.example.testapidethayhung.model;

import com.google.gson.annotations.SerializedName;

public class Product {
    @SerializedName("pid")
    private int pid;
    @SerializedName("name")
    private String name;
    @SerializedName("price")
    private double price;
    @SerializedName("created_at")
    private String created_at;
    @SerializedName("updated_at")
    private String updated_at;

    public int getPid() {
        return pid;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCreated_at() {
        return created_at;
    }


    public String getUpdated_at() {
        return updated_at;
    }

}

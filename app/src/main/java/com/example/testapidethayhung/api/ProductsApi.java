package com.example.testapidethayhung.api;


import com.example.testapidethayhung.model.ListProduct;
import com.example.testapidethayhung.model.Product;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ProductsApi {
    @GET("mob403lab4/getall.json")
    Call<ListProduct> getProduct(
            @Query("fbclid") String fbclid
    );
}

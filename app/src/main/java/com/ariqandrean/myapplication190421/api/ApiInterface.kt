package com.ariqandrean.myapplication190421.api

import com.ariqandrean.myapplication190421.model.CategoryModel
import retrofit2.Call
import retrofit2.http.*

interface ApiInterface {
    @GET("/api/v1/categories")
    fun getCategory(): Call<ArrayList<CategoryModel>>
}
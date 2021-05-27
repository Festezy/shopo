package com.ariqandrean.myapplication190421.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiClient {
    var BASE_URL: String = "https://ariqa.teknisitik.com"
    var retrofit: Retrofit? = null

    fun getApiClient(): Retrofit?{
        if (retrofit == null){
            retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create()).build()
        }
        return retrofit
    }
}
package com.example.myapplication12.api

import com.example.myapplication12.model.ResponceWebView
import retrofit2.Response


class Repository {

    suspend fun setParametersPhone(phone_name:String,locale:String,unique:String): Response<ResponceWebView> {
        return RetrofitInstance.api.setPostParametersPhone(phone_name, locale, unique)
    }

}
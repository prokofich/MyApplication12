package com.example.myapplication12.model.api

import com.example.myapplication12.model.ResponceWebView
import retrofit2.Response


class Repository {

    suspend fun setParametersPhone(phoneName:String,locale:String,unique:String): Response<ResponceWebView> {
        return RetrofitInstance.api.setPostParametersPhone(phoneName, locale, unique)
    }

}
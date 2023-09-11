package com.example.myapplication12.api

import com.example.myapplication12.model.ResponceWebView
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST


interface ApiService {

    @FormUrlEncoded
    @POST("splash.php")
    suspend fun setPostParametersPhone(
        @Field("phone_name") phone_name:String,
        @Field("locale") locale:String,
        @Field("unique") unique:String
    ): Response<ResponceWebView>

}
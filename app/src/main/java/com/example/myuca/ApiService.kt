package com.example.myuca

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("buendia.php")
    fun getPosts():Call<MutableList<PostModel>>
}
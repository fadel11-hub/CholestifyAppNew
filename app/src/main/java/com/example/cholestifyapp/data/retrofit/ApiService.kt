package com.example.cholestifyapp.data.retrofit


import com.example.cholestifyapp.data.response.FoodResponse
import com.example.cholestifyapp.ui.login.LoginRequest
import com.example.cholestifyapp.ui.login.LoginResponse
import com.example.cholestifyapp.ui.register.RegisterRequest
import com.example.cholestifyapp.ui.register.RegisterResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {
    @GET("food")
    fun getAllFood(): Call<FoodResponse>

    @POST("login")
    fun login(@Body request: LoginRequest): Call<LoginResponse>

    @POST("/register")
    fun register(@Body request: RegisterRequest): Call<RegisterResponse>
}
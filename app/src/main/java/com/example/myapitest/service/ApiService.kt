package com.example.myapitest.service
import retrofit2.http.GET
import com.example.myapitest.model.Car

interface ApiService {
    @GET("cars")
    suspend fun getCars(): List<Car>
}
package com.example.myapitest.service
import retrofit2.http.GET
import com.example.myapitest.model.Car
import com.example.myapitest.model.RetrieveCar
import retrofit2.http.DELETE
import retrofit2.http.Path

interface ApiService {
    @GET("car")
    suspend fun getCars(): List<Car>

    @GET("car/{id}")
    suspend fun retrieveCar(@Path("id") id: String): RetrieveCar

    @DELETE("cars/{id}")
    suspend fun deleteItem(@Path("id") id: String)
}
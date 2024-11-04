package com.example.myapitest.model

data class Car(
    val id: String
    //val value: CarValue
)
data class CarValue(
    val id: String,
    val value: Car
)

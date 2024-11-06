package com.example.myapitest.model

data class Car(
    var id: String,
    val imageUrl: String,
    val year: String,
    val name: String,
    val licence: String,
   // val place: Place
)

data class RetrieveCar(
    var id: String,
    var value: Car
)

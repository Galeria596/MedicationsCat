package com.galeria.model

data class Medication(
    val id: String,
    val name: String,
    val form: String,
    val stockCount: Double?,
    val measureUnit: String,
    val drugClass: String
)

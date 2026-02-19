package com.galeria.model

import java.time.Instant

data class User(
    val id: String,
    val name: String,
    val email: String,
    val birthDate: Instant,
    val gender: String,
    val heightCm: Double?,
    val weightKg: Double?,
)

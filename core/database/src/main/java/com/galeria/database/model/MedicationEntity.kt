package com.galeria.database.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.galeria.common.MedicationForm
import java.util.UUID

@Entity(tableName = "medication")
data class MedicationEntity(
    @PrimaryKey
    val id: String = UUID.randomUUID().toString(),
    val name: String,
    val form: MedicationForm,
    val stockCount: Double?,
    val measureUnit: String,
    val drugClass: String
)

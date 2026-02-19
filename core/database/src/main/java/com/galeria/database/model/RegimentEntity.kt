package com.galeria.database.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.galeria.common.FrequencyType
import java.time.Instant
import java.util.UUID

@Entity(tableName = "regiment")
data class RegimentEntity(
    @PrimaryKey
    val id: String = UUID.randomUUID().toString(),
    val medicationId: String,
    val startDate: Instant,
    val endDate: Instant?,
    val frequencyType: FrequencyType,
    val frequencyDetails: String?,
    val timeSlots: List<Int>,
    val dosage: Double,
)

package com.galeria.database.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.galeria.common.IntakeStatus
import java.time.Instant
import java.util.UUID

@Entity(tableName = "intake")
data class IntakeEntity(
    @PrimaryKey
    val id: String = UUID.randomUUID().toString(),
    val regimentId: String,
    val actualTime: Instant,
    val status: IntakeStatus = IntakeStatus.PENDING,
)

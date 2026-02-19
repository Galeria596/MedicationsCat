package com.galeria.model

import com.galeria.common.IntakeStatus
import java.time.Instant

data class Intake(
    val id: String,
    val regimentId: String,
    val actualTime: Instant,
    val status: IntakeStatus,
)




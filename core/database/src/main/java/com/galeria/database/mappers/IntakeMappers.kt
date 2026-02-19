package com.galeria.database.mappers

import com.galeria.database.model.IntakeEntity
import com.galeria.model.Intake

fun IntakeEntity.toDomain() = Intake(
    id = id,
    regimentId = regimentId,
    actualTime = actualTime,
    status = status
)

fun Intake.toEntity() = IntakeEntity(
    id = id,
    regimentId = regimentId,
    actualTime = actualTime,
    status = status
)
package com.galeria.database.mappers

import com.galeria.database.model.RegimentEntity
import com.galeria.model.Regiment

fun RegimentEntity.toDomain(): Regiment = Regiment(
    id = this.id,
    medicationId = this.medicationId,
    startDate = this.startDate,
    endDate = this.endDate,
    frequencyType = this.frequencyType,
    frequencyDetails = this.frequencyDetails,
    timeSlots = this.timeSlots,
    dosage = this.dosage,
)

fun Regiment.toEntity(): RegimentEntity = RegimentEntity(
    id = this.id,
    medicationId = this.medicationId,
    startDate = this.startDate,
    endDate = this.endDate,
    frequencyType = this.frequencyType,
    frequencyDetails = this.frequencyDetails,
    timeSlots = this.timeSlots,
    dosage = this.dosage,
)
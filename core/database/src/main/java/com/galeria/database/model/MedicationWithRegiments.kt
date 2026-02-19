package com.galeria.database.model

import androidx.room.Embedded
import androidx.room.Relation

data class MedicationWithRegiments(
    @Embedded
    val medication: MedicationEntity,
    @Relation(
        parentColumn = "id",
        entityColumn = "medicationId"
    )
    val regiments: List<RegimentEntity>
)

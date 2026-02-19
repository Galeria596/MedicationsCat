package com.galeria.database.mappers

import com.galeria.common.MedicationForm
import com.galeria.database.model.MedicationEntity
import com.galeria.model.Medication

fun MedicationEntity.toDomain() = Medication(
    id = id,
    name = name,
    form = form.name,
    stockCount = stockCount,
    measureUnit = measureUnit,
    drugClass = drugClass
)

fun Medication.toEntity() = MedicationEntity(
    id = id,
    name = name,
    form = MedicationForm.valueOf(form),
    stockCount = stockCount,
    measureUnit = measureUnit,
    drugClass = drugClass
)
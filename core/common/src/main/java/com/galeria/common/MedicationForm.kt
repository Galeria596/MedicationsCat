package com.galeria.common

enum class MedicationForm {
    TABLET,
    CAPSULE,
    SYRUP,
    INJECTION,
    UNKNOWN,
    LIQUID,
    POWDER;

    companion object {

        fun safelyFrom(value: String): MedicationForm =
            entries.find { it.name.equals(value, ignoreCase = true) } ?: UNKNOWN
    }
}
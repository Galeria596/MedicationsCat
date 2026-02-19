package com.galeria.model
import com.galeria.common.FrequencyType
import java.time.Instant


data class Regiment(
    val id: String,
    val medicationId: String,
    val startDate: Instant,
    val endDate: Instant?,
    val frequencyType: FrequencyType,
    val frequencyDetails: String?,
    val timeSlots: List<Int>,
    val dosage: Double,
)

/*
enum class FrequencyType {

    DAILY,
    SPECIFIC_DAYS,
    INTERVAL;

    companion object {

        fun safeValueOf(value: String): FrequencyType =
            runCatching { valueOf(value) }.getOrDefault(DAILY)
    }
}*/

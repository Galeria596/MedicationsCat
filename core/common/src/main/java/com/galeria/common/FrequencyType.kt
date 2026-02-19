package com.galeria.common

enum class FrequencyType {
    DAILY,
    SPECIFIC_DAYS,
    INTERVAL;

    companion object {

        fun safeValueOf(value: String): FrequencyType =
            runCatching { FrequencyType.valueOf(value) }.getOrDefault(DAILY)
    }
}
package com.galeria.database.util

import androidx.room.TypeConverter

class IntListConverter {
    @TypeConverter
    fun fromIntList(list: List<Int>?): String? {
        return list?.joinToString(separator = ",")
    }

    @TypeConverter
    fun toIntList(data: String?): List<Int>? {
        if (data.isNullOrEmpty()) {
            return emptyList()
        }

        return data.split(",")
            .mapNotNull { it.toIntOrNull() }
    }
}
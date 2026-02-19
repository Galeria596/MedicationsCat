package com.galeria.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.galeria.database.dao.IntakeDao
import com.galeria.database.dao.MedicationDao
import com.galeria.database.dao.MedicationRegimentDao
import com.galeria.database.dao.RegimentDao
import com.galeria.database.model.IntakeEntity
import com.galeria.database.model.MedicationEntity
import com.galeria.database.model.RegimentEntity
import com.galeria.database.util.DateConverters
import com.galeria.database.util.IntListConverter

@Database(
    entities = [
        MedicationEntity::class,
        IntakeEntity::class,
        RegimentEntity::class,
    ],
    version = 1,
    exportSchema = false
)
@TypeConverters(DateConverters::class, IntListConverter::class)
abstract class AppDatabase : RoomDatabase() {

    abstract val medicationDao: MedicationDao
    abstract val intakeDao: IntakeDao
    abstract val regimentDao: RegimentDao
    abstract val medicationRegimentDao: MedicationRegimentDao


}
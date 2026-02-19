package com.galeria.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.galeria.database.model.MedicationEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface MedicationDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMedication(medication: MedicationEntity)

    @Delete
    suspend fun deleteMedication(medication: MedicationEntity)

    @Update
    suspend fun updateMedication(medication: MedicationEntity)

    @Query("SELECT * FROM medication WHERE id = :medicationId")
    suspend fun getMedicationById(medicationId: String): MedicationEntity?

    @Query("SELECT * FROM medication")
    fun getAllMedications(): Flow<List<MedicationEntity>>

}


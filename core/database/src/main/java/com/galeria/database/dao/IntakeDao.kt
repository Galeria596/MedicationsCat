package com.galeria.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.galeria.database.model.IntakeEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface IntakeDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertIntake(intake: IntakeEntity)

    @Query("SELECT * FROM intake WHERE id = :medicationId")
    suspend fun getIntakeByMedicationId(medicationId: String): IntakeEntity

    @Query("SELECT * FROM intake")
    fun getAllIntakes(): Flow<List<IntakeEntity>>

    @Delete
    suspend fun deleteIntake(intake: IntakeEntity)

    @Update
    suspend fun updateIntake(intake: IntakeEntity)

}
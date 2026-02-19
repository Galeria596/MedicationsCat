package com.galeria.database.dao

import androidx.room.Dao
import androidx.room.Query
import com.galeria.database.model.MedicationWithRegiments
import kotlinx.coroutines.flow.Flow

@Dao
interface MedicationRegimentDao {

    @Query("SELECT * FROM medication WHERE id = :medicationId")
    suspend fun getMedicationWithRegiments(medicationId: String): MedicationWithRegiments?

    @Query("SELECT * FROM medication WHERE id = :medicationId")
    fun getMedicationWithRegimentsFlow(medicationId: String): Flow<MedicationWithRegiments?>

    @Query("SELECT * FROM medication")
    suspend fun getAllMedicationsWithRegiments(): List<MedicationWithRegiments>

    @Query("SELECT * FROM medication")
    fun getAllMedicationsWithRegimentsFlow(): Flow<List<MedicationWithRegiments>>
}
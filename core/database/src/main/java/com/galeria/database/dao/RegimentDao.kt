package com.galeria.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.galeria.database.model.RegimentEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface RegimentDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRegiment(regiment: RegimentEntity)

    @Query("SELECT * FROM regiment")
    fun getAllRegiments(): Flow<List<RegimentEntity>>

    @Query("SELECT * FROM regiment WHERE id = :regimentId")
    suspend fun getRegimentById(regimentId: String): RegimentEntity

    @Delete
    suspend fun deleteRegiment(regiment: RegimentEntity)

    @Update
    suspend fun updateRegiment(regiment: RegimentEntity)

}
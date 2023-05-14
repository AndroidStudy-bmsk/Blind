package org.bmsk.blind.data.source.local.dao

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.Companion.REPLACE
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import org.bmsk.blind.data.model.entity.ContentEntity

interface ContentDAO {
    @Query("SELECT * FROM Content ORDER BY createdDate DESC")
    fun selectAll(): Flow<List<ContentEntity>>

    @Delete
    suspend fun delete(item: ContentEntity)

    @Insert(onConflict = REPLACE)
    suspend fun insert(item: ContentEntity)

    @Insert(onConflict = REPLACE)
    suspend fun insertAll(items: List<ContentEntity>)
}

package org.bmsk.blind.data.source.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import org.bmsk.blind.data.model.entity.ContentEntity
import org.bmsk.blind.data.source.local.dao.ContentDAO

@Database(entities = [ContentEntity::class], version = 1)   // 여러 개가 있을 경우, 모두 지정 해 주어야 한다.
@TypeConverters(DateConverter::class)   // 이 부분을 지정하면 앱 데이터베이스 안에 들어가는 모든 DAO들이 영향을 받는다.
abstract class AppDatabase: RoomDatabase() {
    abstract fun contentDAO(): ContentDAO
}
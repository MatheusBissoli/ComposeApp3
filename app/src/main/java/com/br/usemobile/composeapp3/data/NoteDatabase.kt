package com.br.usemobile.composeapp3.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.br.usemobile.composeapp3.model.Note
import com.br.usemobile.composeapp3.util.DateConverter
import com.br.usemobile.composeapp3.util.UUIDConverter

@Database(entities = [Note::class], version = 1, exportSchema = false)
@TypeConverters(DateConverter::class, UUIDConverter::class)
abstract class NoteDatabase : RoomDatabase() {
    abstract fun noteDao() : NoteDatabaseDao

}
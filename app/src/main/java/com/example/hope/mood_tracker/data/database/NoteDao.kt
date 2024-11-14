package com.example.hope.mood_tracker.data.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {

    @Query("SELECT * FROM note WHERE userId = :userId")
    fun getNotes(userId: String): Flow<List<Note>>

//    @Query("SELECT * FROM note WHERE id = :id")
//    suspend fun getNoteById(id : Int) : Note?

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertNote(note: Note): Long

    @Delete
    suspend fun deleteNote(note: Note)

    @Update
    suspend fun update(note: Note)

    @Query("DELETE FROM note")
    suspend fun deleteAllNotes()
}
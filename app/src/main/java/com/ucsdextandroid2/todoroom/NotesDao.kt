package com.ucsdextandroid2.todoroom

import androidx.lifecycle.LiveData
import androidx.paging.DataSource
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

/**
 * Created by rjaylward on 2019-07-05
 */

@Dao

interface NotesDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertNotes(note: Note)

    @Delete
    fun deleteNotes(note: Note)

    @Query("SELECT * FROM   notes")
    fun geAllNotes(): List<Note>

    @Query("SELECT * FROM   notes ORDER BY datetime DESC")
    fun geAllNotesLiveData(): LiveData<List<Note>>
}

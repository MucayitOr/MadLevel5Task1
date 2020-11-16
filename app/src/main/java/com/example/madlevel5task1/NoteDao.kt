package com.example.madlevel5task1

import android.provider.ContactsContract
import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface NoteDao {

    @Insert
    suspend fun insertNote(note: ContactsContract.CommonDataKinds.Note)

    @Query("SELECT * FROM NoteTable LIMIT 1")
    fun getNotepad(): LiveData<ContactsContract.CommonDataKinds.Note?>

    @Update
    suspend fun updateNote(note: ContactsContract.CommonDataKinds.Note)

}

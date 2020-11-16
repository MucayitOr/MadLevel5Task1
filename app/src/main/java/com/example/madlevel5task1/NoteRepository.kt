package com.example.madlevel5task1

import android.content.Context
import android.provider.ContactsContract
import androidx.lifecycle.LiveData

class NoteRepository(context: Context) {

    private val noteDao: NoteDao

    init {
        val database = NotepadRoomDatabase.getDatabase(context)
        noteDao = database!!.noteDao()
    }

    fun getNotepad(): LiveData<ContactsContract.CommonDataKinds.Note?> {
        return noteDao.getNotepad()
    }

    suspend fun updateNotepad(note: ContactsContract.CommonDataKinds.Note) {
        noteDao.updateNote(note)
    }

}

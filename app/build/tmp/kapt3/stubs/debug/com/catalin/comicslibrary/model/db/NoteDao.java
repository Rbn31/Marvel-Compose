package com.catalin.comicslibrary.model.db;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\'J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\u000bH\'J\u001c\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\u000b2\u0006\u0010\u0007\u001a\u00020\bH\'J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u000f"}, d2 = {"Lcom/catalin/comicslibrary/model/db/NoteDao;", "", "addNote", "", "note", "Lcom/catalin/comicslibrary/model/db/DbNote;", "deleteAllNotes", "characterId", "", "deleteNote", "getAllNotes", "Lkotlinx/coroutines/flow/Flow;", "", "getNotes", "updateNote", "app_debug"})
public abstract interface NoteDao {
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM note_table ORDER BY id")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.catalin.comicslibrary.model.db.DbNote>> getAllNotes();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM note_table WHERE characterId = :characterId ORDER BY id ASC")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.catalin.comicslibrary.model.db.DbNote>> getNotes(int characterId);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract void addNote(@org.jetbrains.annotations.NotNull
    com.catalin.comicslibrary.model.db.DbNote note);
    
    @androidx.room.Update
    public abstract void updateNote(@org.jetbrains.annotations.NotNull
    com.catalin.comicslibrary.model.db.DbNote note);
    
    @androidx.room.Delete
    public abstract void deleteNote(@org.jetbrains.annotations.NotNull
    com.catalin.comicslibrary.model.db.DbNote note);
    
    @androidx.room.Query(value = "DELETE FROM note_table WHERE characterId = :characterId")
    public abstract void deleteAllNotes(int characterId);
}
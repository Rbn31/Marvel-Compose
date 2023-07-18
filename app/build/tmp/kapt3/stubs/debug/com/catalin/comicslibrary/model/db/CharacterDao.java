package com.catalin.comicslibrary.model.db;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\t\u001a\u00020\nH\'J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\bH\'J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u000e"}, d2 = {"Lcom/catalin/comicslibrary/model/db/CharacterDao;", "", "addCharacter", "", "character", "Lcom/catalin/comicslibrary/model/db/DbCharacter;", "deleteCharacter", "getCharacter", "Lkotlinx/coroutines/flow/Flow;", "characterId", "", "getCharacters", "", "updateCharacter", "app_debug"})
public abstract interface CharacterDao {
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM character_table ORDER BY id ASC")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.catalin.comicslibrary.model.db.DbCharacter>> getCharacters();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM character_table WHERE id = :characterId")
    public abstract kotlinx.coroutines.flow.Flow<com.catalin.comicslibrary.model.db.DbCharacter> getCharacter(int characterId);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract void addCharacter(@org.jetbrains.annotations.NotNull
    com.catalin.comicslibrary.model.db.DbCharacter character);
    
    @androidx.room.Update
    public abstract void updateCharacter(@org.jetbrains.annotations.NotNull
    com.catalin.comicslibrary.model.db.DbCharacter character);
    
    @androidx.room.Delete
    public abstract void deleteCharacter(@org.jetbrains.annotations.NotNull
    com.catalin.comicslibrary.model.db.DbCharacter character);
}
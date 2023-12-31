package com.catalin.comicslibrary.model.db;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\r\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00100\u000fH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00100\u000fH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J%\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0019\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/catalin/comicslibrary/model/db/CollectionDbRepo;", "", "addCharacterToRepo", "", "character", "Lcom/catalin/comicslibrary/model/db/DbCharacter;", "(Lcom/catalin/comicslibrary/model/db/DbCharacter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addNotesToRepo", "note", "Lcom/catalin/comicslibrary/model/db/DbNote;", "(Lcom/catalin/comicslibrary/model/db/DbNote;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllNotes", "deleteCharacterFromRepo", "deleteNoteFromRepo", "getAllNotes", "Lkotlinx/coroutines/flow/Flow;", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCharacterFromRepo", "characterId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCharactersFromRepo", "getNotesFromRepo", "updateCharacterInRepo", "updatenoteInRepo", "app_debug"})
public abstract interface CollectionDbRepo {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getCharactersFromRepo(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<com.catalin.comicslibrary.model.db.DbCharacter>>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getCharacterFromRepo(int characterId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.catalin.comicslibrary.model.db.DbCharacter>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object addCharacterToRepo(@org.jetbrains.annotations.NotNull
    com.catalin.comicslibrary.model.db.DbCharacter character, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object updateCharacterInRepo(@org.jetbrains.annotations.NotNull
    com.catalin.comicslibrary.model.db.DbCharacter character, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteCharacterFromRepo(@org.jetbrains.annotations.NotNull
    com.catalin.comicslibrary.model.db.DbCharacter character, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getAllNotes(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<com.catalin.comicslibrary.model.db.DbNote>>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getNotesFromRepo(int characterId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<com.catalin.comicslibrary.model.db.DbNote>>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object addNotesToRepo(@org.jetbrains.annotations.NotNull
    com.catalin.comicslibrary.model.db.DbNote note, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object updatenoteInRepo(@org.jetbrains.annotations.NotNull
    com.catalin.comicslibrary.model.db.DbNote note, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteNoteFromRepo(@org.jetbrains.annotations.NotNull
    com.catalin.comicslibrary.model.db.DbNote note, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteAllNotes(@org.jetbrains.annotations.NotNull
    com.catalin.comicslibrary.model.db.DbCharacter character, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}
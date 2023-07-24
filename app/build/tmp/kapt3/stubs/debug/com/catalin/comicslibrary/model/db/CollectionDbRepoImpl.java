package com.catalin.comicslibrary.model.db;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\u0012\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00150\u0014H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u001d\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00150\u0014H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J%\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00150\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\u001e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001f"}, d2 = {"Lcom/catalin/comicslibrary/model/db/CollectionDbRepoImpl;", "Lcom/catalin/comicslibrary/model/db/CollectionDbRepo;", "characterDao", "Lcom/catalin/comicslibrary/model/db/CharacterDao;", "noteDao", "Lcom/catalin/comicslibrary/model/db/NoteDao;", "(Lcom/catalin/comicslibrary/model/db/CharacterDao;Lcom/catalin/comicslibrary/model/db/NoteDao;)V", "addCharacterToRepo", "", "character", "Lcom/catalin/comicslibrary/model/db/DbCharacter;", "(Lcom/catalin/comicslibrary/model/db/DbCharacter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addNotesToRepo", "note", "Lcom/catalin/comicslibrary/model/db/DbNote;", "(Lcom/catalin/comicslibrary/model/db/DbNote;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllNotes", "deleteCharacterFromRepo", "deleteNoteFromRepo", "getAllNotes", "Lkotlinx/coroutines/flow/Flow;", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCharacterFromRepo", "characterId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCharactersFromRepo", "getNotesFromRepo", "updateCharacterInRepo", "updatenoteInRepo", "app_debug"})
public final class CollectionDbRepoImpl implements com.catalin.comicslibrary.model.db.CollectionDbRepo {
    private final com.catalin.comicslibrary.model.db.CharacterDao characterDao = null;
    private final com.catalin.comicslibrary.model.db.NoteDao noteDao = null;
    
    public CollectionDbRepoImpl(@org.jetbrains.annotations.NotNull
    com.catalin.comicslibrary.model.db.CharacterDao characterDao, @org.jetbrains.annotations.NotNull
    com.catalin.comicslibrary.model.db.NoteDao noteDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getCharactersFromRepo(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<com.catalin.comicslibrary.model.db.DbCharacter>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getCharacterFromRepo(int characterId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.catalin.comicslibrary.model.db.DbCharacter>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object addCharacterToRepo(@org.jetbrains.annotations.NotNull
    com.catalin.comicslibrary.model.db.DbCharacter character, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object updateCharacterInRepo(@org.jetbrains.annotations.NotNull
    com.catalin.comicslibrary.model.db.DbCharacter character, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object deleteCharacterFromRepo(@org.jetbrains.annotations.NotNull
    com.catalin.comicslibrary.model.db.DbCharacter character, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getAllNotes(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<com.catalin.comicslibrary.model.db.DbNote>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getNotesFromRepo(int characterId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<com.catalin.comicslibrary.model.db.DbNote>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object addNotesToRepo(@org.jetbrains.annotations.NotNull
    com.catalin.comicslibrary.model.db.DbNote note, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object updatenoteInRepo(@org.jetbrains.annotations.NotNull
    com.catalin.comicslibrary.model.db.DbNote note, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object deleteNoteFromRepo(@org.jetbrains.annotations.NotNull
    com.catalin.comicslibrary.model.db.DbNote note, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object deleteAllNotes(@org.jetbrains.annotations.NotNull
    com.catalin.comicslibrary.model.db.DbCharacter character, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}
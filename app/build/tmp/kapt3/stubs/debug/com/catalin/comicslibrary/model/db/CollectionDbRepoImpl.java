package com.catalin.comicslibrary.model.db;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00110\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/catalin/comicslibrary/model/db/CollectionDbRepoImpl;", "Lcom/catalin/comicslibrary/model/db/CollectionDbRepo;", "characterDao", "Lcom/catalin/comicslibrary/model/db/CharacterDao;", "(Lcom/catalin/comicslibrary/model/db/CharacterDao;)V", "addCharacterToRepo", "", "character", "Lcom/catalin/comicslibrary/model/db/DbCharacter;", "(Lcom/catalin/comicslibrary/model/db/DbCharacter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteCharacterFromRepo", "getCharacterFromRepo", "Lkotlinx/coroutines/flow/Flow;", "characterId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCharactersFromRepo", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateCharacterInRepo", "app_debug"})
public final class CollectionDbRepoImpl implements com.catalin.comicslibrary.model.db.CollectionDbRepo {
    private final com.catalin.comicslibrary.model.db.CharacterDao characterDao = null;
    
    public CollectionDbRepoImpl(@org.jetbrains.annotations.NotNull
    com.catalin.comicslibrary.model.db.CharacterDao characterDao) {
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
}
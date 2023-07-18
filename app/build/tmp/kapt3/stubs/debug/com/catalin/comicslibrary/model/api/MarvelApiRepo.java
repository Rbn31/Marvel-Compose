package com.catalin.comicslibrary.model.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0002\u0010\u0014J\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0017"}, d2 = {"Lcom/catalin/comicslibrary/model/api/MarvelApiRepo;", "", "api", "Lcom/catalin/comicslibrary/model/api/MarvelApi;", "(Lcom/catalin/comicslibrary/model/api/MarvelApi;)V", "characterDetails", "Landroidx/compose/runtime/MutableState;", "Lcom/catalin/comicslibrary/model/CharacterResult;", "getCharacterDetails", "()Landroidx/compose/runtime/MutableState;", "characters", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/catalin/comicslibrary/model/api/NetworkResult;", "Lcom/catalin/comicslibrary/model/CharactersApiResponse;", "getCharacters", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getSingleCharacter", "", "id", "", "(Ljava/lang/Integer;)V", "query", "", "app_debug"})
public final class MarvelApiRepo {
    private final com.catalin.comicslibrary.model.api.MarvelApi api = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.catalin.comicslibrary.model.api.NetworkResult<com.catalin.comicslibrary.model.CharactersApiResponse>> characters = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<com.catalin.comicslibrary.model.CharacterResult> characterDetails = null;
    
    public MarvelApiRepo(@org.jetbrains.annotations.NotNull
    com.catalin.comicslibrary.model.api.MarvelApi api) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<com.catalin.comicslibrary.model.api.NetworkResult<com.catalin.comicslibrary.model.CharactersApiResponse>> getCharacters() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<com.catalin.comicslibrary.model.CharacterResult> getCharacterDetails() {
        return null;
    }
    
    public final void query(@org.jetbrains.annotations.NotNull
    java.lang.String query) {
    }
    
    public final void getSingleCharacter(@org.jetbrains.annotations.Nullable
    java.lang.Integer id) {
    }
}
package com.catalin.comicslibrary.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011J\b\u0010\u001d\u001a\u00020\u001bH\u0002J\u000e\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0011H\u0002R\u0019\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015\u00a8\u0006$"}, d2 = {"Lcom/catalin/comicslibrary/viewmodel/LibraryApiViewModel;", "Landroidx/lifecycle/ViewModel;", "repo", "Lcom/catalin/comicslibrary/model/api/MarvelApiRepo;", "connectivityMonitor", "Lcom/catalin/comicslibrary/model/connectivity/ConnectivityMonitor;", "(Lcom/catalin/comicslibrary/model/api/MarvelApiRepo;Lcom/catalin/comicslibrary/model/connectivity/ConnectivityMonitor;)V", "characterDetails", "Landroidx/compose/runtime/MutableState;", "Lcom/catalin/comicslibrary/model/CharacterResult;", "getCharacterDetails", "()Landroidx/compose/runtime/MutableState;", "networkAvailable", "getNetworkAvailable", "()Lcom/catalin/comicslibrary/model/connectivity/ConnectivityMonitor;", "queryInput", "Lkotlinx/coroutines/channels/Channel;", "", "queryText", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getQueryText", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "result", "Lcom/catalin/comicslibrary/model/api/NetworkResult;", "Lcom/catalin/comicslibrary/model/CharactersApiResponse;", "getResult", "onQueryupdate", "", "input", "retrieveCharacters", "retrieveSingleCharacter", "id", "", "validateQuery", "", "query", "app_debug"})
public final class LibraryApiViewModel extends androidx.lifecycle.ViewModel {
    private final com.catalin.comicslibrary.model.api.MarvelApiRepo repo = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.catalin.comicslibrary.model.api.NetworkResult<com.catalin.comicslibrary.model.CharactersApiResponse>> result = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> queryText = null;
    private final kotlinx.coroutines.channels.Channel<java.lang.String> queryInput = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<com.catalin.comicslibrary.model.CharacterResult> characterDetails = null;
    @org.jetbrains.annotations.NotNull
    private final com.catalin.comicslibrary.model.connectivity.ConnectivityMonitor networkAvailable = null;
    
    @javax.inject.Inject
    public LibraryApiViewModel(@org.jetbrains.annotations.NotNull
    com.catalin.comicslibrary.model.api.MarvelApiRepo repo, @org.jetbrains.annotations.NotNull
    com.catalin.comicslibrary.model.connectivity.ConnectivityMonitor connectivityMonitor) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<com.catalin.comicslibrary.model.api.NetworkResult<com.catalin.comicslibrary.model.CharactersApiResponse>> getResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getQueryText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<com.catalin.comicslibrary.model.CharacterResult> getCharacterDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.catalin.comicslibrary.model.connectivity.ConnectivityMonitor getNetworkAvailable() {
        return null;
    }
    
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.FlowPreview.class})
    private final void retrieveCharacters() {
    }
    
    private final boolean validateQuery(java.lang.String query) {
        return false;
    }
    
    public final void onQueryupdate(@org.jetbrains.annotations.NotNull
    java.lang.String input) {
    }
    
    public final void retrieveSingleCharacter(int id) {
    }
}
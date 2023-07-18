package com.catalin.comicslibrary.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bJ\b\u0010\t\u001a\u00020\u000eH\u0002J\u0015\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0002\u0010\u0015R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/catalin/comicslibrary/viewmodel/CollectionDbViewModel;", "Landroidx/lifecycle/ViewModel;", "repo", "Lcom/catalin/comicslibrary/model/db/CollectionDbRepo;", "(Lcom/catalin/comicslibrary/model/db/CollectionDbRepo;)V", "collection", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/catalin/comicslibrary/model/db/DbCharacter;", "getCollection", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "currentCharacter", "getCurrentCharacter", "addCharacter", "", "character", "Lcom/catalin/comicslibrary/model/CharacterResult;", "deleteCharacter", "setCurrentCharacterId", "characterId", "", "(Ljava/lang/Integer;)V", "app_debug"})
public final class CollectionDbViewModel extends androidx.lifecycle.ViewModel {
    private final com.catalin.comicslibrary.model.db.CollectionDbRepo repo = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.catalin.comicslibrary.model.db.DbCharacter> currentCharacter = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.catalin.comicslibrary.model.db.DbCharacter>> collection = null;
    
    @javax.inject.Inject
    public CollectionDbViewModel(@org.jetbrains.annotations.NotNull
    com.catalin.comicslibrary.model.db.CollectionDbRepo repo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<com.catalin.comicslibrary.model.db.DbCharacter> getCurrentCharacter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.catalin.comicslibrary.model.db.DbCharacter>> getCollection() {
        return null;
    }
    
    private final void getCollection() {
    }
    
    public final void setCurrentCharacterId(@org.jetbrains.annotations.Nullable
    java.lang.Integer characterId) {
    }
    
    public final void addCharacter(@org.jetbrains.annotations.NotNull
    com.catalin.comicslibrary.model.CharacterResult character) {
    }
    
    public final void deleteCharacter(@org.jetbrains.annotations.NotNull
    com.catalin.comicslibrary.model.db.DbCharacter character) {
    }
}
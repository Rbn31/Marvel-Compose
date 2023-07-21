package com.catalin.comicslibrary.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\bJ\u000e\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u000eJ\b\u0010\t\u001a\u00020\u0011H\u0002J\b\u0010\u000f\u001a\u00020\u0011H\u0002J\u0015\u0010\u0019\u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u00a2\u0006\u0002\u0010\u001cR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/catalin/comicslibrary/viewmodel/CollectionDbViewModel;", "Landroidx/lifecycle/ViewModel;", "repo", "Lcom/catalin/comicslibrary/model/db/CollectionDbRepo;", "(Lcom/catalin/comicslibrary/model/db/CollectionDbRepo;)V", "collection", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/catalin/comicslibrary/model/db/DbCharacter;", "getCollection", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "currentCharacter", "getCurrentCharacter", "notes", "Lcom/catalin/comicslibrary/model/db/DbNote;", "getNotes", "addCharacter", "", "character", "Lcom/catalin/comicslibrary/model/CharacterResult;", "addNote", "note", "Lcom/catalin/comicslibrary/model/Note;", "deleteCharacter", "deleteNote", "setCurrentCharacterId", "characterId", "", "(Ljava/lang/Integer;)V", "app_debug"})
public final class CollectionDbViewModel extends androidx.lifecycle.ViewModel {
    private final com.catalin.comicslibrary.model.db.CollectionDbRepo repo = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.catalin.comicslibrary.model.db.DbCharacter> currentCharacter = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.catalin.comicslibrary.model.db.DbCharacter>> collection = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.catalin.comicslibrary.model.db.DbNote>> notes = null;
    
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
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.catalin.comicslibrary.model.db.DbNote>> getNotes() {
        return null;
    }
    
    private final void getNotes() {
    }
    
    public final void addNote(@org.jetbrains.annotations.NotNull
    com.catalin.comicslibrary.model.Note note) {
    }
    
    public final void deleteNote(@org.jetbrains.annotations.NotNull
    com.catalin.comicslibrary.model.db.DbNote note) {
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
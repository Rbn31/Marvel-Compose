package com.catalin.comicslibrary;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ViewModelComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/catalin/comicslibrary/HiltModule;", "", "()V", "provideApiRepo", "Lcom/catalin/comicslibrary/model/api/MarvelApiRepo;", "provideCharacterDao", "Lcom/catalin/comicslibrary/model/db/CharacterDao;", "collectionDb", "Lcom/catalin/comicslibrary/model/db/CollectionDb;", "provideCollectionDb", "context", "Landroid/content/Context;", "provideDbRepoImpl", "Lcom/catalin/comicslibrary/model/db/CollectionDbRepo;", "characterDao", "noteDao", "Lcom/catalin/comicslibrary/model/db/NoteDao;", "provideNoteDao", "app_debug"})
@dagger.Module
public final class HiltModule {
    
    public HiltModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final com.catalin.comicslibrary.model.api.MarvelApiRepo provideApiRepo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final com.catalin.comicslibrary.model.db.CollectionDb provideCollectionDb(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final com.catalin.comicslibrary.model.db.CharacterDao provideCharacterDao(@org.jetbrains.annotations.NotNull
    com.catalin.comicslibrary.model.db.CollectionDb collectionDb) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final com.catalin.comicslibrary.model.db.NoteDao provideNoteDao(@org.jetbrains.annotations.NotNull
    com.catalin.comicslibrary.model.db.CollectionDb collectionDb) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final com.catalin.comicslibrary.model.db.CollectionDbRepo provideDbRepoImpl(@org.jetbrains.annotations.NotNull
    com.catalin.comicslibrary.model.db.CharacterDao characterDao, @org.jetbrains.annotations.NotNull
    com.catalin.comicslibrary.model.db.NoteDao noteDao) {
        return null;
    }
}
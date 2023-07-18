package com.catalin.comicslibrary;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lcom/catalin/comicslibrary/Destination;", "", "route", "", "(Ljava/lang/String;)V", "getRoute", "()Ljava/lang/String;", "CharacterDetail", "Collection", "Library", "Lcom/catalin/comicslibrary/Destination$Library;", "Lcom/catalin/comicslibrary/Destination$Collection;", "Lcom/catalin/comicslibrary/Destination$CharacterDetail;", "app_debug"})
public abstract class Destination {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String route = null;
    
    private Destination(java.lang.String route) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRoute() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/catalin/comicslibrary/Destination$Library;", "Lcom/catalin/comicslibrary/Destination;", "()V", "app_debug"})
    public static final class Library extends com.catalin.comicslibrary.Destination {
        @org.jetbrains.annotations.NotNull
        public static final com.catalin.comicslibrary.Destination.Library INSTANCE = null;
        
        private Library() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/catalin/comicslibrary/Destination$Collection;", "Lcom/catalin/comicslibrary/Destination;", "()V", "app_debug"})
    public static final class Collection extends com.catalin.comicslibrary.Destination {
        @org.jetbrains.annotations.NotNull
        public static final com.catalin.comicslibrary.Destination.Collection INSTANCE = null;
        
        private Collection() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/catalin/comicslibrary/Destination$CharacterDetail;", "Lcom/catalin/comicslibrary/Destination;", "()V", "createRoute", "", "characterId", "", "(Ljava/lang/Integer;)Ljava/lang/String;", "app_debug"})
    public static final class CharacterDetail extends com.catalin.comicslibrary.Destination {
        @org.jetbrains.annotations.NotNull
        public static final com.catalin.comicslibrary.Destination.CharacterDetail INSTANCE = null;
        
        private CharacterDetail() {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String createRoute(@org.jetbrains.annotations.Nullable
        java.lang.Integer characterId) {
            return null;
        }
    }
}
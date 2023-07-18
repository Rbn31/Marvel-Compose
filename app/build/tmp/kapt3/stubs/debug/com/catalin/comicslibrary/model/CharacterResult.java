package com.catalin.comicslibrary.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003Jh\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00c6\u0001\u00a2\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010)\u001a\u00020\u0003H\u00d6\u0001J\t\u0010*\u001a\u00020\u0005H\u00d6\u0001R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006+"}, d2 = {"Lcom/catalin/comicslibrary/model/CharacterResult;", "", "id", "", "name", "", "description", "resourceURI", "urls", "", "Lcom/catalin/comicslibrary/model/CharacterResultUrl;", "thumbnail", "Lcom/catalin/comicslibrary/model/CharacterThumbnail;", "comics", "Lcom/catalin/comicslibrary/model/CharacterComics;", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/catalin/comicslibrary/model/CharacterThumbnail;Lcom/catalin/comicslibrary/model/CharacterComics;)V", "getComics", "()Lcom/catalin/comicslibrary/model/CharacterComics;", "getDescription", "()Ljava/lang/String;", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getName", "getResourceURI", "getThumbnail", "()Lcom/catalin/comicslibrary/model/CharacterThumbnail;", "getUrls", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/catalin/comicslibrary/model/CharacterThumbnail;Lcom/catalin/comicslibrary/model/CharacterComics;)Lcom/catalin/comicslibrary/model/CharacterResult;", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class CharacterResult {
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer id = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String description = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String resourceURI = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.catalin.comicslibrary.model.CharacterResultUrl> urls = null;
    @org.jetbrains.annotations.Nullable
    private final com.catalin.comicslibrary.model.CharacterThumbnail thumbnail = null;
    @org.jetbrains.annotations.Nullable
    private final com.catalin.comicslibrary.model.CharacterComics comics = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.catalin.comicslibrary.model.CharacterResult copy(@org.jetbrains.annotations.Nullable
    java.lang.Integer id, @org.jetbrains.annotations.Nullable
    java.lang.String name, @org.jetbrains.annotations.Nullable
    java.lang.String description, @org.jetbrains.annotations.Nullable
    java.lang.String resourceURI, @org.jetbrains.annotations.Nullable
    java.util.List<com.catalin.comicslibrary.model.CharacterResultUrl> urls, @org.jetbrains.annotations.Nullable
    com.catalin.comicslibrary.model.CharacterThumbnail thumbnail, @org.jetbrains.annotations.Nullable
    com.catalin.comicslibrary.model.CharacterComics comics) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public CharacterResult(@org.jetbrains.annotations.Nullable
    java.lang.Integer id, @org.jetbrains.annotations.Nullable
    java.lang.String name, @org.jetbrains.annotations.Nullable
    java.lang.String description, @org.jetbrains.annotations.Nullable
    java.lang.String resourceURI, @org.jetbrains.annotations.Nullable
    java.util.List<com.catalin.comicslibrary.model.CharacterResultUrl> urls, @org.jetbrains.annotations.Nullable
    com.catalin.comicslibrary.model.CharacterThumbnail thumbnail, @org.jetbrains.annotations.Nullable
    com.catalin.comicslibrary.model.CharacterComics comics) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getResourceURI() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.catalin.comicslibrary.model.CharacterResultUrl> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.catalin.comicslibrary.model.CharacterResultUrl> getUrls() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.catalin.comicslibrary.model.CharacterThumbnail component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.catalin.comicslibrary.model.CharacterThumbnail getThumbnail() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.catalin.comicslibrary.model.CharacterComics component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.catalin.comicslibrary.model.CharacterComics getComics() {
        return null;
    }
}
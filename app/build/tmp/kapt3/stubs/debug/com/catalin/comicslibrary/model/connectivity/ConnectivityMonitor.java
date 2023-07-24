package com.catalin.comicslibrary.model.connectivity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/catalin/comicslibrary/model/connectivity/ConnectivityMonitor;", "Lcom/catalin/comicslibrary/model/connectivity/ConnectivityObservable;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "connectivityManager", "Landroid/net/ConnectivityManager;", "observe", "Lkotlinx/coroutines/flow/Flow;", "Lcom/catalin/comicslibrary/model/connectivity/ConnectivityObservable$Status;", "Companion", "app_debug"})
public final class ConnectivityMonitor implements com.catalin.comicslibrary.model.connectivity.ConnectivityObservable {
    @org.jetbrains.annotations.NotNull
    public static final com.catalin.comicslibrary.model.connectivity.ConnectivityMonitor.Companion Companion = null;
    private final android.net.ConnectivityManager connectivityManager = null;
    
    private ConnectivityMonitor(android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<com.catalin.comicslibrary.model.connectivity.ConnectivityObservable.Status> observe() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/catalin/comicslibrary/model/connectivity/ConnectivityMonitor$Companion;", "Lcom/catalin/comicslibrary/SingletonHolder;", "Lcom/catalin/comicslibrary/model/connectivity/ConnectivityMonitor;", "Landroid/content/Context;", "()V", "app_debug"})
    public static final class Companion extends com.catalin.comicslibrary.SingletonHolder<com.catalin.comicslibrary.model.connectivity.ConnectivityMonitor, android.content.Context> {
        
        private Companion() {
            super(null);
        }
    }
}
package com.catalin.comicslibrary.model.connectivity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0005J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lcom/catalin/comicslibrary/model/connectivity/ConnectivityObservable;", "", "observe", "Lkotlinx/coroutines/flow/Flow;", "Lcom/catalin/comicslibrary/model/connectivity/ConnectivityObservable$Status;", "Status", "app_debug"})
public abstract interface ConnectivityObservable {
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<com.catalin.comicslibrary.model.connectivity.ConnectivityObservable.Status> observe();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/catalin/comicslibrary/model/connectivity/ConnectivityObservable$Status;", "", "(Ljava/lang/String;I)V", "Available", "Unavailable", "app_debug"})
    public static enum Status {
        /*public static final*/ Available /* = new Available() */,
        /*public static final*/ Unavailable /* = new Unavailable() */;
        
        Status() {
        }
    }
}
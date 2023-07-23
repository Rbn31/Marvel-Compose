package com.catalin.comicslibrary.model.connectivity

import kotlinx.coroutines.flow.Flow
import javax.net.ssl.SSLEngineResult.Status

interface ConnectivityObservable {
    fun observe(): Flow<Status>

    enum class Status{
        Available,
        Unavailable
    }
}
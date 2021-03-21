package com.reo.running.yumemitask.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData

class Repository(private val remoteDataSource: RemoteDataSource = RemoteDataSource()) {
    fun getRepository(): LiveData<List<Github>?> {
        return liveData {
            val repos = remoteDataSource.getRepository()
            emit(repos)
        }
    }
}
package com.example.loginpasswordpro.data.localDatasource.SharedPref

import com.example.loginpasswordpro.data.localDatasource.dataModel.DataModel

interface SharedPref {
    suspend fun saveSharedPrefInstance(user:DataModel)
}
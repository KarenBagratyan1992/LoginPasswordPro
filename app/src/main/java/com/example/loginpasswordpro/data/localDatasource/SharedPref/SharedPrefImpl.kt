package com.example.loginpasswordpro.data.localDatasource.SharedPref

import android.content.Context
import android.util.Log
import com.example.loginpasswordpro.data.localDatasource.dataModel.DataModel



class SharedPrefImpl(context: Context):SharedPref {

 companion object{
     const val SHAREDPREF = "SHAREDPREF"
     const val KEY_EMAIL = "KEY_EMAIL"
     const val KEY_PASSWORD = "KEY_PASSWORD"

 }


   val sharedPref = context.getSharedPreferences(SHAREDPREF,Context.MODE_PRIVATE)

    override suspend fun saveSharedPrefInstance(user: DataModel) {
        val em = sharedPref.edit().putString(KEY_EMAIL,user.email).apply()
       val pass =  sharedPref.edit().putString(KEY_PASSWORD,user.password).apply()



    }
}
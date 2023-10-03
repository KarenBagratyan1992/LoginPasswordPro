package com.example.loginpasswordpro.domain


import android.util.Log
import com.example.loginpasswordpro.presenter.PresentModel

class SaveUseCase(val person: PresentModel) {
    fun execute():DomainModel{

        return DomainModel(email = person.email, password = person.password)



    }

}
package com.example.loginpasswordpro.data.localDatasource.repoImpl

import com.example.loginpasswordpro.data.localDatasource.dataModel.DataModel
import com.example.loginpasswordpro.domain.DomainModel
import com.example.loginpasswordpro.domain.Repo

class RepoImpl:Repo {
    override suspend fun saveUser(userDomainInstance: DomainModel) {
        DataModel(email = userDomainInstance.email, password = userDomainInstance.password)
    }
}
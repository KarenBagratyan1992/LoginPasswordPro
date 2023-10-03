package com.example.loginpasswordpro.domain

interface Repo {
    suspend fun saveUser(userDomainInstance:DomainModel)
}
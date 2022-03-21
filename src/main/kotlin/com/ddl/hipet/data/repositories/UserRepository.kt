package com.ddl.hipet.data.repositories

import com.ddl.hipet.data.models.UserData
import org.springframework.data.mongodb.repository.MongoRepository

interface UserRepository: MongoRepository<UserData, String> {

    fun findByName(name: String): UserData
}
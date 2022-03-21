package com.ddl.hipet.boundaries.controllers.dto

import com.ddl.hipet.services.dto.User

data class UserResponse(
    val user: User,
    val status: CreateUserResultStatusOptions

) {

    enum class CreateUserResultStatusOptions(val description: String) {
        Succes("SUCCESS"),
        RepositoryError("REPOSITORY_ERROR")
    }
}
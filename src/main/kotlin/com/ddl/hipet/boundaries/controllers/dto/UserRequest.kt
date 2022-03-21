package com.ddl.hipet.boundaries.controllers.dto

data class UserRequest(
    val name: String,
    val email: String,
    val password: String,
    val phoneNumber: String
)
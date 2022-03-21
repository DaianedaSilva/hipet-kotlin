package com.ddl.hipet.data.models

import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document(collection = "Users")
@EntityScan
data class UserData (
    @Id
    val id: String? = null,
    val name: String,
    val email: String,
    val password: String,
    val phoneNumber: String,
    val createdAt: LocalDateTime
)
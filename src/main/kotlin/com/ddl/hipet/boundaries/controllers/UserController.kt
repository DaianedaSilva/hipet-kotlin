package com.ddl.hipet.boundaries.controllers

import com.ddl.hipet.services.UserService
import com.ddl.hipet.boundaries.controllers.dto.UserRequest
import com.ddl.hipet.boundaries.controllers.dto.UserResponse
import com.ddl.hipet.data.models.UserData
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class UserController(
        private val userService: UserService
) {

    @GetMapping("/hello")
    fun hello(): String {
        return "Hello Leonarod"
    }

    @PostMapping("/createUser")
    fun createUser(
            @RequestBody userRequest: UserRequest
    ): ResponseEntity<UserResponse> {

        val response = userService.createUser(userRequest)

        return ResponseEntity(response, HttpStatus.OK)

    }



    @GetMapping("/findUser/{name}")
    fun findUser(
            @PathVariable name:String
    ): ResponseEntity<UserData>{

        val user = userService.findUser(name)
        return ResponseEntity(user, HttpStatus.OK)
    }

}
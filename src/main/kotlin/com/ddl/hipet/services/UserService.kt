package com.ddl.hipet.services


import com.ddl.hipet.data.repositories.UserRepository
import com.ddl.hipet.boundaries.controllers.dto.UserRequest
import com.ddl.hipet.boundaries.controllers.dto.UserResponse
import com.ddl.hipet.boundaries.controllers.dto.UserResponse.CreateUserResultStatusOptions
import com.ddl.hipet.data.models.UserData
import com.ddl.hipet.services.dto.User
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class UserService(
        private val userRepository: UserRepository
) {

    // com os dados passados no request, cria um usuário, salva no banco e retorna um status
    fun createUser(request: UserRequest):  UserResponse {
        val user = User( request.name, request.email, request.password, request.phoneNumber)
        saveUser(user)

        return UserResponse(user, CreateUserResultStatusOptions.Succes)
    }

    fun findUser(name: String): UserData{
        val user = userRepository.findByName(name);
        return user
    }

    private fun saveUser(user: User){
        userRepository.save(UserData(email = user.email, name =  user.name, password= user.password, phoneNumber= user.phoneNumber, createdAt = LocalDateTime.now()))
    }


}
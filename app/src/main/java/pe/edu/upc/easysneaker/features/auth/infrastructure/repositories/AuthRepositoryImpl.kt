package pe.edu.upc.easysneaker.features.auth.infrastructure.repositories

import pe.edu.upc.easysneaker.features.auth.domain.AuthRepository
import pe.edu.upc.easysneaker.features.auth.domain.User
import pe.edu.upc.easysneaker.features.auth.infrastructure.remote.AuthService
import pe.edu.upc.easysneaker.features.auth.infrastructure.remote.LoginRequestDto
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(private val service: AuthService) : AuthRepository {

    override suspend fun login(
        email: String,
        password: String
    ): Result<User> {
        try {
            val response = service.login(LoginRequestDto(email, password))

            if (response.isSuccessful) {
                response.body()?.let { dto ->
                    val user = User(
                        email = dto.email,
                        firstName = dto.fistName,
                        lastName = dto.lastName
                    )
                    return Result.success(user)
                }
            }
            return Result.failure(Exception(response.message()))

        } catch (e: Exception) {
            return Result.failure(e)
        }
    }
}
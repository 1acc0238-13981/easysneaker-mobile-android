package pe.edu.upc.easysneaker.features.auth.domain

interface AuthRepository {

    suspend fun login(email: String, password: String): Result<User>
}
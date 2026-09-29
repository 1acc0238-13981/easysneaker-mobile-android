package pe.edu.upc.easysneaker.features.auth.infrastructure.remote

data class LoginRequestDto(
    val email: String,
    val password: String
)

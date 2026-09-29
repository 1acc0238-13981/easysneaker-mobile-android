package pe.edu.upc.easysneaker.features.auth.infrastructure.remote

data class LoginResponseDto(
    val token: String,
    val email: String,
    val firstName: String,
    val lastName: String
)

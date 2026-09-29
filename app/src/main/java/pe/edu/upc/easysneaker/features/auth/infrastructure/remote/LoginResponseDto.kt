package pe.edu.upc.easysneaker.features.auth.infrastructure.remote

data class LoginResponseDto(
    val token: String,
    val email: String,
    val fistName: String,
    val lastName: String
)

package pe.edu.upc.easysneaker.features.auth.domain

data class AuthSession(
    val token: String,
    val user: User
)

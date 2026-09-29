package pe.edu.upc.easysneaker.features.auth.presentation.login

import pe.edu.upc.easysneaker.features.auth.domain.User

data class LoginUiState(
    val email: String = "",
    val password: String = "",
    val isHidden: Boolean = true,
    val isAuthenticated: Boolean = false,
    val user: User? = null,
    val isLoading: Boolean = false,
    val errorMessage: String? = null
)

package pe.edu.upc.easysneaker.features.cart.presentation

import pe.edu.upc.easysneaker.features.cart.domain.Cart

data class CartUiState (
    val isLoading: Boolean = false,
    val cart: Cart = Cart(emptyList()),
    val errorMessage: String? = null
)
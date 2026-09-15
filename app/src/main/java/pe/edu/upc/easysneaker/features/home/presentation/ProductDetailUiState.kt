package pe.edu.upc.easysneaker.features.home.presentation

import pe.edu.upc.easysneaker.features.home.domain.Product

sealed class ProductDetailUiState {
    object Loading : ProductDetailUiState()
    data class Success(val product: Product) : ProductDetailUiState()
    data class Error(val message: String) : ProductDetailUiState()
}

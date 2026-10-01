package pe.edu.upc.easysneaker.features.cart.infrastructure.remote

data class CartItemDto(
    val productId: Int,
    val name: String,
    val brand: String,
    val price: Double,
    val currency: String,
    val image: String,
    val size: Int,
    val quantity: Int
)

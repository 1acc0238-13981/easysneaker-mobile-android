package pe.edu.upc.easysneaker.features.cart.domain

data class CartItem(
    val productId: Int,
    val name: String,
    val brand: String,
    val price: String,
    val image: String,
    val quantity: Int,
    val size: Int
)

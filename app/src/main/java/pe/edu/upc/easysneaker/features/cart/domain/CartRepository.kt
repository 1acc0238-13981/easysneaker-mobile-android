package pe.edu.upc.easysneaker.features.cart.domain

interface CartRepository {

    suspend fun getCart(): Result<Cart>
}
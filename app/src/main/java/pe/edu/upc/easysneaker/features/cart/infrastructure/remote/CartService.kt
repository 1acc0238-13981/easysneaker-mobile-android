package pe.edu.upc.easysneaker.features.cart.infrastructure.remote

import retrofit2.Response
import retrofit2.http.GET

interface CartService {

    @GET("cart")
    suspend fun getCart(): Response<CartDto>
}
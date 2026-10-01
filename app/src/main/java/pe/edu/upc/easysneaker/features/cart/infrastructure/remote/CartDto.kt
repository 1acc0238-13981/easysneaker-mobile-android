package pe.edu.upc.easysneaker.features.cart.infrastructure.remote

import com.google.gson.annotations.SerializedName

data class CartDto(
    @SerializedName("count")
    val count: Int,
    @SerializedName("results")
    val cartItems: List<CartItemDto>
)

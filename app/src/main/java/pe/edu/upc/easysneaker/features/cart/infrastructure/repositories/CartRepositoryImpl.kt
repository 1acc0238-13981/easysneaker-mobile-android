package pe.edu.upc.easysneaker.features.cart.infrastructure.repositories

import pe.edu.upc.easysneaker.features.cart.domain.Cart
import pe.edu.upc.easysneaker.features.cart.domain.CartItem
import pe.edu.upc.easysneaker.features.cart.domain.CartRepository
import pe.edu.upc.easysneaker.features.cart.infrastructure.remote.CartService
import javax.inject.Inject

class CartRepositoryImpl @Inject constructor(private val service: CartService) : CartRepository {
    override suspend fun getCart(): Result<Cart> {
        try {
            val response = service.getCart()
            if (response.isSuccessful) {
                response.body()?.let { cartDto ->
                    val cart = Cart(
                        cartItems = cartDto.cartItems.map { cartItemDto ->
                            CartItem(
                                productId = cartItemDto.productId,
                                name = cartItemDto.name,
                                quantity = cartItemDto.quantity,
                                price = cartItemDto.price,
                                image = cartItemDto.image,
                                brand = cartItemDto.brand,
                                size = cartItemDto.size

                            )
                        }
                    )
                    return Result.success(cart)
                }
            }
            return Result.failure(Exception(response.message()))

        } catch (exception: Exception) {
            return Result.failure(exception)
        }
    }
}
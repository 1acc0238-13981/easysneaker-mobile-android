package pe.edu.upc.easysneaker.features.cart.application

import pe.edu.upc.easysneaker.features.cart.domain.CartRepository
import javax.inject.Inject

class GetCartUseCase @Inject constructor(private val repository: CartRepository) {
    suspend operator fun invoke() = repository.getCart()
}
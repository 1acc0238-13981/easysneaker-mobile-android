package pe.edu.upc.easysneaker.features.home.application

import pe.edu.upc.easysneaker.features.home.domain.Product
import pe.edu.upc.easysneaker.features.home.domain.ProductRepository

class GetProductsUseCase(private val repository: ProductRepository) {

    operator fun invoke(): List<Product> = repository.getProducts()
}
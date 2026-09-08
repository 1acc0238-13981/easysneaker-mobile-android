package pe.edu.upc.easysneaker.features.home.application

import pe.edu.upc.easysneaker.features.home.domain.Product
import pe.edu.upc.easysneaker.features.home.domain.ProductRepository
import pe.edu.upc.easysneaker.features.home.infrastructure.InMemoryRepository

class GetProductsUseCase(private val repository: ProductRepository = InMemoryRepository()) {

    operator fun invoke(): List<Product> = repository.getProducts()
}
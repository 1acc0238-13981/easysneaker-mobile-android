package pe.edu.upc.easysneaker.features.home.application

import pe.edu.upc.easysneaker.features.home.domain.Product
import pe.edu.upc.easysneaker.features.home.domain.ProductRepository
import pe.edu.upc.easysneaker.features.home.infrastructure.repositories.InMemoryRepository
import pe.edu.upc.easysneaker.features.home.infrastructure.repositories.ProductRepositoryImpl

class GetProductsUseCase(private val repository: ProductRepository = ProductRepositoryImpl()) {

    suspend operator fun invoke(): List<Product> = repository.getProducts()
}
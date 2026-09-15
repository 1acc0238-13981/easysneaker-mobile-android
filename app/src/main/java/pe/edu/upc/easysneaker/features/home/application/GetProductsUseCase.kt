package pe.edu.upc.easysneaker.features.home.application

import pe.edu.upc.easysneaker.features.home.domain.Product
import pe.edu.upc.easysneaker.features.home.domain.ProductRepository
import pe.edu.upc.easysneaker.features.home.infrastructure.repositories.InMemoryRepository
import pe.edu.upc.easysneaker.features.home.infrastructure.repositories.ProductRepositoryImpl
import javax.inject.Inject

class GetProductsUseCase @Inject constructor(private val repository: ProductRepository) {

    suspend operator fun invoke(): List<Product> = repository.getProducts()
}
package pe.edu.upc.easysneaker.features.home.infrastructure.repositories

import pe.edu.upc.easysneaker.features.home.domain.Product
import pe.edu.upc.easysneaker.features.home.domain.ProductRepository
import pe.edu.upc.easysneaker.features.home.infrastructure.remote.ProductService

class ProductRepositoryImpl(private val service: ProductService): ProductRepository {

    override suspend fun getProducts(): List<Product> {

    }
}
package pe.edu.upc.easysneaker.features.home.domain

interface ProductRepository {
    suspend fun getProducts(): List<Product>
}
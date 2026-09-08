package pe.edu.upc.easysneaker.features.home.domain

interface ProductRepository {
    fun getProducts(): List<Product>
}
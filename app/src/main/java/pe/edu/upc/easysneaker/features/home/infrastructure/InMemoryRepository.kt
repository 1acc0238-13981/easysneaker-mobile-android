package pe.edu.upc.easysneaker.features.home.infrastructure

import pe.edu.upc.easysneaker.features.home.domain.Product
import pe.edu.upc.easysneaker.features.home.domain.ProductRepository

class InMemoryRepository : ProductRepository {
    private val products = listOf(
        Product(
            id = 1,
            name = "Product 1",
            price = 100.0,
            imageUrl = "https://i.imgur.com/E8ZBAnC.png"
        ),
        Product(
            id = 2,
            name = "Product 2",
            price = 150.0,
            imageUrl = "https://i.imgur.com/E8ZBAnC.png"
        )
    )

    override fun getProducts(): List<Product> {
        return products
    }

}
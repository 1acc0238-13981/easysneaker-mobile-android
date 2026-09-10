package pe.edu.upc.easysneaker.features.home.infrastructure.repositories

import kotlinx.coroutines.delay
import pe.edu.upc.easysneaker.features.home.domain.Product
import pe.edu.upc.easysneaker.features.home.domain.ProductRepository
import kotlin.time.Duration.Companion.milliseconds

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

    override suspend fun getProducts(): List<Product> {
        delay(2000.milliseconds)
        return products
    }

}
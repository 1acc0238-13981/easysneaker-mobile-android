package pe.edu.upc.easysneaker.features.home.infrastructure.repositories

import pe.edu.upc.easysneaker.features.home.domain.Product
import pe.edu.upc.easysneaker.features.home.domain.ProductRepository
import pe.edu.upc.easysneaker.features.home.infrastructure.remote.ProductService
import javax.inject.Inject

class ProductRepositoryImpl @Inject constructor(
    private val service: ProductService
) : ProductRepository {

    override suspend fun getProducts(): List<Product> {
        val response = service.getProducts()

        if (response.isSuccessful) {
            response.body()?.let { productsResponseDto ->
                return productsResponseDto.products.map { productDto ->
                    Product(
                        id = productDto.id,
                        name = productDto.name,
                        price = productDto.price,
                        imageUrl = productDto.image
                    )
                }.toList()
            }
        }
        return emptyList()
    }

    override suspend fun getProductById(id: Int): Product? {
        TODO("Not yet implemented")
    }
}
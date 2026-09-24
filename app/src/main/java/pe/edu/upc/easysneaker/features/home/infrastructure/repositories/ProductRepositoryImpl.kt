package pe.edu.upc.easysneaker.features.home.infrastructure.repositories

import pe.edu.upc.easysneaker.features.home.domain.Product
import pe.edu.upc.easysneaker.features.home.domain.ProductRepository
import pe.edu.upc.easysneaker.features.home.infrastructure.local.ProductDao
import pe.edu.upc.easysneaker.features.home.infrastructure.local.ProductEntity
import pe.edu.upc.easysneaker.features.home.infrastructure.remote.ProductService
import javax.inject.Inject

class ProductRepositoryImpl @Inject constructor(
    private val service: ProductService,
    private val dao: ProductDao
) : ProductRepository {

    override suspend fun getProducts(): List<Product> {

        try {
            val response = service.getProducts()

            if (response.isSuccessful) {
                response.body()?.let { productsResponseDto ->
                    val entities = productsResponseDto.products.map { productDto ->
                        ProductEntity(
                            id = productDto.id,
                            name = productDto.name,
                            price = productDto.price,
                            rating = productDto.rating,
                            image = productDto.image
                        )
                    }.toList()
                    dao.insertProducts(entities)
                }
            }
        } catch (e: Exception) {

        }

        return dao.fetchAllProducts().map { entity ->
            Product(
                id = entity.id,
                name = entity.name,
                price = entity.price,
                imageUrl = entity.image
            )
        }

    }

    override suspend fun getProductById(id: Int): Product? {
        try {
            val response = service.getProductById(id)

            if (response.isSuccessful) {
                response.body()?.let { productDto ->
                    return Product(
                        id = productDto.id,
                        name = productDto.name,
                        price = productDto.price,
                        imageUrl = productDto.image
                    )
                }
            }
        } catch (e: Exception) {
        }

        return null
    }
}
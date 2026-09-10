package pe.edu.upc.easysneaker.features.home.infrastructure.repositories

import pe.edu.upc.easysneaker.features.home.domain.Product
import pe.edu.upc.easysneaker.features.home.domain.ProductRepository
import pe.edu.upc.easysneaker.features.home.infrastructure.remote.ProductService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ProductRepositoryImpl(
    private val service: ProductService
    = Retrofit.Builder()
        .baseUrl("https://sneakerapi-y3ub.onrender.com/api/")
        .addConverterFactory(GsonConverterFactory.create())
        .build().create(ProductService::class.java)
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
}
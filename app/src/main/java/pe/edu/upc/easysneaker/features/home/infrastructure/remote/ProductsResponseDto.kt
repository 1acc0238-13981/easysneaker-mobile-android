package pe.edu.upc.easysneaker.features.home.infrastructure.remote

data class ProductsResponseDto(
    val count: Int,
    val products: List<ProductDto>
)

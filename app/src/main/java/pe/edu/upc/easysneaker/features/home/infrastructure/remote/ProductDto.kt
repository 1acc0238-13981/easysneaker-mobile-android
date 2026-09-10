package pe.edu.upc.easysneaker.features.home.infrastructure.remote

data class ProductDto(
    val id: Int,
    val name: String,
    val price: Double,
    val currency: String,
    val rating: Double,
    val description: String,
    val image: String
)

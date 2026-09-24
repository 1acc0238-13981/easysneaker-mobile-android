package pe.edu.upc.easysneaker.features.home.infrastructure.local

import androidx.room3.Dao
import androidx.room3.Query
import androidx.room3.Upsert
import pe.edu.upc.easysneaker.features.home.domain.Product


@Dao
interface ProductDao {

    @Query("select * from products")
    suspend fun fetchAllProducts(): List<ProductEntity>

    @Upsert
    suspend fun insertProducts(entities: List<ProductEntity>)

    @Query("select * from products where id = :id")
    suspend fun fetchProductById(id: Int): ProductEntity?

}
package pe.edu.upc.easysneaker.features.home.infrastructure.local

import androidx.room.Dao
import androidx.room.Query


@Dao
interface ProductDao {

    @Query("select * from products")
    suspend fun fetchAllProducts(): List<ProductEntity>
}
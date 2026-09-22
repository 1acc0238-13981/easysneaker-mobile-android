package pe.edu.upc.easysneaker.features.home.infrastructure.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "products")
data class ProductEntity(
    @PrimaryKey
    val id: Int,
    val name: String,
    val price: Double,
    val rating: Double,
    @ColumnInfo(name = "image_url")
    val image: String
)

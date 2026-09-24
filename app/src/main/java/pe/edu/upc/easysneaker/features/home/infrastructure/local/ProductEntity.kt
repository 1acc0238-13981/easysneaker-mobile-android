package pe.edu.upc.easysneaker.features.home.infrastructure.local

import androidx.room3.ColumnInfo
import androidx.room3.Entity
import androidx.room3.PrimaryKey


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

package pe.edu.upc.easysneaker.features.home.presentation.home.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import pe.edu.upc.easysneaker.features.home.domain.Product

@Composable
fun ProductList(
    modifier: Modifier = Modifier,
    products: List<Product>,
    onProductClick: (Product) -> Unit
) {
    LazyColumn(modifier = modifier.fillMaxSize()) {
        items(products) { product ->
            ProductCard(product = product) {
                onProductClick(product)
            }
        }

    }
}
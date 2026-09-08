package pe.edu.upc.easysneaker.features.home.presentation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import pe.edu.upc.easysneaker.features.home.domain.Product

@Composable
fun ProductList(modifier: Modifier = Modifier, products: List<Product>) {
    LazyColumn(modifier = modifier.fillMaxSize()) {
        items(products) { product ->
          ProductCard( product = product)
        }

    }
}
package pe.edu.upc.easysneaker.features.home.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import pe.edu.upc.easysneaker.features.home.domain.Product

@Composable
fun ProductList(modifier: Modifier = Modifier, products: List<Product>) {
    LazyColumn(modifier = modifier.fillMaxSize()) {
        items(products) { product ->
          ProductCard( product = product)
        }

    }
}
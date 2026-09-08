package pe.edu.upc.easysneaker.features.home.presentation

import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import pe.edu.upc.easysneaker.features.home.domain.Product
import pe.edu.upc.easysneaker.core.theme.EasySneakerTheme

@Composable
fun HomeScreen() {
    val products = listOf(
        Product(
            id = 1,
            name = "Product 1",
            price = 100.0,
            imageUrl = "https://i.imgur.com/E8ZBAnC.png"
        ),
        Product(
            id = 2,
            name = "Product 2",
            price = 150.0,
            imageUrl = "https://i.imgur.com/E8ZBAnC.png"
        )
    )

    LazyColumn {
        items(products) { product ->
            Card(modifier = Modifier.fillMaxWidth().padding(8.dp)) {
                Column (modifier = Modifier.padding(8.dp)){
                    AsyncImage(
                        model = product.imageUrl,
                        contentDescription = product.name,
                        modifier = Modifier.fillMaxWidth().height(200.dp))
                    Text(
                        text = product.name,
                        fontWeight = FontWeight.Bold,)

                    Text(
                        text = "$ ${product.price}"
                    )

                }
            }


        }

    }
}


@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    EasySneakerTheme {
        HomeScreen()
    }
}
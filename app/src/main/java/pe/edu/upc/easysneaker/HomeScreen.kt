package pe.edu.upc.easysneaker

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bumptech.glide.Glide
import pe.edu.upc.easysneaker.ui.theme.EasySneakerTheme

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
            Card (modifier = Modifier.padding(8.dp)) {
                Column {
                    
                    Text(text = product.name, modifier = Modifier.padding(8.dp))

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
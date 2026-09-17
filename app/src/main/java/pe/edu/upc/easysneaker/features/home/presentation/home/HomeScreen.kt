package pe.edu.upc.easysneaker.features.home.presentation.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel

import pe.edu.upc.easysneaker.core.designsystem.theme.EasySneakerTheme
import pe.edu.upc.easysneaker.features.home.domain.Product
import pe.edu.upc.easysneaker.features.home.presentation.home.components.ProductList

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    viewModel: HomeViewModel = hiltViewModel(),
    onProductClick: (Product) -> Unit

) {

    val state = viewModel.uiState.collectAsState().value

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.fillMaxSize()
    ) {
        when {
            state.products.isNotEmpty() -> {
                ProductList(
                    modifier = modifier,
                    products = state.products,
                    onProductClick = onProductClick
                )


            }

            state.isLoading -> {
                CircularProgressIndicator()
            }

            else -> {
                Text(text = "No products found")
            }
        }
    }


}


@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    EasySneakerTheme {
        HomeScreen(viewModel = hiltViewModel()) {}
    }
}
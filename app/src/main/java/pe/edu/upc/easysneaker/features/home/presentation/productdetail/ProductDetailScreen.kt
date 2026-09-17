package pe.edu.upc.easysneaker.features.home.presentation.productdetail

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import coil3.compose.AsyncImage
import pe.edu.upc.easysneaker.core.arrowBack


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProductDetailScreen(
    modifier: Modifier = Modifier,
    id: Int,
    viewModel: ProductDetailViewModel = hiltViewModel(),
    onBack: () -> Unit
) {
    val uiState = viewModel.uiState.collectAsState().value

    LaunchedEffect(id) {
        viewModel.loadProduct(id)
    }

    Scaffold(
        modifier = modifier,
        topBar = {
            TopAppBar(title = {}, navigationIcon = {
                IconButton(onClick = onBack) {
                    Icon(arrowBack, contentDescription = "back")
                }
            })
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier.padding(paddingValues)

        ) {
            when (uiState) {
                is ProductDetailUiState.Loading -> {
                    CircularProgressIndicator()
                }

                is ProductDetailUiState.Success -> {
                    AsyncImage(
                        model = uiState.product.imageUrl,
                        contentDescription = uiState.product.name,
                        modifier = Modifier.fillMaxWidth()
                    )
                }

                is ProductDetailUiState.Error -> {
                    Text(text = uiState.message)
                }
            }
        }
    }
}

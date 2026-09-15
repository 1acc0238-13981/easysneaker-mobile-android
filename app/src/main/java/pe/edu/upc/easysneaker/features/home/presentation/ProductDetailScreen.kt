package pe.edu.upc.easysneaker.features.home.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel


@Composable
fun ProductDetailScreen(
    modifier: Modifier = Modifier,
    id: Int,
    viewModel: ProductDetailViewModel = hiltViewModel(),
    onBack: () -> Unit
) {
    Scaffold(modifier = modifier) { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues)) {

        }
    }
}

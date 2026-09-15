package pe.edu.upc.easysneaker.features.home.presentation

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import pe.edu.upc.easysneaker.features.home.application.GetProductByIdUseCase
import javax.inject.Inject

@HiltViewModel
class ProductDetailViewModel @Inject constructor(private val getProductById: GetProductByIdUseCase) : ViewModel(){


}
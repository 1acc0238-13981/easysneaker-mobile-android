package pe.edu.upc.easysneaker.features.cart.presentation.cart

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import pe.edu.upc.easysneaker.features.cart.application.GetCartUseCase
import javax.inject.Inject

@HiltViewModel
data class CartViewModel @Inject constructor(private val getCart: GetCartUseCase) : ViewModel() {

    private val _state = MutableStateFlow(CartUiState())
    val state: StateFlow<CartUiState> = _state.asStateFlow()

    init {
        loadCart()
    }

    fun loadCart() {
        viewModelScope.launch(Dispatchers.IO) {

            _state.update { currentState ->
                currentState.copy(isLoading = true)
            }
            try {
                val result = getCart()

                result
                    .onSuccess { cart ->
                        _state.update { currentState ->
                            currentState.copy(
                                isLoading = false,
                                cart = cart,
                                errorMessage = null
                            )
                        }

                    }
                    .onFailure { exception ->
                        _state.update { currentState ->
                            currentState.copy(
                                isLoading = false,
                                errorMessage = exception.message
                            )
                        }

                    }
            } catch (exception: Exception) {
                _state.update { currentState ->
                    currentState.copy(
                        isLoading = false,
                        errorMessage = exception.message
                    )
                }
            }

        }

    }

}

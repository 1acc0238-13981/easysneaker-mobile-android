package pe.edu.upc.easysneaker.features.cart.presentation.cart.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import pe.edu.upc.easysneaker.features.cart.domain.CartItem

@Composable
fun CartItemCard(cartItem: CartItem) {
    Text(text = cartItem.name)
}
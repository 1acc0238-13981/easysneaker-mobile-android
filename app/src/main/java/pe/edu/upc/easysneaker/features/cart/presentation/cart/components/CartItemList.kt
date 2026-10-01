package pe.edu.upc.easysneaker.features.cart.presentation.cart.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import pe.edu.upc.easysneaker.features.cart.domain.CartItem

@Composable
fun CartItemList(
    cartItems: List<CartItem>
) {
    LazyColumn {
        items(cartItems) { cartItem ->
            CartItemCard(cartItem = cartItem)
        }
    }
}
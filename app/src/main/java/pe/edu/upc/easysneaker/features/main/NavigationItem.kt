package pe.edu.upc.easysneaker.features.main

import androidx.compose.ui.graphics.vector.ImageVector
import kotlinx.serialization.Serializable
import pe.edu.upc.easysneaker.core.designsystem.icon.home
import pe.edu.upc.easysneaker.core.designsystem.icon.shoppingCart
import pe.edu.upc.easysneaker.features.cart.presentation.navigation.CartNavGraphRoute
import pe.edu.upc.easysneaker.features.home.presentation.navigation.HomeNavGraphRoute

enum class NavigationItem (
    val route: @Serializable Any,
    val icon: ImageVector,
    val title: String
) {

    HOME(
        route = HomeNavGraphRoute,
        icon = home,
        title = "Home"
    ),
    CART(
        route = CartNavGraphRoute,
        icon = shoppingCart,
        title = "Cart"
    )
}
package pe.edu.upc.easysneaker.features.home.presentation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable

@Serializable
object HomeRoute

@Serializable
data class ProductDetailRoute(val id: Int)

fun NavGraphBuilder.homeNavGraph(navController: NavController) {


    composable<HomeRoute> {
        HomeScreen()
    }

    composable<ProductDetailRoute> {

    }
}
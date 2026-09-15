package pe.edu.upc.easysneaker.features.home.presentation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

fun NavGraphBuilder.homeNavGraph(navController: NavController) {

    composable("home") {
        HomeScreen()
    }

    composable("product_detail") {

    }
}
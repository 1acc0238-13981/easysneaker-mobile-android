package pe.edu.upc.easysneaker.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import pe.edu.upc.easysneaker.features.home.presentation.navigation.HomeRoute
import pe.edu.upc.easysneaker.features.home.presentation.navigation.homeNavGraph

@Composable
fun AppNavHost(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = HomeRoute
    ) {
        homeNavGraph(navController)
    }
}
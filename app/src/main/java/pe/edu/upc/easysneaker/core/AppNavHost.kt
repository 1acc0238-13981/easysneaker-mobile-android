package pe.edu.upc.easysneaker.core

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import pe.edu.upc.easysneaker.features.home.presentation.homeNavGraph

@Composable
fun AppNavHost(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        homeNavGraph(navController)
    }
}
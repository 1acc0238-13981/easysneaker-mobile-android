package pe.edu.upc.easysneaker.features.main

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import pe.edu.upc.easysneaker.features.cart.presentation.navigation.cartNavGraph
import pe.edu.upc.easysneaker.features.home.presentation.navigation.homeNavGraph


@Composable
fun MainScreen() {

    val mainNavController = rememberNavController()

    Scaffold(
        bottomBar = { MainNavigationBar(mainNavController) }
    ) { innerPadding ->
        NavHost(
            navController = mainNavController,
            startDestination = NavigationItem.entries.first().route,
            modifier = Modifier.padding(innerPadding)
        ) {
            homeNavGraph(navController = mainNavController)
            cartNavGraph(navController = mainNavController)
        }

    }
}
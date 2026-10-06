package pe.edu.upc.easysneaker.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import pe.edu.upc.easysneaker.features.auth.presentation.navigation.authNavGraph
import pe.edu.upc.easysneaker.features.main.mainNavGraph
import pe.edu.upc.easysneaker.features.onboarding.presentation.navigation.OnBoardingNavGraphRoute
import pe.edu.upc.easysneaker.features.onboarding.presentation.navigation.onBoardingNavGraph

@Composable
fun AppNavHost(navController: NavHostController) {

        NavHost(
            navController = navController,
            startDestination = OnBoardingNavGraphRoute) {
            onBoardingNavGraph(navController)
            authNavGraph(navController)
            mainNavGraph()

        }


}
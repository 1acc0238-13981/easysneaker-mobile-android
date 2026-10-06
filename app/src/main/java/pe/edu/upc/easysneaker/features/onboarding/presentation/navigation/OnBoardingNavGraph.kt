package pe.edu.upc.easysneaker.features.onboarding.presentation.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import kotlinx.serialization.Serializable
import pe.edu.upc.easysneaker.features.auth.presentation.navigation.AuthNavGraphRoute
import pe.edu.upc.easysneaker.features.onboarding.presentation.OnBoardingScreen

@Serializable
data object OnBoardingNavGraphRoute

@Serializable
data object OnBoardingRoute

fun NavGraphBuilder.onBoardingNavGraph(navController: NavController) {
    navigation<OnBoardingNavGraphRoute>(startDestination = OnBoardingRoute) {
        composable<OnBoardingRoute> {
            OnBoardingScreen {
                navController.navigate(AuthNavGraphRoute) {
                    popUpTo<OnBoardingRoute> {
                        inclusive = true
                    }
                }
            }
        }
    }
}
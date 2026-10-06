package pe.edu.upc.easysneaker.features.auth.presentation.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import kotlinx.serialization.Serializable
import pe.edu.upc.easysneaker.features.auth.presentation.login.LoginScreen
import pe.edu.upc.easysneaker.features.auth.presentation.register.RegisterScreen
import pe.edu.upc.easysneaker.features.main.MainNavGraphRoute

@Serializable
data object AuthNavGraphRoute

@Serializable
data object LoginRoute

@Serializable
data object RegisterRoute

fun NavGraphBuilder.authNavGraph(navController: NavController) {

    navigation<AuthNavGraphRoute>(startDestination = LoginRoute) {
        composable<LoginRoute> {
            LoginScreen {
                navController.navigate(MainNavGraphRoute) {
                    popUpTo(LoginRoute) {
                        inclusive = true
                    }
                }
            }
        }

        composable<RegisterRoute> {
            RegisterScreen()
        }
    }

}
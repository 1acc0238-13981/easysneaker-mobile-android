package pe.edu.upc.easysneaker.features.main

import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.navigation.NavController

@Composable
fun MainNavigationBar(navController: NavController) {


    var selectedItem by rememberSaveable {
        mutableStateOf(NavigationItem.entries.first())
    }

    BottomAppBar {

        NavigationItem.entries.forEach { item ->
            NavigationBarItem(
                icon = {
                    Icon(
                        item.icon,
                        contentDescription = item.title
                    )
                },
                label = {
                    Text(text = item.title)
                },
                selected = selectedItem == item,
                onClick = {

                    if (selectedItem != item) {
                        navController.navigate(item.route) {
                            popUpTo(selectedItem.route) {
                                saveState = true
                                inclusive = true
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                    }
                    selectedItem = item

                }
            )

        }
    }
}
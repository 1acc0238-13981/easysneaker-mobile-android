package pe.edu.upc.easysneaker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import dagger.hilt.android.AndroidEntryPoint
import pe.edu.upc.easysneaker.core.theme.EasySneakerTheme
import pe.edu.upc.easysneaker.features.home.presentation.HomeScreen

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EasySneakerTheme {
                HomeScreen()
            }
        }
    }
}

package net.iqbalfauzan.home

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Surface
import net.iqbalfauzan.home.ui.MainScreen

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            com.example.ui.theme.JelloTheme {
               Surface {
                   MainScreen()
               }
            }
        }
    }
}
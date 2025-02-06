package com.example.auth

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.auth.navigation.Screen
import com.example.auth.ui.signin.SignInScreen
import com.example.auth.ui.signup.SignUpScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            com.example.ui.theme.JelloTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = Screen.AuthSignIn.route) {
                    composable(Screen.AuthSignIn.route){
                        SignInScreen(
                            navController = navController
                        )
                    }
                    composable(Screen.AuthSignUp.route){
                        SignUpScreen(
                            navController = navController
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    com.example.ui.theme.JelloTheme {
        Greeting("Android")
    }
}
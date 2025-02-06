package com.example.auth.navigation

sealed class Screen(val route: String) {
    object AuthSignIn : Screen("auth/signIn")
    object AuthSignUp : Screen("auth/signUp")
}

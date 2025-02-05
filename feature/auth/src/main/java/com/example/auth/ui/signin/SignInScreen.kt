package com.example.auth.ui.signin

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ui.components.JelloButtonPrimary
import com.example.ui.components.JelloButtonSosmedRow
import com.example.ui.components.JelloEditText
import com.example.ui.components.JelloImageViewClick
import com.example.ui.components.JelloTextHeader
import com.example.ui.components.JelloTextRegular
import com.example.ui.components.JelloTextRegularWithClick
import com.example.ui.components.JelloTextViewRow

@Composable
fun SignInScreen() {
    Column(
        modifier = Modifier
            .padding(vertical = 16.dp)
            .fillMaxSize()
            .background(Color.White)
    ) {
        JelloImageViewClick(
            onClick = {

            }
        )
        Spacer(modifier = Modifier.height(30.dp))
        JelloTextHeader(
            text = "Welcome to Login",
            modifier = Modifier.padding(horizontal = 16.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))
        JelloTextRegularWithClick(
            text = "Please fill E-mail & password to login your app account.",
            textClick = "\nSign Up",
            onClick = {},
            modifier = Modifier.padding(horizontal = 16.dp)
        )
        Spacer(modifier = Modifier.height(25.dp))
        JelloTextRegular(
            text = "E-mail",
            modifier = Modifier.padding(horizontal = 16.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))
        JelloEditText(

        )
        Spacer(modifier = Modifier.height(20.dp))
        JelloTextRegular(
            text = "Password",
            modifier = Modifier.padding(horizontal = 16.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))
        JelloEditText(visualTransformation = PasswordVisualTransformation())

        JelloTextViewRow()

        Spacer(modifier = Modifier.height(30.dp))

        JelloButtonPrimary()


        JelloButtonSosmedRow()
    }
}

@Composable
@Preview(showBackground = true, device = Devices.NEXUS_5)
fun SignInScreenPreview() {
    SignInScreen()
}
package com.example.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ui.R
import com.example.ui.theme.LightOrange
import com.example.ui.theme.ModerateBlue
import com.example.ui.theme.PurpleGrey40
import com.example.ui.theme.VividRed

@Composable
fun JelloButtonPrimary(
    text: String = "Login Now",
    onClick: () -> Unit = {}
) {
    JelloBaseButton(
        text = text,
        onClick = onClick,
        enabled = true,
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .height(56.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = LightOrange,
            contentColor = PurpleGrey40
        )
    )

}

@Composable
@Preview(showBackground = true)
fun JelloButtonPrimaryPreview() {
    JelloButtonPrimary()
}


@Composable
fun JelloButtonFacebook(
    text: String = "Facebook",
    onClick: () -> Unit = {},
    modifier: Modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp)
        .height(56.dp),
) {
    JelloBaseIconButton(
        text = text,
        onClick = onClick,
        enabled = true,
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(
            containerColor = ModerateBlue,
            contentColor = Color.White
        ),
        srcIcon = R.drawable.ic_facebook,
        descIcon = "Facebook"
    )

}

@Composable
@Preview(showBackground = true)
fun JelloButtonFacebookPreview() {
    JelloButtonFacebook()
}


@Composable
fun JelloButtonGoogle(
    text: String = "Google",
    onClick: () -> Unit = {},
    modifier: Modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp)
        .height(56.dp),
) {
    JelloBaseIconButton(
        text = text,
        onClick = onClick,
        enabled = true,
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(
            containerColor = VividRed,
            contentColor = Color.White
        ),
        srcIcon = R.drawable.ic_google,
        descIcon = "Facebook"
    )

}

@Composable
@Preview(showBackground = true)
fun JelloButtonGooglePreview() {
    JelloButtonGoogle()
}


@Composable
fun JelloButtonSosmedRow(
    onClickFacebook: () -> Unit = {},
    onCLickGoogle: () -> Unit = {},
    modifier: Modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp)
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        JelloButtonGoogle(
            modifier = Modifier
                .weight(1f)
                .height(56.dp),
            onClick = onCLickGoogle
        )
        JelloButtonFacebook(
            modifier = Modifier
                .weight(1f)
                .height(56.dp),
            onClick = onClickFacebook
        )
    }
}

@Composable
@Preview(showBackground = true)
fun JelloButtonSosmedRowPreview() {
    JelloButtonSosmedRow()
}
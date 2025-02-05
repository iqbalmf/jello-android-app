package com.example.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ui.R


@Composable
fun JelloBaseButton(
    modifier: Modifier = Modifier,
    text: String = "Default Text",
    onClick: () -> Unit = {},
    enabled: Boolean = true,
    shape: Shape = RoundedCornerShape(8.dp),
    colors: ButtonColors = ButtonDefaults.buttonColors(
        containerColor = Color.Blue,
        contentColor = Color.White
    )
) {
    Button(
        modifier = modifier,
        onClick = onClick,
        enabled = enabled,
        shape = shape,
        colors = colors
    ) {
        Text(text = text)
    }
}

@Composable
@Preview(showBackground = true)
fun JelloBaseButtonPreview() {
    JelloBaseButton()
}


@Composable
fun JelloBaseIconButton(
    modifier: Modifier = Modifier,
    text: String = "Default Text",
    onClick: () -> Unit = {},
    enabled: Boolean = true,
    shape: Shape = RoundedCornerShape(8.dp),
    colors: ButtonColors = ButtonDefaults.buttonColors(
        containerColor = Color.Black,
        contentColor = Color.White
    ),
    color: Color = Color.White,
    descIcon: String = "Facebook",
    srcIcon: Int = R.drawable.ic_facebook
) {
    Button(
        modifier = modifier,
        onClick = { onClick() },
        enabled = enabled,
        shape = shape,
        colors = colors
    ) {
        Icon(
            painter = painterResource(id = srcIcon),
            contentDescription = descIcon,
            modifier = Modifier.size(24.dp),
            tint = color
        )
        Text(text = text, modifier = Modifier.padding(8.dp))
    }
}

@Composable
@Preview(showBackground = true)
fun JelloBaseIconButtonPreview() {
    JelloBaseIconButton()
}

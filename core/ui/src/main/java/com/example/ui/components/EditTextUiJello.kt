package com.example.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui.theme.VeryLightGray

@Composable
fun JelloEditText(
    value: String = "E-mail",
    onTyping: (String) -> Unit = {},
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
) {
    BasicTextField(
        value = value,
        onValueChange = { onTyping.invoke(it) },
        decorationBox = {innerTextField ->
                        Box(modifier = Modifier.padding(8.dp)) {
                            innerTextField()
                        }
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .border(width = 1.dp, color = VeryLightGray, shape = RoundedCornerShape(size = 8.dp))
            .background(Color.White)
            .padding(8.dp),
        textStyle = TextStyle(fontSize = 14.sp, color = Color.Black),
        visualTransformation = visualTransformation,
        keyboardOptions = keyboardOptions
    )
}

@Composable
@Preview(showBackground = true)
fun JelloEditTextPreview() {
    JelloEditText()
}


@Composable
@Preview(showBackground = true)
fun JelloEditTextPasswordPreview() {
    JelloEditText(visualTransformation = PasswordVisualTransformation())
}




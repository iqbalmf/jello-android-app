package com.example.ui.components

import android.graphics.Paint.Align
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui.theme.VividMagenta

@Composable
fun JelloTextHeader(
    text: String = "Welcome to login",
    color: Color = Color.Black,
    modifier: Modifier = Modifier.padding(16.dp),
) {
    Text(
        text = text, modifier = modifier, style = TextStyle(
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            lineHeight = 24.sp,
            color = Color.Black,
            textAlign = TextAlign.Left
        ), overflow = TextOverflow.Ellipsis, color = color, maxLines = 1
    )
}

@Composable
@Preview()
fun JelloTextHeaderPreview() {
    JelloTextHeader(
        text = "TESTING Header yang panjang sekalih"
    )
}

@Composable
fun JelloTextRegularWithClick(
    text: String = "Please fill E-mail & password to login your app account.",
    textClick: String = "\nSign Up",
    onClick: () -> Unit = {},
    modifier: Modifier = Modifier.padding(16.dp),

    ) {
    val annotatedText = buildAnnotatedString {
        append(text)
        pushStringAnnotation(
            tag = "TEXT_CLICK", annotation = textClick
        )
        withStyle(
            style = SpanStyle(
                color = VividMagenta, fontWeight = FontWeight.Bold
            )
        ) {
            append(textClick)
        }
        pop()
    }

    ClickableText(text = annotatedText, modifier = modifier, style = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
        lineHeight = 24.sp,
        textAlign = TextAlign.Left
    ), onClick = { offset ->
        annotatedText.getStringAnnotations(
            tag = "TEXT_CLICK", start = offset, end = offset
        ).firstOrNull()?.let {
            onClick()
        }
    })
}


@Composable
@Preview(showBackground = true)
fun JelloTextRegularWithClickPreview() {
    JelloTextRegularWithClick()
}

@Composable
fun JelloTextRegular(
    text: String = "E-Mail",
    modifier: Modifier = Modifier.padding(16.dp),
    color: Color = Color.Black,
) {
    Text(
        text = text, modifier = modifier, style = TextStyle(
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            lineHeight = 16.sp,
            textAlign = TextAlign.Left,
        ), color = color
    )
}

@Composable
@Preview(showBackground = true)
fun JelloTextRegularPreview(
) {
    JelloTextRegular()
}

@Composable
fun JelloTextViewRow(
    checked: Boolean = false,
    onCheckChange: (Boolean) -> Unit = {},
    onTextClick: () -> Unit = {},
    textLeft: String = "Remember me",
    textRight: String = "Forgot password?",
) {
    Row(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        JelloCheckbox(
            checked = checked,
            onCheckChange = onCheckChange,
            label = textLeft,
            modifier = Modifier
                .padding(vertical = 8.dp)
                .weight(1f)
        )
        val annotationString = buildAnnotatedString {
            append(textRight)

        }
        ClickableText(text = annotationString,
            modifier = Modifier.padding(vertical = 8.dp),
            style = TextStyle(
                fontSize = 12.sp,
                fontWeight = FontWeight.Normal,
                lineHeight = 14.sp,
                textAlign = TextAlign.Left,
            ),
            onClick = {
                onTextClick()
            })
    }

}

@Composable
@Preview(showBackground = true)
fun JelloTextViewRowPreview() {
    JelloTextViewRow()
}
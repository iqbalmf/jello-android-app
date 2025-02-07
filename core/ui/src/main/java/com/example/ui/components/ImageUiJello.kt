package com.example.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImagePainter
import coil3.compose.rememberAsyncImagePainter
import coil3.request.ImageRequest
import coil3.request.crossfade
import coil3.request.transformations
import com.example.ui.theme.VeryLightGray

@Composable
fun JelloImageViewClick(
    onClick: () -> Unit = {},
    color: Color = Color.Black,
    imageVector: ImageVector = Icons.Default.ArrowBack,
    imageDescription: String = "Back",
    modifier: Modifier = Modifier.size(24.dp)
) {
    IconButton(onClick = { onClick() }) {
        Icon(
            imageVector = imageVector,
            contentDescription = imageDescription,
            modifier = modifier,
            tint = color
        )
    }
}

@Composable
@Preview
fun JelloImageViewClickPreview() {
    JelloImageViewClick()
}

@Composable
fun JelloImageViewPhotoRounded(
    url: String,
    description: String
) {
    val painter = rememberAsyncImagePainter(
        ImageRequest
            .Builder(LocalContext.current)
            .data(data = url)
            .apply(block = fun ImageRequest.Builder.() {
                crossfade(true)
                    .transformations()
                    .build()
            }).build()
    )
    val state = painter.state.collectAsState()

    Box(contentAlignment = Alignment.Center) {
        if (state.value is AsyncImagePainter.State.Loading || state.value is AsyncImagePainter.State.Empty) {
            CircularProgressIndicator()
        }

        Image(
            painter = painter, contentDescription = description,
            modifier = Modifier
                .size(100.dp)
                .clip(RoundedCornerShape(8.dp))
        )
    }
}

@Composable
@Preview(showBackground = true)
fun JelloImageViewPhotoRoundedPreview() {
    JelloImageViewPhotoRounded(
        url = "https://static.posters.cz/image/1300/affiches-et-posters/pokemon-pikachu-neon-i71936.jpg",
        description = "Image pokemon"
    )
}
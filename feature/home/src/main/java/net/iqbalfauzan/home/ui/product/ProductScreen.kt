package net.iqbalfauzan.home.ui.product

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ui.components.JelloImageViewClick
import com.example.ui.components.JelloImageViewPhotoRounded
import com.example.ui.components.JelloTextRegular
import com.example.ui.components.RatingBar
import com.example.ui.theme.VeryLightGray
import com.example.ui.theme.VividRed

@Composable
fun ProductScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .clickable {},
                colors = CardDefaults.cardColors(
                    containerColor = Color.Gray.copy(alpha = 0.1f)
                )
            ) {
                Row(
                    modifier = Modifier
                        .padding(horizontal = 16.dp)
                        .fillMaxWidth()
                ) {
                    JelloTextRegular(
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.CenterVertically)
                            .weight(1f),
                        text = "Cari barang kamu disini",
                        color = Color.LightGray
                    )

                    JelloImageViewClick(
                        color = Color.LightGray,
                        onClick = {},
                        imageVector = Icons.Outlined.Search
                    )
                }
            }
        }
        Divider(
            modifier = Modifier.fillMaxWidth(),
            thickness = 2.dp,
            color = VeryLightGray
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 25.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            JelloTextRegular(
                text = "New Product",
                modifier = Modifier.weight(1f)
            )
            JelloImageViewClick(
                imageVector = Icons.Outlined.Search,
                color = VeryLightGray
            )
            JelloImageViewClick(
                imageVector = Icons.Outlined.Menu,
                color = VeryLightGray
            )
        }
        ItemProduct()
    }
}

@Composable
fun ItemProduct() {
    LazyColumn(
        modifier = Modifier
            .padding(top = 16.dp)
            .padding(horizontal = 16.dp)
            .background(Color.White)
    ) {
        items(10) {
            Row {
                Card(
                    modifier = Modifier
                        .size(100.dp)
                        .padding(bottom = 16.dp)
                        .clickable { },
                    colors = CardDefaults.cardColors(
                        containerColor = VeryLightGray
                    )
                ) {
                    JelloImageViewPhotoRounded(
                        url = "https://static.posters.cz/image/1300/affiches-et-posters/pokemon-pikachu-neon-i71936.jpg",
                        description = ""
                    )
                }
                Spacer(modifier = Modifier.padding(start = 8.dp))

                Column {
                    Text(
                        text = "Product Name",
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis,
                        style = TextStyle(fontWeight = FontWeight.SemiBold, color = Color.Black)
                    )
                    JelloTextRegular(
                        text = "Rp.100.000", modifier = Modifier.padding(top = 7.dp),
                        color = VividRed
                    )
                    RatingBar(
                        rating = 2f,
                        modifier = Modifier.padding(top = 18.dp),
                        onRatingChange = {

                        })
                }
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun ProductScreenPreview() {
    ProductScreen()
}
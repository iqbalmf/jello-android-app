package net.iqbalfauzan.home.ui.home

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ui.R
import com.example.ui.components.BannerSliderUiJello
import com.example.ui.components.JelloImageViewClick
import com.example.ui.components.JelloImageViewPhotoRounded
import com.example.ui.components.JelloTextRegular
import com.example.ui.theme.StrongBlue
import com.example.ui.theme.VeryLightGray

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(StrongBlue)
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
                    containerColor = Color.White.copy(alpha = 0.2f)
                )
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    JelloImageViewClick(
                        color = Color.White,
                        imageVector = Icons.Outlined.Search,
                        onClick = {

                        }
                    )
                    JelloTextRegular(
                        text = "Cari barang kamu disini",
                        color = Color.White
                    )
                }
            }
            JelloImageViewClick(
                color = Color.White,
                imageVector = Icons.Outlined.ShoppingCart,
                onClick = {
                    
                }
            )
        }
        val bannerImage = listOf(
            painterResource(id = R.drawable.sample_slide1),
            painterResource(id = R.drawable.sample_slide1),
            painterResource(id = R.drawable.sample_slide1),
            painterResource(id = R.drawable.sample_slide1),
        )
        BannerSliderUiJello(bannerImage = bannerImage, onClick = {

        })
    }
}

@Composable
@Preview(showBackground = true, device = Devices.PIXEL_6)
fun HomeScreenPreview() {
    HomeScreen()
}

data class ProductItem(
    val item: String,
    val subItems: List<String> = emptyList()
)
@Composable
fun SubItemList(subItems: List<String>){
    LazyRow(
        modifier = Modifier.padding(start = 16.dp)
    ) {
        items(subItems) {item ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 16.dp, bottom = 16.dp)
                    .clickable {

                    },
                colors = CardDefaults.cardColors(
                    containerColor = VeryLightGray
                )
            ) {
                JelloImageViewPhotoRounded(
                    url = item,
                    description = "Image ke $item"
                )
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun SubItemListPreview(){
    val temp = listOf(
        "https://picsum.photos/200",
        "https://picsum.photos/200",
    )
    SubItemList(temp)
}
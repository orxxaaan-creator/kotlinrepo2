package com.zeynalovsapps.kproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row

import androidx.compose.ui.text.style.TextAlign

import com.zeynalovsapps.kproject.ui.theme.KProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Box(modifier = Modifier.fillMaxSize().padding(top = 40.dp)) {
                ContactCard()
            }
        }
    }
}

@Composable
fun ContactCard() {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.LightGray)
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Column(
            modifier = Modifier.weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Имя: Евгений", fontSize = 16.sp, textAlign = TextAlign.Center)
            Text(text = "Отчество: Андреевич", fontSize = 16.sp, textAlign = TextAlign.Center)
            Text(text = "Фамилия: Лукашин", fontSize = 16.sp, textAlign = TextAlign.Center)
            Text(text = "Мобильный телефон: +7 495 495-95-95", fontSize = 16.sp, textAlign = TextAlign.Center)
            Text(text = "Адрес: г. Москва, 3-я улица Строителей, д. 25, кв. 12", fontSize = 16.sp, textAlign = TextAlign.Center)
        }


        Image(
            painter = painterResource(id = R.drawable.circle),
            contentDescription = "Аватар профиля",
            modifier = Modifier
                .size(48.dp)
                .padding(start = 8.dp),
            colorFilter = ColorFilter.tint(Color.Gray)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ContactRowCardPreview() {
    ContactCard()
}

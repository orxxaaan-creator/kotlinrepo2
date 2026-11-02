package com.zeynalovsapps.kproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.zeynalovsapps.kproject.ui.theme.KProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Hello(name = "friend")
        }
    }
}

@Composable
fun Hello(name: String?) {
    val dText = if  (name!=null) "Привет, $name!" else "Имя не задано"

    Text(
        text = dText,
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize()
    )
}

@Preview(
    name = "portrait",
    device = Devices.PIXEL_7,
    showSystemUi = true
)
@Preview(
    name = "landscape",
    device = "spec:width=891dp,height=411dp,dpi=420,orientation=landscape",
    showSystemUi = true
)
@Preview(
    name = "round",
    device = Devices.WEAR_OS_SMALL_ROUND,
    widthDp = 200,
    heightDp = 200,
    showBackground = true,
    backgroundColor = 0xFFFFFF00
)
@Composable
fun HelloPreview() {
    Hello("Android")
}
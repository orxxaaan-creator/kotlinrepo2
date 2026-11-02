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

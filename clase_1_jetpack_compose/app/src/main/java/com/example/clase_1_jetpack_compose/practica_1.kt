package com.example.clase_1_jetpack_compose


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun Component(){
    Text(text = "Texto_prueba");
}

@Composable
fun CajaBase(){
    Box(modifier = Modifier.fillMaxSize().background(Color.LightGray)) {
        Column(modifier = Modifier.fillMaxHeight(), verticalArrangement = Arrangement.SpaceEvenly) {
            Component();
            Component();
        }
        Row(modifier = Modifier.fillMaxSize(), horizontalArrangement = Arrangement.Center, Alignment.CenterVertically){
            Component();
        }
        Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceEvenly, horizontalAlignment = Alignment.End) {
            Component();
            Component()
        }
    }

}



@Preview(showSystemUi = true, device = Devices.DEFAULT)
@Composable
private fun Main(){
    CajaBase();
}
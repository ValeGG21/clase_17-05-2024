package com.example.clase_1_jetpack_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.example.clase_1_jetpack_compose.ui.theme.Clase_1_jetpack_composeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Clase_1_jetpack_composeTheme {
                // A surface container using the 'background' color from the theme
                /* Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }*/
            }
        }
    }
}

@Composable
fun Component_one (){
    Text(text = "Hola desde Android Studio!!")
}

@Composable
fun Cajas(){
    Box(modifier = Modifier.fillMaxSize());
    Component_one();
}

@Composable
fun Filas() {
    Row(modifier = Modifier
        .fillMaxWidth()
        .background(Color.LightGray),
        horizontalArrangement = Arrangement.SpaceEvenly) {
        Component_one();
    }
}

@Composable
fun Columnas(){
    Column(modifier = Modifier
        .fillMaxHeight()
        .background(Color.DarkGray)
        ,verticalArrangement = Arrangement.Center) {
        Component_one();
    }
}

@Preview(showSystemUi = true, device = Devices.DEFAULT)
@Composable
private fun Main(){
    Filas();
    Columnas();
}
package com.example.vazquez_davila_martin_ex1tdist.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.vazquez_davila_martin_ex1tdist.ui.screens.scaffold.AppScaffold

@Composable
fun SecondScreen(navController: NavController){
    AppScaffold(navController, {Ej01Screen()})

}

@Preview
@Composable
fun Ej01Screen() {
    HolaMundoSimple(text = "Hola, Jetpack Compose")  // (3)
}

@Composable
fun HolaMundoSimple(text: String = "Hola mundo") {  // (4)
    Text(
        text = text,
        Modifier  // (5)
            .background(color = Color.Blue)
            .padding(16.dp) // Padding exterior
            .background(color = Color.Green) // // (6)
            .padding(16.dp) // Padding interior
            .background(color = Color.Red) // // (6)
            .padding(16.dp) // Padding aún más interior
    )
}
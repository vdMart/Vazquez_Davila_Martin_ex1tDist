package com.example.vazquez_davila_martin_ex1tdist.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.vazquez_davila_martin_ex1tdist.ui.screens.scaffold.AppScaffold

@Composable
fun ThirdScreen(navController: NavController){
    AppScaffold(navController, {Ej02Screen()})
}

@Preview
@Composable
fun Ej02Screen() {
    Box(  // (1)
        Modifier
            .background(Color.Yellow)
            .fillMaxSize()
            .padding(30.dp)
            .background(Color.Green),
        // (1)
        content = {
            Text(text = "Texto 1 Hardcodeado", Modifier.align(Alignment.CenterEnd))
            Text(text = "Otro texto hardcodeado", Modifier.align(Alignment.BottomEnd))
            HolaMundoSimple("Composición llamando desde otra función composable")  // (2)
            Text(text = "Texto 4 Hadcodeado", Modifier.align(Alignment.TopCenter))
        }
    )
}
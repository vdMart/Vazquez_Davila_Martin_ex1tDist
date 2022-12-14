package com.example.vazquez_davila_martin_ex1tdist.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.example.vazquez_davila_martin_ex1tdist.ui.screens.scaffold.AppScaffold

@Composable
fun FourthScreen(navController: NavController){
    AppScaffold(navController, {ImagenesIconos()})

}

@Preview
@Composable
fun ImagenesIconos() {
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()), // para que la Column sea scrollable,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        //TextField(value = "0", onValueChange = { createBoard(value) })

        Icon(
            Icons.Default.PlayArrow,
            contentDescription = "Texto alternativo para accesibilidad",
        )

        Icon(
            Icons.Default.Favorite,
            contentDescription = null,
            modifier = Modifier.size(92.dp),
            tint = Color.Green
        )
        /*
        Agregar esta línea en el manifest:
            <uses-permission android:name="android.permission.INTERNET"/>
         */
        AsyncImage( // (1)
            model = "https://www.meme-arsenal.com/memes/75c1109bebaab9c203247308908e9c8d.jpg",
            contentDescription = "Texto alternativo"
        )
    }
}
package com.example.vazquez_davila_martin_ex1tdist.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.vazquez_davila_martin_ex1tdist.ui.theme.Vazquez_Davila_Martin_ex1tDistTheme
import com.example.vazquez_davila_martin_ex1tdist.R

@Composable
fun Ej4_Themes(navController: NavController) {
    ScreenNew()
}

@Preview
@Composable
fun ScreenNew() {

    Vazquez_Davila_Martin_ex1tDistTheme() {

        Scaffold(topBar = { AppBar() }) {
            Column(
                modifier = Modifier
                    .padding(it)  // Es necesario pasar los parámetros de padding del scaffold
                    .fillMaxWidth()

            ) {/*
                Image(
                    painter = painterResource(R.drawable.gasol),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,

                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp)
                        .clip(shape = MaterialTheme.shapes.medium)
                )*/
                Spacer(
                    Modifier
                        .height(16.dp)
                        .fillMaxWidth()
                        .background(MaterialTheme.colors.primary)
                )
                val padding = Modifier.padding(horizontal = 16.dp)
                Text(
                    text = stringResource(R.string.saludo),
                    style = MaterialTheme.typography.h4,
                    modifier = padding
                )
                Spacer(Modifier.height(16.dp))
                Text(
                    text = stringResource(R.string.subtitulo),
                    style = MaterialTheme.typography.subtitle2,
                    modifier = padding
                )
                Spacer(Modifier.height(16.dp))
                Text(
                    text = stringResource(R.string.contenido),
                    style = MaterialTheme.typography.body2,
                    modifier = padding
                )
            }
        }
    }
}

@Composable
private fun AppBar() {
    TopAppBar(
        title = {
            Text(stringResource(R.string.noticia))
        },
        backgroundColor = MaterialTheme.colors.primary
    )
}
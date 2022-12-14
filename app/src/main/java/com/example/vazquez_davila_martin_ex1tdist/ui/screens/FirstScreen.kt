package com.example.vazquez_davila_martin_ex1tdist.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.vazquez_davila_martin_ex1tdist.ui.screens.scaffold.AppScaffold

@Composable
fun FirstScreen(navController: NavController){
    AppScaffold(navController, {FirstBodyContent(navController)})
}

@Composable
private fun FirstBodyContent(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Hola, Soy la 1º Pagina")
        Button(onClick = { navController.popBackStack() }) {
            Text(text = "Volver Atras")
        }
    }
}
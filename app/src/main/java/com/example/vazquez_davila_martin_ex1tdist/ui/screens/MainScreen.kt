package com.example.vazquez_davila_martin_ex1tdist.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.vazquez_davila_martin_ex1tdist.ui.navigation.AppScreens
import com.example.vazquez_davila_martin_ex1tdist.ui.screens.scaffold.MainScaffold

@Composable
fun MainScreen(navController: NavController){
    MainScaffold(navController, {MainBodyContent(navController)})
}

@Composable
private fun MainBodyContent(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Hola Soy la 0º Pagina")

        Button(onClick = {navController.navigate(route = AppScreens.FirstScreen.route)} ) {
            Text(text = "Vamos a la 1º Pagina")
        }
        Button(onClick = {navController.navigate(route = AppScreens.SecondScreen.route)} ) {
            Text(text = "Vamos a la 2º Pagina")
        }
        Button(onClick = {navController.navigate(route = AppScreens.ThirdScreen.route)} ) {
            Text(text = "Vamos a la 3º Pagina")
        }
        Button(onClick = {navController.navigate(route = AppScreens.FourthScreen.route)} ) {
            Text(text = "Vamos a la 4º Pagina")
        }
        Button(onClick = {navController.navigate(route = AppScreens.FifthScreen.route)} ) {
            Text(text = "Vamos a la 5º Pagina")
        }
        Button(onClick = {navController.navigate(route = AppScreens.Ej2_CalculadoraIOS.route)} ) {
            Text(text = "Vamos al Ej2_CalculadoraIOS")
        }
        Button(onClick = {navController.navigate(route = AppScreens.Ej3_CalculadoraWindows.route)} ) {
            Text(text = "Vamos al Ej3_CalculadoraWindows")
        }
        Button(onClick = {navController.navigate(route = AppScreens.Ej4_Themes.route)} ) {
            Text(text = "Vamos al Ej4_Themes")
        }
    }
}
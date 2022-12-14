package com.example.vazquez_davila_martin_ex1tdist.ui.screens

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
//import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.vazquez_davila_martin_ex1tdist.ui.theme.*

@Composable
fun Ej3_CalculadoraWindows(navController: NavController) {
    CalculadoraWindowsContent()
}

@Preview(showSystemUi = true)
@Composable
private fun CalculadoraWindowsContent() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Fondo)
            .padding(2.dp),
    ) {

        DisplayCalculadora(Modifier.weight(3f))
        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(0.66f)) {
            BotonCalculadora(text = "MC", color = Fondo)
            BotonCalculadora(text = "MR", color = Fondo)
            BotonCalculadora(text = "M+", color = Fondo)
            BotonCalculadora(text = "M-", color = Fondo)
            BotonCalculadora(text = "MS", color = Fondo)
            BotonCalculadora(text = "M\u25BE", color = Fondo)
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)) {
            BotonCalculadora(text = "%", color = GrisOscuro)
            BotonCalculadora(text = "CE", color = GrisOscuro)
            BotonCalculadora(text = "C", color = GrisOscuro)
            BotonCalculadora(text = "\u232B", color = GrisOscuro)
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)) {
            BotonCalculadora(text = "1/x", color = GrisOscuro)
            BotonCalculadora(text = "x\u00B2", color = GrisOscuro)
            BotonCalculadora(text = "\u221A", color = GrisOscuro)
            BotonCalculadora(text = "/", color = GrisOscuro)
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)) {
            BotonCalculadora(text = "7")
            BotonCalculadora(text = "8")
            BotonCalculadora(text = "9")
            BotonCalculadora(text = "X", color = GrisOscuro)
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)) {
            BotonCalculadora(text = "4")
            BotonCalculadora(text = "5")
            BotonCalculadora(text = "6")
            BotonCalculadora(text = "-", color = GrisOscuro)
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)) {
            BotonCalculadora(text = "1")
            BotonCalculadora(text = "2")
            BotonCalculadora(text = "3")
            BotonCalculadora(text = "+", color = GrisOscuro)
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)) {
            BotonCalculadora(text = "+/-")
            BotonCalculadora(text = "0")
            BotonCalculadora(text = ",")
            BotonCalculadora(text = "=", color = AzulIgual)
        }
    }
}

@Composable
fun DisplayCalculadora(
    modifier: Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Fondo)
            .padding(start = 20.dp, end = 20.dp, top = 40.dp, bottom = 20.dp),
        contentAlignment = Alignment.BottomEnd,
    )
    {
        Text(text = "0",
            textAlign = TextAlign.End,
            color = ColorLetras,
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold)
    }
}

@Composable
fun RowScope.BotonCalculadora(
    // (1)
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Negro,
    onClick: () -> Unit = {
        Log.d("---", text)
    },
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .weight(1f)  // (1)
            .fillMaxSize()
            .border(width = 1.dp, color = Fondo)
            .background(color)
            .clickable { onClick() }
            .then(modifier)
    ) {
        Text(text = text, fontSize = 25.sp, color = ColorLetras)
    }

}
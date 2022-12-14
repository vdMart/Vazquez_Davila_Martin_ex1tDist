package com.example.vazquez_davila_martin_ex1tdist.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.vazquez_davila_martin_ex1tdist.ui.screens.MainScreen
import com.example.vazquez_davila_martin_ex1tdist.ui.screens.FirstScreen
import com.example.vazquez_davila_martin_ex1tdist.ui.screens.SecondScreen
import com.example.vazquez_davila_martin_ex1tdist.ui.screens.ThirdScreen
import com.example.vazquez_davila_martin_ex1tdist.ui.screens.FourthScreen
import com.example.vazquez_davila_martin_ex1tdist.ui.screens.FifthScreen
import com.example.vazquez_davila_martin_ex1tdist.ui.screens.Ej2_CalculadoraIOS
import com.example.vazquez_davila_martin_ex1tdist.ui.screens.Ej3_CalculadoraWindows
import com.example.vazquez_davila_martin_ex1tdist.ui.screens.Ej4_Themes

/*
* Copiar en 'build.gradle(Module: *.app)' la linea en 'dependencies':
*
*                Librería de navigation compose
* implementation ("androidx.navigation:navigation-compose:2.5.3")
*   o esta:
* implementation ("androidx.navigation:navigation-compose:2.4.0-rc01")
*
*                 Librería para tener más iconos
* implementation "androidx.compose.material:material-icons-extended:$compose_version"
*
*                               Coil
* implementation("io.coil-kt:coil-compose:2.2.2")
*
* * y luego darle a SyncNow en la esquina superior derecha * *
* */

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.MainScreen.route) {
        composable(route = AppScreens.MainScreen.route) {
            MainScreen(navController)
        }
        composable(route = AppScreens.FirstScreen.route) {
            FirstScreen(navController)
        }
        composable(route = AppScreens.SecondScreen.route) {
            SecondScreen(navController)
        }
        composable(route = AppScreens.ThirdScreen.route) {
            ThirdScreen(navController)
        }
        composable(route = AppScreens.FourthScreen.route) {
            FourthScreen(navController)
        }
        composable(route = AppScreens.FifthScreen.route) {
            FifthScreen(navController)
        }
        composable(route = AppScreens.Ej2_CalculadoraIOS.route) {
            Ej2_CalculadoraIOS(navController)
        }
        composable(route = AppScreens.Ej3_CalculadoraWindows.route) {
            Ej3_CalculadoraWindows(navController)
        }
        composable(route = AppScreens.Ej4_Themes.route) {
            Ej4_Themes(navController)
        }
/*
        composable(route = AppScreens.SixthScreen.route) {
            SixthScreen(navController)
        }
        composable(route = AppScreens.SeventhScreen.route) {
            SeventhScreen(navController)
        }
        composable(route = AppScreens.EighthScreen.route) {
            EighthScreen(navController)
        }
        composable(route = AppScreens.NinethScreen.route) {
            NinethScreen(navController)
        }
        composable(route = AppScreens.TenthScreen.route) {
            TenthScreen(navController)
        }
*/
    }
}
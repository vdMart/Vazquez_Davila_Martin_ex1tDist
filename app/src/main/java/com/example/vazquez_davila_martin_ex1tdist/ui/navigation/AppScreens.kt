package com.example.vazquez_davila_martin_ex1tdist.ui.navigation

sealed class AppScreens(val route:String) {
    object MainScreen: AppScreens("main_screen")
    object Ej2_CalculadoraIOS: AppScreens("ej2_calculadoraios_screen")
    object Ej3_CalculadoraWindows: AppScreens("ej3_calculadorawin_screen")
    object Ej4_Themes: AppScreens("ej4_themes_screen")

    object FirstScreen: AppScreens("first_screen")
    object SecondScreen: AppScreens("Second_screen")
    object ThirdScreen: AppScreens("third_screen")
    object FourthScreen: AppScreens("fourth_screen")
    object FifthScreen: AppScreens("fifth_screen")
/*
    object SixthScreen: AppScreens("sixth_screen")
    object SeventhScreen: AppScreens("seventh_screen")
    object EighthScreen: AppScreens("eighth_screen")
    object NinethScreen: AppScreens("nineth_screen")
    object TenthScreen: AppScreens("tenth_screen")
*/
}
package com.example.vazquez_davila_martin_ex1tdist.ui.screens.scaffold

import android.content.res.Configuration
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.vazquez_davila_martin_ex1tdist.ui.navigation.AppScreens

@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showSystemUi = true)
@Composable
private fun DefaultPreview() {
    AppScaffold(navController=rememberNavController(), {})
}


@Composable
fun AppScaffold(navController: NavController, ContentFun: @Composable () -> Unit) {
    Scaffold(
        topBar = { ScaTopBar(navController)  },
        bottomBar = { ScaBottomBar(navController) }
    ){
        BottomAppBar() {
            Text(text = "Pestaña 1")
            Spacer(modifier = Modifier.width(5.dp))
            Text(text = "Pestaña 2")
        }
        Text(text = "Hola mundo",
            modifier = Modifier.padding(50.dp) //TODO: ¿Cómo se usan los PaddingValues?
        )
        ContentFun()
    }
}
@Composable
private fun ScaTopBar(navController: NavController) {
    TopAppBar(
        title = { Text(text = "Top App Bar") },
        navigationIcon = {
            IconButton(onClick = { navController.popBackStack() }) {
                Icon(Icons.Filled.ArrowBack, "back icon")
            }
        },
        backgroundColor = MaterialTheme.colors.primary,
        contentColor = Color.White,
        elevation = 10.dp
    )
}

@Composable
private fun ScaBottomBar(navController: NavController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    BottomNavigation(elevation = 10.dp, modifier = Modifier
        .fillMaxWidth() ) {
        BottomNavigationItem(
            selected = currentDestination?.hierarchy?.any { it.route == AppScreens.MainScreen.route } == true,
            onClick = {
                navController.navigate(route = AppScreens.MainScreen.route){
                    popUpTo(navController.graph.findStartDestination().id) {
                        saveState = true
                    }
                    launchSingleTop = true
                    restoreState = true
                }
            },
            icon = { Icon(imageVector = Icons.Default.Home, contentDescription = "home icon") },
            label = { Text(text = "Home") }
        )
        BottomNavigationItem(
            selected = currentDestination?.hierarchy?.any { it.route == AppScreens.FirstScreen.route } == true,
            onClick = {
                navController.navigate(route = AppScreens.FirstScreen.route){
                    popUpTo(navController.graph.findStartDestination().id) {
                        saveState = true
                    }
                    launchSingleTop = true
                    restoreState = true
                }
            },
            icon = { Icon(imageVector = Icons.Default.Favorite, contentDescription = "fav icon") },
            label = { Text(text = "Favorite") }
        )
        BottomNavigationItem(
            selected = currentDestination?.hierarchy?.any { it.route == AppScreens.SecondScreen.route } == true,
            onClick = {
                navController.navigate(route = AppScreens.SecondScreen.route){
                    popUpTo(navController.graph.findStartDestination().id) {
                        saveState = true
                    }
                    launchSingleTop = true
                    restoreState = true
                }
            },
            icon = { Icon(imageVector = Icons.Default.Person, contentDescription = "person icon") },
            label = { Text(text = "Profile") }
        )
    }

}
package com.example.vazquez_davila_martin_ex1tdist.ui.screens.scaffold

import android.content.res.Configuration
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.vazquez_davila_martin_ex1tdist.ui.navigation.AppScreens
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch


@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showSystemUi = true)
@Composable
private fun DefaultPreview() {
    MainScaffold(navController= rememberNavController(), {})
}


@Composable
fun MainScaffold(navController: NavController, ContentFun: @Composable () -> Unit) {
    val scope = rememberCoroutineScope()
    val scaffoldState = rememberScaffoldState(drawerState = rememberDrawerState(initialValue = DrawerValue.Closed))

    Scaffold(
        topBar = { ScaTopBar(scope, scaffoldState)  },
        floatingActionButton = { ScaFloatingBtn() }, floatingActionButtonPosition = FabPosition.End,
        scaffoldState = scaffoldState,
        drawerContent = { Drawer(navController) },
        bottomBar = { ScaBottomBar(navController) }
    ){
        ContentFun()
    }
}
@Composable
private fun ScaTopBar(scope: CoroutineScope, scaffoldState: ScaffoldState) {
    TopAppBar(
        title = { Text(text = "Top App Bar") },
        navigationIcon = {
            IconButton(onClick = {
                scope.launch { scaffoldState.drawerState.open() }
            }) {
                Icon(Icons.Filled.Menu, "menu icon")
            }
        },
        backgroundColor = MaterialTheme.colors.primary,
        contentColor = Color.White,
        elevation = 10.dp
    )
}

@Composable
private fun ScaFloatingBtn() {
    FloatingActionButton( onClick = {} ){
        Icon(imageVector = Icons.Default.Add, contentDescription = "add icon")
    }
}
@Composable
private fun Drawer(navController: NavController) {
    Column() {
        TextButton(onClick = { navController.navigate(route = AppScreens.FirstScreen.route) }) {
            Text(text = "Página 1", modifier = Modifier.fillMaxWidth())
        }
        TextButton(onClick = { navController.navigate(route = AppScreens.SecondScreen.route) }) {
            Text(text = "Página 2", modifier = Modifier.fillMaxWidth())
        }
        TextButton(onClick = { navController.navigate(route = AppScreens.ThirdScreen.route) }) {
            Text(text = "Página 3", modifier = Modifier.fillMaxWidth())
        }
        TextButton(onClick = { navController.navigate(route = AppScreens.FourthScreen.route) }) {
            Text(text = "Página 4", modifier = Modifier.fillMaxWidth())
        }
        TextButton(onClick = { navController.navigate(route = AppScreens.FifthScreen.route) }) {
            Text(text = "Página 5", modifier = Modifier.fillMaxWidth())
        }
/*
        TextButton(onClick = { navController.navigate(route = AppScreens.SixthScreen.route) }) {
            Text(text = "Página 6", modifier = Modifier.fillMaxWidth())
        }
        TextButton(onClick = { navController.navigate(route = AppScreens.SeventhScreen.route) }) {
            Text(text = "Página 7", modifier = Modifier.fillMaxWidth())
        }
        TextButton(onClick = { navController.navigate(route = AppScreens.EighthScreen.route) }) {
            Text(text = "Página 8", modifier = Modifier.fillMaxWidth())
        }
        TextButton(onClick = { navController.navigate(route = AppScreens.NinethScreen.route) }) {
            Text(text = "Página 9", modifier = Modifier.fillMaxWidth())
        }
        TextButton(onClick = { navController.navigate(route = AppScreens.TenthScreen.route) }) {
            Text(text = "Página 10", modifier = Modifier.fillMaxWidth())
        }
*/
    }
}

@Composable
private fun ScaBottomBar(navController: NavController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    BottomNavigation(elevation = 10.dp, modifier = Modifier
        .fillMaxWidth()
        .clip(RoundedCornerShape(15.dp, 15.dp, 0.dp, 0.dp))) {
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
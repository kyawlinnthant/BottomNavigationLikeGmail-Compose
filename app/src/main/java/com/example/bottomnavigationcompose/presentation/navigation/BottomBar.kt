package com.example.bottomnavigationcompose.presentation.navigation

import androidx.compose.material.BottomNavigation
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun BottomBar(navController: NavHostController) {

    //1. screen list
    val screens = listOf(
        BottomNavigationDestinations.Home,
        BottomNavigationDestinations.Profile,
        BottomNavigationDestinations.Setting
    )
    val screenRoute = listOf(
        BottomNavigationDestinations.Home.route,
        BottomNavigationDestinations.Profile.route,
        BottomNavigationDestinations.Setting.route
    )
    //2. nav back stack
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    //3. currentRoute
    val currentRoute = navBackStackEntry?.destination
    //4. bottom navigation
    if (screenRoute.contains(navController.currentDestination?.route)) {
        BottomNavigation {
            screens.forEach {
                AddBottomBarItem(
                    screen = it,
                    currentRoute = currentRoute,
                    navController = navController
                )
            }
        }
    }

}
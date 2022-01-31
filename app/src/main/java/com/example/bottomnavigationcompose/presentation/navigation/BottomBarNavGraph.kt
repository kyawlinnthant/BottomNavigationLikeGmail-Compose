package com.example.bottomnavigationcompose.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.bottomnavigationcompose.presentation.features.home.HomeScreen
import com.example.bottomnavigationcompose.presentation.features.profile.ProfileScreen
import com.example.bottomnavigationcompose.presentation.features.setting.AccountSettingScreen
import com.example.bottomnavigationcompose.presentation.features.setting.GeneralSettingScreen
import com.example.bottomnavigationcompose.presentation.features.setting.SettingScreen

@Composable
fun BottomBarNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomNavigationDestinations.Home.route
    ) {
        composable(route = BottomNavigationDestinations.Home.route) { HomeScreen() }
        composable(route = BottomNavigationDestinations.Profile.route) { ProfileScreen() }
        composable(route = BottomNavigationDestinations.Setting.route) { SettingScreen(navController) }

        composable(route = ScreenDestinations.GeneralSetting.route) {
            GeneralSettingScreen(
                navController
            )
        }
        composable(route = ScreenDestinations.AccountSetting.route) {
            AccountSettingScreen(
                navController
            )
        }

    }
}
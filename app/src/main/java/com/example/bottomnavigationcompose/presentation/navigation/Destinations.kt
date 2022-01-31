package com.example.bottomnavigationcompose.presentation.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class ScreenDestinations(
    val route: String,
) {
    object Home : ScreenDestinations(route = "home_screen")
    object Profile : ScreenDestinations(route = "profile_screen")
    object Setting : ScreenDestinations(route = "setting_screen")

    object AccountSetting :
        ScreenDestinations(route = "account_setting_screen")

    object GeneralSetting :
        ScreenDestinations(route = "general_setting_screen")
}

sealed class BottomNavigationDestinations(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Home : BottomNavigationDestinations(
        route = ScreenDestinations.Home.route,
        title = "Home",
        icon = Icons.Default.Home
    )

    object Profile : BottomNavigationDestinations(
        route = ScreenDestinations.Profile.route,
        title = "Profile",
        icon = Icons.Default.Person
    )

    object Setting : BottomNavigationDestinations(
        route = ScreenDestinations.Setting.route,
        title = "Setting",
        icon = Icons.Default.Settings
    )
}



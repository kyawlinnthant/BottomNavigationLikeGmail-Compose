package com.example.bottomnavigationcompose.presentation.main

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.bottomnavigationcompose.presentation.navigation.BottomBar
import com.example.bottomnavigationcompose.presentation.navigation.BottomBarNavGraph

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    Scaffold(bottomBar = { BottomBar(navController = navController) }) {
        BottomBarNavGraph(navController = navController)
    }
}
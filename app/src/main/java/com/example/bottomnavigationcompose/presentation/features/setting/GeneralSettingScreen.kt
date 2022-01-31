package com.example.bottomnavigationcompose.presentation.features.setting

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.bottomnavigationcompose.presentation.navigation.TopBar

@Composable
fun GeneralSettingScreen(
    navController: NavController
) {

    Column(modifier = Modifier.fillMaxSize()) {
        TopBar(
            title = "General Setting",
            navIcon = Icons.Filled.ArrowBack,
            onNavIconClick = { navController.popBackStack() }
        )
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Text(text = "This is General Setting")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GeneralSettingScreenPreview() {
    Surface {
        GeneralSettingScreen(navController = rememberNavController())
    }
}
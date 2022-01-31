package com.example.bottomnavigationcompose.presentation.navigation

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
fun TopBar(
    title: String = "",
    navIcon: ImageVector,
    onNavIconClick: () -> Unit

) {
    TopAppBar(
        title = {
            Text(text = title)
        },
        navigationIcon = {
            IconButton(onClick = { onNavIconClick() }) {
                Icon(navIcon, contentDescription = "Toolbar Icon")
            }
        },
        backgroundColor = MaterialTheme.colors.primary,
        contentColor = MaterialTheme.colors.surface,
    )
}

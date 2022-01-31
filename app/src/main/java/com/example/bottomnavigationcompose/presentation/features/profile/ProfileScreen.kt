package com.example.bottomnavigationcompose.presentation.features.profile

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.bottomnavigationcompose.presentation.navigation.TopBar

@Composable
fun ProfileScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        TopBar(
            title = "Profile",
            navIcon = Icons.Filled.Menu,
            onNavIconClick = {

            }
        )
        Box(
            modifier = Modifier
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "This is Profile Screen")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    Surface {
        ProfileScreen()
    }
}
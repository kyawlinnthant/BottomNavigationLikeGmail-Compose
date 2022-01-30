package com.example.bottomnavigationcompose.presentation.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController

@Composable
fun RowScope.AddBottomBarItem(
    screen: BottomNavigationDestinations,
    currentRoute: NavDestination?,
    navController: NavHostController
) {
    var selectedRoute by remember {
        mutableStateOf(screen.route)
    }

    BottomNavigationItem(

        label = {
            Text(text = screen.title)
        },

        icon = {

            if (currentRoute?.route != selectedRoute) {
                Icon(
                    imageVector = screen.icon,
                    contentDescription = "Bottom Bar Icon"
                )

            } else {
                Icon(
                    modifier = Modifier
                        .padding(
                            start = 32.dp,
                            end = 32.dp
                        )
                        .background(
                            color = MaterialTheme.colors.onSurface.copy(
                                alpha = 0.18f
                            ),
                            shape = RoundedCornerShape(16.dp)
                        )
                        .fillMaxWidth()

                        .clip(RoundedCornerShape(8.dp)),
                    imageVector = screen.icon,
                    contentDescription = "Bottom Bar Icon"
                )
            }
        },
        selected = currentRoute?.hierarchy?.any {
            it.route == screen.route
        } == true,
//        selectedContentColor = MaterialTheme.colors.primary,
        unselectedContentColor = LocalContentColor.current.copy(
            alpha = ContentAlpha.disabled
        ),
        onClick = {
            selectedRoute = screen.route
            navController.navigate(screen.route) {
                popUpTo(navController.graph.findStartDestination().id)
                launchSingleTop = true
                restoreState = true
            }
        }

    )
}

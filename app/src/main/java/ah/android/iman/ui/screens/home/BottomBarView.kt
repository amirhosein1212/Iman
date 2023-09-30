package ah.android.iman.ui.screens.home

import ah.android.iman.ui.theme.ImanTheme
import ah.android.iman.ui.util.PreviewDarkLight
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

@Composable
fun BottomBarView(
    navController: NavHostController,
    backGroundColor: Color = MaterialTheme.colorScheme.primary.copy(alpha = 0.5f)
) {
    val bottomNavigationItems = listOf(
        BottomNavigationItem.Home,
        BottomNavigationItem.Category,
        BottomNavigationItem.ShoppingCart,
        BottomNavigationItem.Profile
    )
    Row(
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .background(backGroundColor)
            .padding(vertical = 4.dp)
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        bottomNavigationItems.forEach { item ->
            Icon(
                imageVector = item.icon,
                contentDescription = item.title,
                tint = if (currentRoute == item.destination.route) MaterialTheme.colorScheme.primary
                else MaterialTheme.colorScheme.onPrimary,
                modifier = Modifier
                    .weight(1f)
                    .clip(CircleShape)
                    .clickable {
                        navController.navigate(item.destination.route) {
                            navController.graph.startDestinationRoute?.let { startRoute ->
                                popUpTo(startRoute) {
                                    inclusive = false
                                    saveState = true
                                }
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                    }
                    .padding(all = 4.dp)
                    .wrapContentWidth()

                    .padding(all = 4.dp)
            )
//            BottomBarItem(
//                modifier = Modifier.weight(1f),
//                navigationItem = item,
//                selected = currentRoute == item.destination.route,
//                onClick = {
//                    navController.navigate(item.destination.route) {
////                        navController.graph.startDestinationRoute?.let { startRoute ->
////                            popUpTo(startRoute) {
////                                inclusive = false
////                                saveState = true
////                            }
////                        }
//                        launchSingleTop = true
////                        restoreState = true
//                    }
//                },
//            )
        }
    }
}

@PreviewDarkLight
@Composable
fun PreviewBottomBarView() {
    ImanTheme {
        BottomBarView(
            navController = rememberNavController()
        )
    }
}
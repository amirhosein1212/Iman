package ah.android.iman.ui.screens.home

import ah.android.iman.ui.navigation.Destination
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavigationItem(
    val destination: Destination,
    val icon: ImageVector,
    val title: String
) {

    object Home : BottomNavigationItem(
        destination = Destination.Home,
        icon = Icons.Default.Home,
        title = "Home"
    )

    object Profile : BottomNavigationItem(
        destination = Destination.Profile,
        icon = Icons.Default.Person,
        title = "Profile"
    )

    object Category : BottomNavigationItem(
        destination = Destination.Category,
        icon = Icons.Default.List,
        title = "Categories"
    )

    object ShoppingCart : BottomNavigationItem(
        destination = Destination.ShoppingCart,
        icon = Icons.Default.ShoppingCart,
        title = "ShoppingCart"
    )

}
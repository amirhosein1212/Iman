package ah.android.iman.ui.navigation

sealed class Destination(
    val route: String
) {
    object Splash : Destination(route = "Splash")
    object Home : Destination(route = "Home")
    object Profile : Destination(route = "Profile")
    object Search : Destination(route = "Search")
    object Category : Destination(route = "Category")
    object ShoppingCart : Destination(route = "ShoppingCart")
}
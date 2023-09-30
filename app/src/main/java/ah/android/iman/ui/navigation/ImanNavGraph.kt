package ah.android.iman.ui.navigation

import ah.android.iman.ui.screens.CategoryScreen
import ah.android.iman.ui.screens.ProfileScreen
import ah.android.iman.ui.screens.SearchScreen
import ah.android.iman.ui.screens.ShoppingCartScreen
import ah.android.iman.ui.screens.home.HomeScreen
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun ImanNavGraph(
    navHostController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navHostController,
        startDestination = Destination.Home.route,
        modifier = modifier
    ) {

        composable(
            route = Destination.Home.route
        ) { _ ->
            HomeScreen(navHostController)
        }

        composable(
            route = Destination.Profile.route
        ) { _ ->
            ProfileScreen()
        }

        composable(
            route = Destination.Search.route
        ) { _ ->
            SearchScreen()
        }

        composable(
            route = Destination.Category.route
        ) { _ ->
            CategoryScreen()
        }

        composable(
            route = Destination.ShoppingCart.route
        ) { _ ->
            ShoppingCartScreen()
        }

    }
}
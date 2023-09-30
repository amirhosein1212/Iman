package ah.android.iman.ui.navigation

import androidx.navigation.NavHostController
import androidx.navigation.NavOptions

fun NavHostController.safeNavigate(
    route: String,
    navOptions: NavOptions? = null
) {
    navigate(
        route = route,
        navOptions = navOptions
    )
}
package ah.android.iman.ui.screens.home

import ah.android.iman.ui.theme.ImanTheme
import ah.android.iman.ui.util.PreviewDarkLight
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun HomeScreen(
    navController: NavHostController
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
    ) {

    }
//    Scaffold(
//        topBar = {
//            TopBarView(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .wrapContentHeight()
//            ) {}
//        },
//        bottomBar = {
//            BottomBarView(
//                navController = navController
//            )
//        }
//    ) { paddings ->
//        Surface(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(paddingValues = paddings)
//        ) {
//
//        }
//    }
}

@PreviewDarkLight
@Composable
fun PreviewHomeScreen() {
    ImanTheme {
        HomeScreen(rememberNavController())
    }
}
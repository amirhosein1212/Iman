package ah.android.iman.ui

import ah.android.iman.ui.navigation.ImanNavGraph
import ah.android.iman.ui.screens.home.BottomBarView
import ah.android.iman.ui.screens.home.TopBarView
import ah.android.iman.ui.screens.splash.SplashScreen
import ah.android.iman.ui.theme.ImanTheme
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.lifecycle.lifecycleScope
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ImanApp() {
    ImanTheme {
        val navHostController = rememberNavController()
        var showSplash by rememberSaveable {
            mutableStateOf(true)
        }
        val scope by rememberUpdatedState(
            LocalLifecycleOwner.current.lifecycleScope
        )
        val splashDelay = 1000L
        LaunchedEffect(Unit) {
            scope.launch(Dispatchers.IO) {
                delay(splashDelay)
                withContext(Dispatchers.Main) { showSplash = false }
            }
        }
        if (showSplash) {
            SplashScreen {}
        } else {
            Scaffold(
                topBar = {
                    TopBarView(
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                    ) {}
                },
                bottomBar = {
                    BottomBarView(
                        navController = navHostController
                    )
                }
            ) { paddings ->
                ImanNavGraph(
                    navHostController = navHostController,
                    modifier = Modifier.padding(paddings)
                )
            }
        }
    }
}

package ah.android.iman.ui.screens.splash

import ah.android.iman.ui.theme.ImanTheme
import ah.android.iman.ui.util.PreviewDarkLight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

@Composable
fun SplashScreen(
    navigateToHome: () -> Unit
) {
    Surface(
        color = MaterialTheme.colorScheme.primary,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            fontSize = 40.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight(1000),
            text = "ImanApp",
            modifier = Modifier
                .fillMaxSize()
                .wrapContentSize()
        )
    }
}

@PreviewDarkLight
@Composable
fun PreviewSplashScreen() {
    ImanTheme {
        SplashScreen {}
    }
}


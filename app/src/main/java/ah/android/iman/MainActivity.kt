package ah.android.iman

import ah.android.iman.ui.ImanApp
import ah.android.iman.ui.theme.ImanTheme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ImanTheme {
                ImanApp()
            }
        }
    }
}
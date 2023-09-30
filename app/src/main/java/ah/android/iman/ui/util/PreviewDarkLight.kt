package ah.android.iman.ui.util

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.ui.tooling.preview.Preview

@Preview(
    name = "light"
)
@Preview(
    uiMode = UI_MODE_NIGHT_YES,
    name = "dark"
)
annotation class PreviewDarkLight
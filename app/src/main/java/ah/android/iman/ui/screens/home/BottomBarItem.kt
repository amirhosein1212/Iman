package ah.android.iman.ui.screens.home

import ah.android.iman.ui.theme.ImanTheme
import ah.android.iman.ui.util.PreviewDarkLight
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp

@Composable
fun BottomBarItem(
    selected: Boolean,
    navigationItem: BottomNavigationItem,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .clip(CircleShape)
            .clickable { onClick() }
            .padding(all = 2.dp)
    ) {
        Icon(
            imageVector = navigationItem.icon,
            contentDescription = navigationItem.title,
            tint = if (selected) MaterialTheme.colorScheme.primary
            else MaterialTheme.colorScheme.onPrimary,
            modifier = Modifier
                .padding(all = 4.dp)
                .fillMaxWidth()
                .wrapContentWidth()
        )
    }
}

@PreviewDarkLight
@Composable
fun PreviewBottomBarItem() {
    ImanTheme {
        BottomBarItem(
            selected = false,
            navigationItem = BottomNavigationItem.ShoppingCart
        ) {}
    }
}
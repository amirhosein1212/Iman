package ah.android.iman.ui.screens.home

import ah.android.iman.ui.theme.ImanTheme
import ah.android.iman.ui.util.PreviewDarkLight
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBarView(
    modifier: Modifier = Modifier,
    searchAction: (String) -> Unit
) {
    var searchValue by rememberSaveable {
        mutableStateOf("")
    }
    Surface(
        shape = RoundedCornerShape(size = 30.dp),
        modifier = modifier.padding(top = 8.dp, start = 8.dp, end = 8.dp)
    ) {
        TextField(
            value = searchValue,
            onValueChange = { searchValue = it },
            maxLines = 1,
            textStyle = TextStyle.Default.copy(
                fontWeight = FontWeight(400),
                fontSize = 16.sp
            ),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "search",
                    Modifier.clickable {
                        searchAction(searchValue)
                    }
                )
            },
            placeholder = {
                Text(text = "Search")
            },
            colors = TextFieldDefaults.textFieldColors(
                textColor = MaterialTheme.colorScheme.onSurface,
                disabledIndicatorColor = Color.Transparent,
                errorIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
            )
        )
    }
}

@PreviewDarkLight
@Composable
fun PreviewTopBarView() {
    ImanTheme {
        TopBarView(
            modifier = Modifier.fillMaxWidth()
        ) {}
    }
}
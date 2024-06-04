package teacher.task.project.core.ui.window

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

actual val windowWidth: Dp
    @Composable
    get() = LocalConfiguration.current.screenWidthDp.dp

actual val windowHeight: Dp
    @Composable
    get() = LocalConfiguration.current.screenHeightDp.dp
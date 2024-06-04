package teacher.task.project.core.ui.window

import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.platform.LocalWindowInfo
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalComposeUiApi::class)
actual val windowWidth: Dp
    @Composable
    get() = LocalWindowInfo.current.containerSize.width.dp

@OptIn(ExperimentalComposeUiApi::class)
actual val windowHeight: Dp
    @Composable
    get() = LocalWindowInfo.current.containerSize.height.dp
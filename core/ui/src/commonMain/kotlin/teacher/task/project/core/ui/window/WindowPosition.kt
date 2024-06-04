package teacher.task.project.core.ui.window

import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi

enum class WindowPosition {
    VERTICAL, HORIZONTAL
}


@OptIn(ExperimentalComposeUiApi::class)
@Composable
expect fun getWindowPosition(): WindowPosition 
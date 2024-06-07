package teacher.task.project.core.ui.window


import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.platform.LocalWindowInfo


@OptIn(ExperimentalComposeUiApi::class)
@Composable
actual fun getWindowPosition(): WindowPosition {
    val windowSize = LocalWindowInfo.current.containerSize
    return if (windowSize.height >= windowSize.width) {
        WindowPosition.VERTICAL
    } else {
        WindowPosition.HORIZONTAL
    }
}

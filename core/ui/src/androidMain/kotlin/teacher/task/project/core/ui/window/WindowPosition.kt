package teacher.task.project.core.ui.window

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration

@Composable
actual fun getWindowPosition(): WindowPosition {
    return when(LocalConfiguration.current.orientation) {
        Configuration.ORIENTATION_LANDSCAPE -> WindowPosition.HORIZONTAL
        Configuration.ORIENTATION_PORTRAIT -> WindowPosition.VERTICAL
        else -> WindowPosition.VERTICAL
    }
}

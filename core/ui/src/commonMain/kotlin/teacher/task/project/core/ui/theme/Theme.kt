package teacher.task.project.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import teacher.task.project.ui.theme.colors.darkColors
import teacher.task.project.ui.theme.colors.lightColors
import teacher.task.project.ui.theme.shapes.tutorsScheduleShapes
import teacher.task.project.ui.theme.typography.tutorsScheduleTypography


@Composable
fun TutorsScheduleTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = when {
        darkTheme -> darkColors
        else -> lightColors
    }

    StatusBar(colors, darkTheme)

    CompositionLocalProvider(
        LocalTutorsScheduleColors provides colors,
        LocalTutorsScheduleTypography provides tutorsScheduleTypography,
        LocalTutorsScheduleShapes provides tutorsScheduleShapes,
        content = content
    )
}
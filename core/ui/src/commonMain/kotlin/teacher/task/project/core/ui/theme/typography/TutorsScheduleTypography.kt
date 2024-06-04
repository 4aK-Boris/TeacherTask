package teacher.task.project.ui.theme.typography

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.text.TextStyle

@Immutable
data class TutorsScheduleTypography(
    val title1ForWidget: TextStyle,
    val title2ForWidget: TextStyle,
    val title1: TextStyle,
    val title2: TextStyle,
    val subTitle: TextStyle,
    val subTitle2: TextStyle,
    val textField: TextStyle,
    val textFieldFilter: TextStyle,
    val button: TextStyle,
    val text1: TextStyle,
    val filter: TextStyle,
    val studentNumber: TextStyle,
    val studentAndGroupName: TextStyle,
    val clockPrimary: TextStyle,
    val clockSecondary: TextStyle,
    val clockTitle: TextStyle,
    val weekday: TextStyle,
    val calendarHeader: TextStyle
)

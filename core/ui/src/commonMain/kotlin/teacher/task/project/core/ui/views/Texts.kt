package teacher.task.project.core.ui.views

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import teacher.task.project.ui.theme.LocalTutorsScheduleColors
import teacher.task.project.ui.theme.LocalTutorsScheduleTypography
import teacher.task.project.ui.theme.colors.MainBlue

@Composable
fun Title1Text(text: String, modifier: Modifier = Modifier) {
    val style = LocalTutorsScheduleTypography.current.title1
    val color = LocalTutorsScheduleColors.current.textPrimary

    Text(text = text, style = style, color = color, modifier = modifier)
}

@Composable
fun Title2Text(modifier: Modifier = Modifier, text: String) {
    val style = LocalTutorsScheduleTypography.current.title2
    val color = LocalTutorsScheduleColors.current.textPrimary

    Text(modifier = modifier, text = text, style = style, color = color, maxLines = 3, overflow = TextOverflow.Ellipsis)
}

@Composable
fun SubTitle1Text(modifier: Modifier = Modifier, text: String, textColor: Color? = null) {
    val style = LocalTutorsScheduleTypography.current.subTitle
    val color = textColor ?: LocalTutorsScheduleColors.current.textSecondary

    Text(modifier = modifier, text = text, style = style, color = color)
}

@Composable
fun SubTitle2Text(modifier: Modifier = Modifier, text: String, textColor: Color? = null) {
    val style = LocalTutorsScheduleTypography.current.subTitle2
    val color = textColor ?: LocalTutorsScheduleColors.current.textSecondary

    Text(modifier = modifier, text = text, style = style, color = color)
}

@Composable
fun Title1ForWidgetText(text: String, modifier: Modifier = Modifier, textColor: Color? = null) {
    val style = LocalTutorsScheduleTypography.current.title1ForWidget
    val color = textColor ?: LocalTutorsScheduleColors.current.textPrimary

    Text(text = text, style = style, color = color, modifier = modifier)
}

@Composable
fun Title2ForWidgetText(text: String, modifier: Modifier = Modifier, textAlign: TextAlign = TextAlign.Start, textColor: Color? = null) {
    val style = LocalTutorsScheduleTypography.current.title2ForWidget
    val color = textColor ?: LocalTutorsScheduleColors.current.textHint

    Text(text = text, style = style.copy(textAlign = textAlign), color = color, modifier = modifier, overflow = TextOverflow.Ellipsis)
}

//@Composable
//fun HintText(text: String) {
//
//    val style = LocalTutorsScheduleTypography.current.hint
//    val color = LocalTutorsScheduleColors.current.textHint
//
//    Text(text = text, style = style, color = color)
//}
//
//@Composable
//fun SubBodyText(text: String, modifier: Modifier = Modifier, textAlign: TextAlign = TextAlign.Start) {
//    val style = LocalTutorsScheduleTypography.current.subBody
//    val color = LocalTutorsScheduleColors.current.textPrimary
//
//    Text(text = text, style = style.copy(textAlign = textAlign), color = color, modifier = modifier)
//}

@Composable
fun FilterText(text: String, modifier: Modifier = Modifier, color: Color) {

    val style = LocalTutorsScheduleTypography.current.filter

    Text(text = text, style = style, modifier = modifier, color = color)
}

@Composable
fun StudentsAndGroupText(text: String, modifier: Modifier = Modifier, color: Color) {

    val style = LocalTutorsScheduleTypography.current.studentAndGroupName

    Text(text = text, style = style, modifier = modifier, color = color)
}

@Composable
fun StudentsNumberText(text: String, modifier: Modifier = Modifier) {

    val style = LocalTutorsScheduleTypography.current.studentNumber
    val color = LocalTutorsScheduleColors.current.iconPrimary

    Text(text = text, style = style, modifier = modifier, color = color)
}

@Composable
fun ClockPrimaryText(text: String, modifier: Modifier = Modifier) {

    val style = LocalTutorsScheduleTypography.current.clockPrimary

    Text(text = text, style = style, modifier = modifier, color = MainBlue)
}

@Composable
fun ClockSecondaryText(text: String, modifier: Modifier = Modifier, color: Color) {

    val style = LocalTutorsScheduleTypography.current.clockSecondary

    Text(text = text, style = style, modifier = modifier, color = color)
}

@Composable
fun ClockTitleText(text: String, modifier: Modifier = Modifier) {

    val style = LocalTutorsScheduleTypography.current.clockTitle
    val color = LocalTutorsScheduleColors.current.textPrimary

    Text(text = text, style = style, modifier = modifier, color = color)
}

@Composable
fun WeekdayText(text: String, modifier: Modifier = Modifier) {

    val style = LocalTutorsScheduleTypography.current.weekday
    val color = LocalTutorsScheduleColors.current.textPrimary

    Text(text = text, style = style, modifier = modifier, color = color)
}

@Composable
fun CalendarHeaderText(text: String, modifier: Modifier = Modifier) {

    val style = LocalTutorsScheduleTypography.current.calendarHeader
    val color = MainBlue

    Text(text = text, style = style, modifier = modifier, color = color)
}

//@Composable
//fun EditableText(title: String, text: String, hint: String) {
//
//    val colors = LocalTutorsScheduleColors.current
//    val shapes = LocalTutorsScheduleShapes.current
//
//    val textStyle = LocalTutorsScheduleTypography.current.textField
//
//    val textPrimaryColor = colors.textPrimary
//    val textHintColor = colors.textFieldHint
//    val backgroundEmptyColor = colors.textFieldEmptyBackground
//    val backgroundNotEmptyColor = colors.textFieldBackground
//    val borderColor = colors.textFieldBorder
//
//    val borderShape = shapes.textFieldBorder
//    val textShape = shapes.textField
//
//    val textInTextField = text.ifBlank { hint }
//    val backgroundColor = if (text.isBlank()) backgroundEmptyColor else backgroundNotEmptyColor
//    val textColor = if (text.isBlank()) textHintColor else textPrimaryColor
//
//    Column(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(horizontal = 16.dp),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.Start
//    ) {
//
//        Title2Text(text = title)
//
//        VerticalSpacer(height = 12.dp)
//
//        Box(
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(height = 50.dp)
//                .border(width = 1.dp, color = borderColor, shape = borderShape),
//            contentAlignment = Alignment.CenterStart
//        ) {
//            Box(
//                modifier = Modifier
//                    .padding(all = 2.dp)
//                    .fillMaxSize()
//                    .background(color = backgroundColor, shape = textShape)
//            ) {
//                Text(
//                    text = textInTextField,
//                    style = textStyle,
//                    color = textColor,
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .align(alignment = Alignment.CenterStart)
//                        .padding(horizontal = 20.dp)
//                )
//            }
//        }
//    }
//}
//
//@Composable
//fun EditableTextWithEdit(
//    title: String,
//    text: String,
//    hint: String,
//    textFieldState: TextFieldState = TextFieldState.DEFAULT,
//    iconEnabled: Boolean = true,
//    iconVisible: Boolean = true,
//    enabled: Boolean = true,
//    onClick: () -> Unit
//) {
//
//    val colors = LocalTutorsScheduleColors.current
//    val shapes = LocalTutorsScheduleShapes.current
//
//    val textStyle = LocalTutorsScheduleTypography.current.textField
//
//    val textPrimaryColor = colors.textPrimary
//    val textHintColor = colors.textFieldHint
//    val backgroundEmptyColor = colors.textFieldEmptyBackground
//    val backgroundNotEmptyColor = colors.textFieldBackground
//    val borderColor = textFieldState.unfocusedBorderColor
//
//    val borderShape = shapes.textFieldBorder
//    val textShape = shapes.textField
//
//    val textInTextField = text.ifBlank { hint }
//    val backgroundColor = if (text.isBlank()) backgroundEmptyColor else backgroundNotEmptyColor
//    val textColor = if (text.isBlank()) textHintColor else textPrimaryColor
//
//    Column(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(horizontal = 16.dp),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.Top, horizontalArrangement = Arrangement.SpaceBetween) {
//
//            Title2Text(text = title)
//
//            if (iconVisible) {
//
//                SecondaryEditIconButton(enabled = iconEnabled, onClick = onClick)
//            }
//        }
//
//        VerticalSpacer(height = 12.dp)
//
//        Box(
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(height = 50.dp)
//                .border(width = 1.dp, color = borderColor, shape = borderShape)
//                .clickable(onClick = onClick, role = Role.Button, enabled = enabled),
//            contentAlignment = Alignment.CenterStart
//        ) {
//            Box(
//                modifier = Modifier
//                    .padding(all = 2.dp)
//                    .fillMaxSize()
//                    .background(color = backgroundColor, shape = textShape)
//                    .clickable(onClick = onClick, role = Role.Button, enabled = enabled), contentAlignment = Alignment.CenterEnd
//            ) {
//                Text(
//                    text = textInTextField,
//                    style = textStyle,
//                    color = textColor,
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .align(alignment = Alignment.CenterStart)
//                        .padding(horizontal = 20.dp)
//                        .clickable(onClick = onClick, role = Role.Button, enabled = enabled)
//                )
//
//                textFieldState.rightIcon
//            }
//
//        }
//    }
//}

//@Preview
//@Composable
//private fun EditableTextPreviewWithEmptyDataAndLightTheme() {
//
//    TutorsScheduleTheme(darkTheme = false) {
//
//        Box(
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(height = 200.dp), contentAlignment = Alignment.Center
//        ) {
//
//            EditableTextWithEdit(title = EMAIL_FIELD_TITLE, hint = EMAIL_FIELD_HINT, text = EMPTY_STRING) {
//
//            }
//        }
//    }
//}
//
//@Preview
//@Composable
//private fun EditableTextPreviewWithDataAndLightTheme() {
//
//    TutorsScheduleTheme(darkTheme = false) {
//
//        Box(
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(height = 200.dp), contentAlignment = Alignment.Center
//        ) {
//
//            EditableTextWithEdit(title = EMAIL_FIELD_TITLE, hint = EMAIL_FIELD_HINT, text = EMAIL_FIELD_TEXT) {
//
//            }
//        }
//    }
//}
//
//@Preview
//@Composable
//private fun EditableTextPreviewWithEmptyDataAndDarkTheme() {
//
//    TutorsScheduleTheme(darkTheme = true) {
//
//        Box(
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(height = 200.dp), contentAlignment = Alignment.Center
//        ) {
//
//            EditableTextWithEdit(title = EMAIL_FIELD_TITLE, hint = EMAIL_FIELD_HINT, text = EMPTY_STRING) {
//
//            }
//        }
//    }
//}
//
//@Preview
//@Composable
//private fun EditableTextPreviewWithDataAndDarkTheme() {
//
//    TutorsScheduleTheme(darkTheme = true) {
//
//        Box(
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(height = 200.dp), contentAlignment = Alignment.Center
//        ) {
//
//            EditableTextWithEdit(title = EMAIL_FIELD_TITLE, hint = EMAIL_FIELD_HINT, text = EMAIL_FIELD_TEXT) {
//
//            }
//        }
//    }
//}

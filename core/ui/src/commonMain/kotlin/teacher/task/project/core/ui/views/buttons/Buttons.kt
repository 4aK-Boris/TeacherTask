package teacher.task.project.core.ui.views.buttons

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import teacher.task.project.core.ui.BUTTON_TEXT
import org.jetbrains.compose.ui.tooling.preview.Preview
import teacher.task.project.ui.theme.LocalTutorsScheduleColors
import teacher.task.project.ui.theme.LocalTutorsScheduleShapes
import teacher.task.project.ui.theme.LocalTutorsScheduleTypography
import teacher.task.project.ui.theme.TutorsScheduleTheme

@Composable
fun PrimaryButton(modifier: Modifier = Modifier, text: String, onClick: () -> Unit) {

    val backgroundColor = LocalTutorsScheduleColors.current.primaryButtonBackground
    val textColor = LocalTutorsScheduleColors.current.primaryButtonText

    DefaultButton(modifier = modifier, text = text, background = backgroundColor, textColor = textColor, onClick = onClick)
}

@Composable
fun SecondaryButton(modifier: Modifier = Modifier, text: String, onClick: () -> Unit) {

    val backgroundColor = LocalTutorsScheduleColors.current.secondaryButtonBackground
    val textColor = LocalTutorsScheduleColors.current.secondaryButtonText

    DefaultButton(modifier = modifier, text = text, background = backgroundColor, textColor = textColor, onClick = onClick)
}

@Composable
fun HintButton(modifier: Modifier = Modifier, text: String, onClick: () -> Unit) {

    val textColor = LocalTutorsScheduleColors.current.hintButtonText
    val buttonTextStyle = LocalTutorsScheduleTypography.current.button

    Text(
        text = text,
        color = textColor,
        style = buttonTextStyle,
        modifier = modifier
            .padding(horizontal = 16.dp)
            .clickable(onClick = onClick)
    )
}

@Composable
fun CriticalButton(modifier: Modifier = Modifier, text: String, onClick: () -> Unit) {

    val textColor = LocalTutorsScheduleColors.current.criticalButtonText
    val backgroundColor = LocalTutorsScheduleColors.current.secondaryButtonBackground

    DefaultButton(modifier = modifier, text = text, background = backgroundColor, textColor = textColor, onClick = onClick)
}

@Composable
private fun DefaultButton(modifier: Modifier, text: String, background: Color, textColor: Color, onClick: () -> Unit) {

    val buttonTextStyle = LocalTutorsScheduleTypography.current.button
    val buttonShape = LocalTutorsScheduleShapes.current.button

    Button(
        onClick = onClick,
        shape = buttonShape,
        colors = ButtonDefaults.buttonColors(backgroundColor = background),
        modifier = modifier
            .requiredWidth(width = 360.dp)
            .padding(horizontal = 16.dp)
            .height(height = 48.dp),
    ) {
        Text(text = text, style = buttonTextStyle, color = textColor)
    }
}

@Preview
@Composable
private fun PrimaryButtonPreviewWithLightTheme() {

    TutorsScheduleTheme(darkTheme = false) {
        PrimaryButton(text = BUTTON_TEXT) {

        }
    }
}

@Preview
@Composable
private fun PrimaryButtonPreviewWithDarkTheme() {

    TutorsScheduleTheme(darkTheme = true) {
        PrimaryButton(text = BUTTON_TEXT) {

        }
    }
}

@Preview
@Composable
private fun SecondaryButtonPreviewWithLightTheme() {

    TutorsScheduleTheme(darkTheme = false) {
        SecondaryButton(text = BUTTON_TEXT) {

        }
    }
}

@Preview
@Composable
private fun SecondaryButtonPreviewWithDarkTheme() {

    TutorsScheduleTheme(darkTheme = true) {
        SecondaryButton(text = BUTTON_TEXT) {

        }
    }
}

@Preview
@Composable
private fun HintButtonPreviewWithLightTheme() {

    TutorsScheduleTheme(darkTheme = false) {
        HintButton(text = BUTTON_TEXT) {

        }
    }
}

@Preview
@Composable
private fun HintButtonPreviewWithDarkTheme() {

    TutorsScheduleTheme(darkTheme = true) {
        HintButton(text = BUTTON_TEXT) {

        }
    }
}

@Preview
@Composable
private fun CriticalButtonPreviewWithLightTheme() {

    TutorsScheduleTheme(darkTheme = false) {
        CriticalButton(text = BUTTON_TEXT) {

        }
    }
}

@Preview
@Composable
private fun CriticalButtonPreviewWithDarkTheme() {

    TutorsScheduleTheme(darkTheme = true) {
        CriticalButton(text = BUTTON_TEXT) {

        }
    }
}
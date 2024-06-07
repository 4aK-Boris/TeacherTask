package teacher.task.project.ui.theme.typography

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.Font
import teacher.task.project.ui.theme.colors.Black
import teachertask.core.ui.generated.resources.Res.font
import teachertask.core.ui.generated.resources.fredoka
import teachertask.core.ui.generated.resources.montserrat_100
import teachertask.core.ui.generated.resources.montserrat_200
import teachertask.core.ui.generated.resources.montserrat_300
import teachertask.core.ui.generated.resources.montserrat_400
import teachertask.core.ui.generated.resources.montserrat_500
import teachertask.core.ui.generated.resources.montserrat_600
import teachertask.core.ui.generated.resources.montserrat_700
import teachertask.core.ui.generated.resources.montserrat_800
import teachertask.core.ui.generated.resources.montserrat_900

private val montserratFontFamily: FontFamily
    @Composable
    get() = FontFamily(
        Font(resource = font.montserrat_100, weight = FontWeight.W100),
        Font(resource = font.montserrat_200, weight = FontWeight.W200),
        Font(resource = font.montserrat_300, weight = FontWeight.W300),
        Font(resource = font.montserrat_400, weight = FontWeight.W400),
        Font(resource = font.montserrat_500, weight = FontWeight.W500),
        Font(resource = font.montserrat_600, weight = FontWeight.W600),
        Font(resource = font.montserrat_700, weight = FontWeight.W700),
        Font(resource = font.montserrat_800, weight = FontWeight.W800),
        Font(resource = font.montserrat_900, weight = FontWeight.W900)
    )

private val fredokaFontFamily: FontFamily
    @Composable
    get() = FontFamily(Font(resource = font.fredoka))

internal val toastTextStyle: TextStyle
    @Composable
    get() = TextStyle(
        fontFamily = montserratFontFamily,
        fontWeight = FontWeight.W400,
        fontSize = 14.sp,
        lineHeight = 17.sp,
        textAlign = TextAlign.Start,
        color = Black
    )

val tutorsScheduleTypography: TutorsScheduleTypography
    @Composable
    get() = TutorsScheduleTypography(
        title1ForWidget = TextStyle(
            fontFamily = montserratFontFamily,
            fontWeight = FontWeight.W500,
            fontSize = 16.sp,
            lineHeight = 20.sp,
            textAlign = TextAlign.Start,
        ),
        title2ForWidget = TextStyle(
            fontFamily = montserratFontFamily,
            fontWeight = FontWeight.W500,
            fontSize = 14.sp,
            lineHeight = 17.sp,
            textAlign = TextAlign.Start,
        ),
        title1 = TextStyle(
            fontFamily = montserratFontFamily,
            fontWeight = FontWeight.W600,
            fontSize = 20.sp,
            lineHeight = 24.sp,
            textAlign = TextAlign.Center,
        ),
        title2 = TextStyle(
            fontFamily = montserratFontFamily,
            fontWeight = FontWeight.W600,
            fontSize = 16.sp,
            lineHeight = 20.sp,
            textAlign = TextAlign.Start,
        ),
        subTitle = TextStyle(
            fontFamily = montserratFontFamily,
            fontWeight = FontWeight.W400,
            fontSize = 13.sp,
            textAlign = TextAlign.Start,
        ),
        subTitle2 = TextStyle(
            fontFamily = montserratFontFamily,
            fontWeight = FontWeight.W500,
            fontSize = 12.sp,
            lineHeight = 15.sp,
            textAlign = TextAlign.Center,
        ),
        textField = TextStyle(
            fontFamily = montserratFontFamily,
            fontWeight = FontWeight.W600,
            fontSize = 16.sp,
            lineHeight = 20.sp,
            textAlign = TextAlign.Start,
            textDecoration = TextDecoration.None
        ),
        textFieldFilter = TextStyle(
            fontFamily = montserratFontFamily,
            fontWeight = FontWeight.W500,
            fontSize = 13.sp,
            lineHeight = 17.sp,
            textAlign = TextAlign.Start,
            textDecoration = TextDecoration.None
        ),
        button = TextStyle(
            fontFamily = montserratFontFamily,
            fontWeight = FontWeight.W600,
            fontSize = 16.sp,
            lineHeight = 20.sp,
            textAlign = TextAlign.Center
        ),
        text1 = TextStyle(
            fontFamily = montserratFontFamily,
            fontWeight = FontWeight.W400,
            fontSize = 14.sp,
            lineHeight = 18.sp,
            textAlign = TextAlign.Start
        ),
        filter = TextStyle(
            fontFamily = montserratFontFamily,
            fontWeight = FontWeight.W500,
            fontSize = 13.sp,
            lineHeight = 15.sp,
            textAlign = TextAlign.Center
        ),
        studentNumber = TextStyle(
            fontFamily = montserratFontFamily,
            fontWeight = FontWeight.W500,
            fontSize = 14.sp,
            textAlign = TextAlign.Center
        ),
        studentAndGroupName = TextStyle(
            fontFamily = montserratFontFamily,
            fontWeight = FontWeight.W500,
            fontSize = 14.sp,
            lineHeight = 17.sp,
            textAlign = TextAlign.Start
        ),
        clockPrimary = TextStyle(
            fontFamily = montserratFontFamily,
            fontWeight = FontWeight.W400,
            fontSize = 56.sp,
            lineHeight = 64.sp,
            textAlign = TextAlign.Center
        ),
        clockSecondary = TextStyle(
            fontFamily = montserratFontFamily,
            fontWeight = FontWeight.W500,
            fontSize = 20.sp,
            lineHeight = 24.sp,
            textAlign = TextAlign.Center
        ),
        clockTitle = TextStyle(
            fontFamily = montserratFontFamily,
            fontWeight = FontWeight.W600,
            fontSize = 20.sp,
            lineHeight = 24.sp,
            textAlign = TextAlign.Center
        ),
        weekday = TextStyle(
            fontFamily = montserratFontFamily,
            fontWeight = FontWeight.W500,
            fontSize = 16.sp,
            lineHeight = 20.sp,
            textAlign = TextAlign.Start
        ),
        calendarHeader = TextStyle(
            fontFamily = montserratFontFamily,
            fontWeight = FontWeight.W500,
            fontSize = 14.sp,
            lineHeight = 14.sp,
            textAlign = TextAlign.Center
        )
    )
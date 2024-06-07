package teacher.task.project.core.ui.views.buttons

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import teacher.task.project.core.ui.views.FilterText
import teacher.task.project.ui.theme.LocalTutorsScheduleColors

@Composable
fun TopBarButton(modifier: Modifier = Modifier, title: String, isChecked: Boolean, onClick: () -> Unit) {

    val colors = LocalTutorsScheduleColors.current

    val checkedBackgroundColor = colors.filterPrimary
    val notCheckedBackgroundColor = colors.filterSecondary

    val checkedTextColor = colors.iconPrimary
    val notCheckedTextColor = colors.iconSecondary

    val backgroundColor = if (isChecked) checkedBackgroundColor else notCheckedBackgroundColor
    val textColor = if (isChecked) checkedTextColor else notCheckedTextColor

    Box(
        modifier = Modifier
            .height(height = 32.dp)
            .clip(shape = RoundedCornerShape(size = 7.dp))
            .clickable(onClick = onClick, role = Role.Button)
            .background(color = backgroundColor, shape = RoundedCornerShape(size = 7.dp))
            .padding(horizontal = 10.dp),
        contentAlignment = Alignment.Center
    ) {
        FilterText(text = title, color = textColor)
    }
}
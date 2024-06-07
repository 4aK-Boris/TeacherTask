package teacher.task.project.core.ui.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import teacher.task.project.ui.theme.LocalTutorsScheduleColors

@Composable
fun RowSecondaryWithLoader(
    modifier: Modifier = Modifier,
    isLoading: Boolean,
    horizontalArrangement: Arrangement.Horizontal = Arrangement.Center,
    content: @Composable () -> Unit
) {

    val scrollState = rememberScrollState()
   
    val backgroundColor = LocalTutorsScheduleColors.current.backgroundSecondary

    Row(
        modifier = modifier
            .fillMaxSize()
            .background(color = backgroundColor)
            .verticalScroll(state = scrollState),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = horizontalArrangement        
    ) {
        content()
    }

    if (isLoading) {
        Loader()
    }
}

@Composable
fun RowSecondary(
    modifier: Modifier = Modifier,
    horizontalArrangement: Arrangement.Horizontal = Arrangement.Center,
    content: @Composable () -> Unit
) {

    val scrollState = rememberScrollState()

    val backgroundColor = LocalTutorsScheduleColors.current.backgroundSecondary

    Row(
        modifier = modifier
            .fillMaxSize()
            .background(color = backgroundColor)
            .verticalScroll(state = scrollState),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = horizontalArrangement  
    ) {
        content()
    }
}

@Composable
fun RowPrimaryWithLoader(
    modifier: Modifier = Modifier,
    isLoading: Boolean,
    horizontalArrangement: Arrangement.Horizontal = Arrangement.Center,
    content: @Composable () -> Unit
) {

    val scrollState = rememberScrollState()
 
    val backgroundColor = LocalTutorsScheduleColors.current.backgroundPrimary

    Row(
        modifier = modifier
            .fillMaxSize()
            .background(color = backgroundColor)
            .verticalScroll(state = scrollState),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = horizontalArrangement  
    ) {
        content()
    }

    if (isLoading) {
        Loader()
    }
}

@Composable
fun RowPrimary(modifier: Modifier = Modifier, horizontalArrangement: Arrangement.Horizontal = Arrangement.Center, content: @Composable () -> Unit) {

    val scrollState = rememberScrollState()

    val backgroundColor = LocalTutorsScheduleColors.current.backgroundPrimary

    Row(
        modifier = modifier
            .fillMaxSize()
            .background(color = backgroundColor)
            .verticalScroll(state = scrollState),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = horizontalArrangement  
    ) {
        content()
    }
}
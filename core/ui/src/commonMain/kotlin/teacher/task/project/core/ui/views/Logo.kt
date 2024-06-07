package teacher.task.project.core.ui.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import teachertask.core.ui.generated.resources.Res
import teachertask.core.ui.generated.resources.logo

@Composable
fun Logo(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(resource = Res.drawable.logo),
        contentDescription = stringResource(resource = Res.string.logo),
        modifier = modifier.size(size = 205.dp)
    )
}
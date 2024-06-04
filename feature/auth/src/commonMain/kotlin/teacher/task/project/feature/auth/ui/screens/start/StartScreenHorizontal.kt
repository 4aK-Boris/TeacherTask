package teacher.task.project.feature.auth.ui.screens.start

import StartScreenViewModel
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import teacher.task.project.core.ui.views.Logo
import teacher.task.project.core.ui.views.RowPrimary
import teacher.task.project.core.ui.views.VerticalSpacer
import teacher.task.project.core.ui.views.buttons.PrimaryButton
import teacher.task.project.core.ui.views.buttons.SecondaryButton
import teacher.task.project.core.ui.window.windowWidth
import teacher.task.project.feature.auth.viewmodels.start.StartScreenEvent
import teachertask.feature.auth.generated.resources.Res
import teachertask.feature.auth.generated.resources.entrance
import teachertask.feature.auth.generated.resources.registration

@Composable
internal fun StartScreenHorizontal(navController: NavController, viewModel: StartScreenViewModel) {
    
    val windowWidth = windowWidth / 2
    
    RowPrimary {
        
        Box(modifier = Modifier.width(width = windowWidth), contentAlignment = Alignment.Center) {

            Logo()
        }

        Column(modifier = Modifier.width(width = windowWidth).padding(horizontal = 16.dp), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {

            PrimaryButton(text = stringResource(resource = Res.string.entrance)) {
                viewModel.obtainEvent(StartScreenEvent.LoginButtonClicked(navController))
            }

            VerticalSpacer(height = 24.dp)

            SecondaryButton(text = stringResource(resource = Res.string.registration)) {
                viewModel.obtainEvent(StartScreenEvent.RegisterButtonClicked(navController))
            }
        }
    }
}

@Preview
@Composable
private fun StartScreenHorizontalPreview() {
    val navController = rememberNavController()

    val viewmodel = viewModel { StartScreenViewModel() }

    StartScreenHorizontal(navController, viewmodel)
}


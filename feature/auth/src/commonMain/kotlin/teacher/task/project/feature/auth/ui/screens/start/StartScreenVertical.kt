package teacher.task.project.feature.auth.ui.screens.start

import StartScreenViewModel
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalWindowInfo
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import teacher.task.project.core.ui.views.ColumnPrimary
import teacher.task.project.core.ui.views.Logo
import teacher.task.project.core.ui.views.VerticalSpacer
import teacher.task.project.core.ui.views.buttons.PrimaryButton
import teacher.task.project.core.ui.views.buttons.SecondaryButton
import teacher.task.project.core.ui.window.windowHeight
import teacher.task.project.feature.auth.viewmodels.start.StartScreenEvent
import teachertask.feature.auth.generated.resources.Res
import teachertask.feature.auth.generated.resources.entrance
import teachertask.feature.auth.generated.resources.registration

@OptIn(ExperimentalComposeUiApi::class)
@Composable
internal fun StartScreenVertical(navController: NavController, viewModel: StartScreenViewModel) {
    
    ColumnPrimary(verticalArrangement = Arrangement.spacedBy(24.dp, alignment = Alignment.Bottom)) {
        
        Box(modifier = Modifier.height(height = windowHeight - 216.dp), contentAlignment = Alignment.Center) {

            Logo()
        }

        Column(modifier = Modifier.fillMaxWidth(), verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.CenterHorizontally) {
            
            VerticalSpacer(height = 48.dp)

            PrimaryButton(text = stringResource(resource = Res.string.entrance)) {
                viewModel.obtainEvent(StartScreenEvent.LoginButtonClicked(navController))
            }

            VerticalSpacer(height = 24.dp)

            SecondaryButton(text = stringResource(resource = Res.string.registration)) {
                viewModel.obtainEvent(StartScreenEvent.RegisterButtonClicked(navController))
            }

            VerticalSpacer(height = 48.dp)
        }
    }
}

@Preview
@Composable
private fun StartScreenVerticalPreview() {
    val navController = rememberNavController()

    val viewmodel = viewModel { StartScreenViewModel() }

    StartScreenVertical(navController, viewmodel)
}
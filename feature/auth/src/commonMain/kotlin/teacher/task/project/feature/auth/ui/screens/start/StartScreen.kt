import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.navigation.NavController
import org.koin.compose.viewmodel.koinViewModel
import org.koin.core.annotation.KoinExperimentalAPI
import teacher.task.project.core.ui.window.WindowPosition
import teacher.task.project.core.ui.window.getWindowPosition
import teacher.task.project.feature.auth.ui.screens.start.StartScreenHorizontal
import teacher.task.project.feature.auth.ui.screens.start.StartScreenVertical
import teacher.task.project.feature.auth.viewmodels.start.StartScreenEvent

@OptIn(KoinExperimentalAPI::class)
@Composable
internal fun StartScreen(navController: NavController, viewModel: StartScreenViewModel = koinViewModel()) {
  
    val viewState by viewModel.viewStates().collectAsState()
    val viewAction by viewModel.viewActions().collectAsState(null)

    LaunchedEffect(key1 = Unit) {
        viewModel.obtainEvent(viewEvent = StartScreenEvent.CheckAuth)
    }
    
    val windowPosition = getWindowPosition()
    
    if (windowPosition == WindowPosition.HORIZONTAL) {
        StartScreenHorizontal(navController, viewModel)
    } else {
        StartScreenVertical(navController, viewModel)
    }
}
package teacher.task.project.feature.auth.ui.screens.start

import StartScreenViewModel
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController

@Preview()
@Composable
fun StartScreenVerticalAndroidPreview() {

    val navController = rememberNavController()

    val viewmodel = viewModel { StartScreenViewModel() }

    StartScreenVertical(navController, viewmodel)
}
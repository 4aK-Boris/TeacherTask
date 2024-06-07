import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import org.jetbrains.compose.ui.tooling.preview.Preview
import teacher.task.project.navigation.Navigation
import teacher.task.project.ui.theme.TutorsScheduleTheme

@Composable
@Preview
fun App() {

    val navController = rememberNavController()

    TutorsScheduleTheme {

        Navigation(navController = navController)
    }
}
import androidx.compose.ui.Alignment
import androidx.compose.ui.window.*
import org.koin.core.context.startKoin
import teacher.task.project.firebase.FirebaseApplication

fun main() = application {

    startKoin {
        modules(appModule)
    }

    val k = FirebaseApplication.configureFirebase()

    println(k)

    val state = rememberWindowState(position = WindowPosition(alignment = Alignment.Center))

    Window(
        onCloseRequest = ::exitApplication,
        title = "TeacherTask",
        state = state,
        undecorated = false
    ) {
        App()
    }
}
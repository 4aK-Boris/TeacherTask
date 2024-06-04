import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import kotlinx.browser.document
import org.koin.core.context.startKoin
import teacher.task.project.firebase.FirebaseApplication

@OptIn(ExperimentalComposeUiApi::class)
fun main() {

    FirebaseApplication.configureFirebase()

    startKoin {
        modules(appModule)
    }

    ComposeViewport(document.body!!) {
        App()
    }
}
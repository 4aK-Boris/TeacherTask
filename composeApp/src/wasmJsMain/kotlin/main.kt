import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import kotlinx.browser.document
import kotlinx.browser.window
import org.koin.core.context.startKoin
import teacher.task.project.firebase.FirebaseApplication

@OptIn(ExperimentalComposeUiApi::class)
fun main() {

    startKoin {
        modules(appModule)
    }

    ComposeViewport(document.body!!) {
        App()

        FirebaseApplication.configureFirebase()
    }
}
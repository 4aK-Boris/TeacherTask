import androidx.navigation.NavController
import org.koin.core.component.inject
import teacher.task.project.core.viewmodel.BaseViewModel
import teacher.task.project.domain.navigation.AuthNavigation
import teacher.task.project.feature.auth.viewmodels.start.StartScreenAction
import teacher.task.project.feature.auth.viewmodels.start.StartScreenEvent
import teacher.task.project.feature.auth.viewmodels.start.StartScreenViewState

class StartScreenViewModel(): BaseViewModel<StartScreenViewState, StartScreenAction, StartScreenEvent>(initialState = StartScreenViewState(isAuth = false)) {
    
    private val navigation by inject<AuthNavigation>()
    
    override fun obtainEvent(viewEvent: StartScreenEvent) {
        when(viewEvent) {
            StartScreenEvent.CheckAuth -> {}
            is StartScreenEvent.LoginButtonClicked -> navigateToLoginScreen(viewEvent)
            is StartScreenEvent.RegisterButtonClicked -> navigateToRegistrationScreen(viewEvent)
        }
    }

    private fun navigateToLoginScreen(viewEvent: StartScreenEvent.LoginButtonClicked) {
        navigation.navigateToLoginScreen(navController = viewEvent.navController)
    }
    
    private fun navigateToRegistrationScreen(viewEvent: StartScreenEvent.RegisterButtonClicked) {
        navigation.navigateToRegistrationScreen(navController = viewEvent.navController)
    }
}
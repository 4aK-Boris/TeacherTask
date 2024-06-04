package teacher.task.project.feature.auth.viewmodels.start

import androidx.navigation.NavController

sealed class StartScreenEvent {
    data object CheckAuth: StartScreenEvent()
    data class LoginButtonClicked(val navController: NavController) : StartScreenEvent()
    data class RegisterButtonClicked(val navController: NavController) : StartScreenEvent()
}
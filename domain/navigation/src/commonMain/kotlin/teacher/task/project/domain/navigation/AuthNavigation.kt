package teacher.task.project.domain.navigation

import androidx.navigation.NavController
import teacher.task.project.ui.screens.AuthenticationScreens

class AuthNavigation {
    
    fun navigateToLoginScreen(navController: NavController) {
        navController.navigate(AuthenticationScreens.LoginScreen.route)
    }

    fun navigateToRegistrationScreen(navController: NavController) {
        navController.navigate(AuthenticationScreens.RegistrationScreen.route)
    }
}
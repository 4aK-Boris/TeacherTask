package teacher.task.project.feature.auth.navigation

import StartScreen
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import teacher.task.project.feature.auth.ui.screens.LoginScreen
import teacher.task.project.feature.auth.ui.screens.RegistrationScreen
import teacher.task.project.ui.screens.AuthenticationScreens


fun NavGraphBuilder.authenticationNavigation(
    navController: NavController,
    route: String,
    startDestination: String = AuthenticationScreens.StartScreen.route
) {
    navigation(
        startDestination = startDestination,
        route = route
    ) {

        composable(
            route = AuthenticationScreens.StartScreen.route
        ) {
            StartScreen(navController)
        }

        composable(
            route = AuthenticationScreens.LoginScreen.route
        ) {
            LoginScreen()
        }

        composable(
            route = AuthenticationScreens.RegistrationScreen.route
        ) {
            RegistrationScreen()
        }
//
//        composable(
//            route = AuthenticationScreens.PasswordScreen.route,
//            arguments = AuthenticationScreens.PasswordScreen.arguments
//        ) { backStackEntry ->
//            val firstName = backStackEntry.arguments?.getString(AuthenticationScreens.PasswordScreen.FIRST_NAME)
//            val lastName = backStackEntry.arguments?.getString(AuthenticationScreens.PasswordScreen.LAST_NAME)
//            val patronymic = backStackEntry.arguments?.getString(AuthenticationScreens.PasswordScreen.PATRONYMIC)
//            val email = backStackEntry.arguments?.getString(AuthenticationScreens.PasswordScreen.EMAIL)
//            requireNotNull(email) { "email parameter wasn't found. Please make sure it's set!" }
//            //PasswordScreen(firstName, lastName, patronymic, email, authenticationNavigationListener)
//        }
//
//        composable(
//            route = AuthenticationScreens.PasswordResetScreen.route,
//            arguments = AuthenticationScreens.PasswordResetScreen.arguments
//        ) { backStackEntry ->
//            val email = backStackEntry.arguments?.getString(AuthenticationScreens.PasswordResetScreen.EMAIL)
//            //PasswordResetScreen(authenticationNavigationListener, email)
//        }
    }
}
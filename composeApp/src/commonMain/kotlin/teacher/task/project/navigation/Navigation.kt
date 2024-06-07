package teacher.task.project.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import dmitriy.losev.tutorsschedule.presentation.navigation.Screens
import teacher.task.project.feature.auth.navigation.authenticationNavigation

@Composable
fun Navigation(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    startDestination: String = Screens.AuthenticationScreen.route,
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {

        authenticationNavigation(navController = navController, route = Screens.AuthenticationScreen.route)

//        composable(
//            route = Screens.FinanceScreen.route
//        ) {
//            FinanceScreen()
//        }
//
//        profileNavigation(
//            profileNavigationListener = profileNavigationListener,
//            route = Screens.ProfileScreen.route
//        )
//
//        subjectsNavigation(
//            subjectsNavigationListener = subjectsNavigationListener,
//            route = Screens.SubjectsScreen.route
//        )
//
//        studentsNavigation(
//            studentsNavigationListener = studentsNavigationListener,
//            route = Screens.StudentsScreen.route
//        )
//
//        calendarNavigation(
//            calendarNavigationListener = calendarNavigationListener,
//            route = Screens.CalendarScreen.route
//        )
    }
}
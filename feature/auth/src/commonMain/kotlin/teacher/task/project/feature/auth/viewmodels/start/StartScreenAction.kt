package teacher.task.project.feature.auth.viewmodels.start

sealed class StartScreenAction {
    data object Auth: StartScreenAction()
    data object Login: StartScreenAction()
    data object Register: StartScreenAction()
}
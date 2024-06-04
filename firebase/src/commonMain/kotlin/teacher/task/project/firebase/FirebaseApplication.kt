package teacher.task.project.firebase

import org.koin.core.component.KoinComponent

expect object FirebaseApplication {

    fun configureFirebase(): String
}
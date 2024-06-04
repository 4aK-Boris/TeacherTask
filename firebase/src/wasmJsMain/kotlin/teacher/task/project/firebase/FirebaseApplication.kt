package teacher.task.project.firebase

actual object FirebaseApplication {

    actual fun configureFirebase(): String {
        return Firebase.app.name
    }
}
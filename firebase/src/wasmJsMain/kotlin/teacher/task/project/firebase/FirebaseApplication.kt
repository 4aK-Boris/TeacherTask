package teacher.task.project.firebase

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual object FirebaseApplication {

    actual fun configureFirebase(): String {
        return appName
    }
}
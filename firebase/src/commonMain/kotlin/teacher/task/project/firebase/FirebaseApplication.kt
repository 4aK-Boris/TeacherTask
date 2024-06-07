package teacher.task.project.firebase

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
expect object FirebaseApplication {

    fun configureFirebase(): String
}
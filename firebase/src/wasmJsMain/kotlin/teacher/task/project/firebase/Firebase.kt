package teacher.task.project.firebase

@JsModule("firebaseConfig.js")
external object Firebase {

    @JsName("app")
    val app: FirebaseApp
}
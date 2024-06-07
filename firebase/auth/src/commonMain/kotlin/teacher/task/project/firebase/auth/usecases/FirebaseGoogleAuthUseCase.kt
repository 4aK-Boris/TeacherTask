package teacher.task.project.firebase.auth.usecases

//import dev.gitlive.firebase.auth.GoogleAuthProvider
//import teacher.task.project.firebase.auth.core.GoogleAuthIsNotSuccessException
//
//
//class FirebaseGoogleAuthUseCase(
//    private val firebaseAuthHandler: teacher.task.project.firebase.auth.handlers.FirebaseAuthHandler,
//    private val resourcesManager: ResourcesManager
//): FirebaseAuthBaseUseCase() {
//
//    suspend fun authWithGoogle(client: SignInClient): IntentSender = convertException {
//        client.beginSignIn(buildSignInRequest()).await().pendingIntent.intentSender
//    }
//
//    suspend fun authWithGoogleIntent(intent: Intent?, client: SignInClient): Unit = convertException {
//        intent?.let {
//            val credential =
//            val googleIdToken = credential.googleIdToken
//            val googleCredentials = GoogleAuthProvider.credential()
//            firebaseAuthHandler.authWithCredential(googleCredentials)
//        } ?: throw GoogleAuthIsNotSuccessException()
//    }
//
//    private fun buildSignInRequest(): BeginSignInRequest {
//        return BeginSignInRequest.builder().setGoogleIdTokenRequestOptions(
//            BeginSignInRequest.GoogleIdTokenRequestOptions.builder().setSupported(true)
//                .setFilterByAuthorizedAccounts(true)
//                .setServerClientId(resourcesManager.getString(R.string.web_client_id)).build()
//        ).setAutoSelectEnabled(true).build()
//    }
//}
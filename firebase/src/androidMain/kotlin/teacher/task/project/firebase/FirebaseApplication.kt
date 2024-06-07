package teacher.task.project.firebase

import android.content.Context
import com.google.firebase.Firebase
import com.google.firebase.FirebaseApp
import com.google.firebase.FirebaseOptions
import com.google.firebase.appcheck.appCheck
import com.google.firebase.appcheck.debug.DebugAppCheckProviderFactory
import com.google.firebase.initialize
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual object FirebaseApplication: KoinComponent {

    private val context by inject<Context>()

    actual fun configureFirebase(): String {
        val options = getFirebaseOptions()
        Firebase.initialize(context, options)
        Firebase.appCheck.installAppCheckProviderFactory(DebugAppCheckProviderFactory.getInstance())
        return FirebaseApp.getInstance().name
    }

    private fun getFirebaseOptions(): FirebaseOptions {
        return FirebaseOptions.Builder()
            .setProjectId("teachertask1124")
            .setApplicationId("1:356272077223:web:c15399edbf176f33b81e82")
            .setApiKey("AIzaSyBXlUZRFfYC4unthwftcTYcUFHvUZ-yDEw")
            //.setDatabaseUrl()
            .setStorageBucket("teachertask1124.appspot.com")
            .build()
    }
}
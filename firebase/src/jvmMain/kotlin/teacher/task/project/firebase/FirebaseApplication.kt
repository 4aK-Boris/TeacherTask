package teacher.task.project.firebase

import android.app.Application
import com.google.firebase.Firebase
import com.google.firebase.FirebaseOptions
import com.google.firebase.FirebasePlatform
import com.google.firebase.initialize


@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual object FirebaseApplication {

    actual fun configureFirebase(): String {
        configurePlatform()
        val options = getFirebaseOptions()
        val app = Firebase.initialize(Application(), options)
        return app.name
    }

    private fun configurePlatform() {
        FirebasePlatform.initializeFirebasePlatform(object : FirebasePlatform() {
            val storage = mutableMapOf<String, String>()
            override fun store(key: String, value: String) = storage.set(key, value)
            override fun retrieve(key: String) = storage[key]
            override fun clear(key: String) {
                storage.remove(key)
            }

            override fun log(msg: String) = println(msg)
        })
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
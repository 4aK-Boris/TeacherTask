package teacher.task.project.firebase.auth.di

import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module
import teacher.task.project.firebase.auth.handlers.FirebaseAuthHandler

val firebaseAuthHandlerModule = module {

//    factoryOf(::FirebaseUserDataHandler)
//
//    factoryOf(::FirebaseAvatarHandler)

    factoryOf(::FirebaseAuthHandler)
}
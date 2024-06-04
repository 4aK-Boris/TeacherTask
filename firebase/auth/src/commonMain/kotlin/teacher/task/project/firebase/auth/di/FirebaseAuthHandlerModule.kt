package teacher.task.project.firebase.auth.di

import teacher.task.project.firebase.auth.handlers.FirebaseAuthHandler
import teacher.task.project.firebase.auth.handlers.FirebaseAvatarHandler
import teacher.task.project.firebase.auth.handlers.FirebaseUserDataHandler
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module

val firebaseAuthHandlerModule = module {

    factoryOf(::FirebaseUserDataHandler)

    factoryOf(::FirebaseAvatarHandler)

    factoryOf(::FirebaseAuthHandler)
}
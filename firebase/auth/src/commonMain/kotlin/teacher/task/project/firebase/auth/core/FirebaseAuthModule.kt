package teacher.task.project.firebase.auth.core

import teacher.task.project.firebase.auth.di.firebaseAuthHandlerModule
import teacher.task.project.firebase.auth.di.firebaseAuthUseCaseModule
import org.koin.dsl.module

val firebaseAuthModule = module {

    includes(
        firebaseAuthUseCaseModule,
        firebaseAuthHandlerModule,
    )
}
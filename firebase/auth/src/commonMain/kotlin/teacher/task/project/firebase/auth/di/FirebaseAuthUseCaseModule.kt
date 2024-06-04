package teacher.task.project.firebase.auth.di


import dmitriy.losev.auth.usecases.FirebaseGoogleAuthUseCase
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module

val firebaseAuthUseCaseModule = module {

    factoryOf(::FirebaseGoogleAuthUseCase)
}
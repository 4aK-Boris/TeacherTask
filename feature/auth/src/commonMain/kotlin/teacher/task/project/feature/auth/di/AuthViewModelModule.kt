package teacher.task.project.feature.auth.di

import StartScreenViewModel
import org.koin.compose.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val authViewModelModule = module(createdAtStart = false) {

    viewModelOf(::StartScreenViewModel)
}
package teacher.task.project.feature.auth.di

import org.koin.dsl.module

val authModule = module(createdAtStart = false) {

    includes(authViewModelModule)
}
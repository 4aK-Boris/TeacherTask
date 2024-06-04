import org.koin.dsl.module
import teacher.domainModule
import teacher.task.project.feature.auth.di.authModule

val appModule = module(createdAtStart = false) {

    includes(domainModule, authModule)
}
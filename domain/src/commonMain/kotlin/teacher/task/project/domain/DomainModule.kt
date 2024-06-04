package teacher

import org.koin.dsl.module
import teacher.task.project.domain.navigation.navigationModule

val domainModule = module(createdAtStart = false) {

    includes(navigationModule)
}
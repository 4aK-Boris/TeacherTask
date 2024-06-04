package teacher.task.project.domain.navigation

import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module

val navigationModule = module(createdAtStart = true) {
    
    factoryOf(::AuthNavigation)
}


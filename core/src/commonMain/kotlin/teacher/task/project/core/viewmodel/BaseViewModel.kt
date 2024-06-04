package teacher.task.project.core.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import org.koin.core.component.KoinComponent

abstract class BaseViewModel<State : Any, Action, Event>(initialState: State) : ViewModel(), KoinComponent {

    private val _viewStates = MutableStateFlow(initialState)

    private val _viewActions = MutableSharedFlow<Action?>(replay = 1, onBufferOverflow = BufferOverflow.DROP_OLDEST)

    fun viewStates(): WrappedStateFlow<State> = WrappedStateFlow(_viewStates.asStateFlow())

    fun viewActions(): WrappedSharedFlow<Action?> = WrappedSharedFlow(_viewActions.asSharedFlow())

    protected var viewState: State
        get() = _viewStates.value
        set(value) {
            _viewStates.value = value
        }

    protected var viewAction: Action?
        get() = _viewActions.replayCache.last()
        set(value) {
            _viewActions.tryEmit(value)
        }

    abstract fun obtainEvent(viewEvent: Event)
    
    protected fun withViewModelScope(block: suspend CoroutineScope.() -> Unit) {
        viewModelScope.launch(block = block)
    }

    protected open fun back(navController: NavController) {
        navController.popBackStack()
    }
}


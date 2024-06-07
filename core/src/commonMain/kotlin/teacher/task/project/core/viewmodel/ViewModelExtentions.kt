package teacher.task.project.core.viewmodel

import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

fun BaseViewModel<*, *, *>.runOnBackground(block: suspend () -> Unit): Job =
    viewModelScope.launch(Dispatchers.Default) {
        block()
    }

fun BaseViewModel<*, *, *>.runOnIO(block: suspend () -> Unit): Job =
    viewModelScope.launch(dispatcherIO) {
        block()
    }


fun BaseViewModel<*, *, *>.runOnMain(block: suspend () -> Unit): Job =
    viewModelScope.launch(Dispatchers.Main) {
        block()
    }

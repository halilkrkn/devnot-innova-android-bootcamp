package com.example.todoapp.fragments.tododetail

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.todoapp.data.model.Todo
import com.example.todoapp.repository.TodoAppRepository
import kotlinx.coroutines.launch

class TodoDetailViewModel(application: Application): AndroidViewModel(application) {
    val repository = TodoAppRepository(application)

    fun todoUpdate(todo: Todo) = viewModelScope.launch {
        repository.updateTodo(todo)
    }
}
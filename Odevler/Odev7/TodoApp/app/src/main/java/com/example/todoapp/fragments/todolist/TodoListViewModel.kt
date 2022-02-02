package com.example.todoapp.fragments.todolist

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.todoapp.data.model.Todo
import com.example.todoapp.repository.TodoAppRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class TodoListViewModel(application: Application) : AndroidViewModel(application) {

    var todoList: MutableLiveData<List<Todo>> = MutableLiveData()
    val repository = TodoAppRepository(application)


    fun getAllTodo() = viewModelScope.launch(Dispatchers.Main) {
        todoList.value = repository.getAllTodo()
    }

    fun deleteTodo(todo: Todo) = viewModelScope.launch{
        repository.deleteTodo(todo)
        getAllTodo()
    }

    fun backwardTodo(todo:Todo) = viewModelScope.launch{
        repository.backwardTodo(todo)
        getAllTodo()
    }

    fun searchTodo(searchWord: String) = viewModelScope.launch{
        todoList.value = repository.getSearchTodo(searchWord)
    }
}


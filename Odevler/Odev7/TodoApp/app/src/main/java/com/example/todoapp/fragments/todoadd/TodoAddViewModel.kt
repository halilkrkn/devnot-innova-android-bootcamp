package com.example.todoapp.fragments.todoadd

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.todoapp.data.model.Todo
import com.example.todoapp.repository.TodoAppRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class TodoAddViewModel(application: Application): AndroidViewModel(application) {

    val repository = TodoAppRepository(application)

    fun insertTodo(todo_task:String) = viewModelScope.launch(Dispatchers.Main){
        repository.insertTodo(todo_task)
    }



}
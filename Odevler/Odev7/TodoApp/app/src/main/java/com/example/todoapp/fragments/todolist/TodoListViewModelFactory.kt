package com.example.todoapp.fragments.todolist

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.todoapp.repository.TodoAppRepository

class TodoListViewModelFactory(var application: Application): ViewModelProvider.NewInstanceFactory(){
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return TodoListViewModel(application) as T
    }
}

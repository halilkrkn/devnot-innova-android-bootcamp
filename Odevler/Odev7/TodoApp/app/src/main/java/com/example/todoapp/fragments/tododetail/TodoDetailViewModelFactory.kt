package com.example.todoapp.fragments.tododetail

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.todoapp.fragments.todoadd.TodoAddViewModel

class TodoDetailViewModelFactory (var application: Application):
    ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return TodoDetailViewModel(application) as T
    }
}
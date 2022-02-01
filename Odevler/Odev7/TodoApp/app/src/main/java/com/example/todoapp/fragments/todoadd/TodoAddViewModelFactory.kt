package com.example.todoapp.fragments.todoadd

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class TodoAddViewModelFactory(var application: Application):
    ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return TodoAddViewModel(application) as T
    }
}
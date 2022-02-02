package com.example.todoapp.repository

import android.app.Application
import android.content.Context
import androidx.lifecycle.MutableLiveData
import com.example.todoapp.data.db.TodoAppDatabase
import com.example.todoapp.data.model.Todo
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class TodoAppRepository(var application: Application) {

    var todoDb: TodoAppDatabase

    init {
        todoDb = TodoAppDatabase.databaseAccess(application)!!
    }

    suspend fun getAllTodo() = todoDb.todoAppDao().getAllTodo()

    suspend fun insertTodo(todo_task:String){
        val todoAdd = Todo(0,todo_task)
        todoDb.todoAppDao().insertTodo(todoAdd)
    }

    suspend fun backwardTodo(todo: Todo) = todoDb.todoAppDao().insertTodo(todo)

    suspend fun updateTodo(todo: Todo) = todoDb.todoAppDao().updateTodo(todo)
    suspend fun deleteTodo(todo: Todo) = todoDb.todoAppDao().deleteTodo(todo)
    suspend fun getSearchTodo(searchWord: String) = todoDb.todoAppDao().getSearchTodo(searchWord)



}

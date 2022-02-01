package com.example.todoapp.data.db

import androidx.room.*
import com.example.todoapp.data.model.Todo

@Dao
interface TodoAppDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTodo(todo: Todo)

    @Delete
    suspend fun deleteTodo(todo: Todo)
    
    @Update
    suspend fun updateTodo(todo: Todo)

    @Query("Select * from todoList")
    suspend fun getAllTodo(): List<Todo>

    @Query("SELECT * FROM todoList WHERE todo_task like '%'||:searchWord||'%'")
    suspend fun getSearchTodo(searchWord:String):List<Todo>

}
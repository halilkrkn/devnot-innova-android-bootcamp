package com.example.todoapp.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull
import java.io.Serializable

@Entity(tableName = "todoList")
data class Todo(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "todo_id")
    @NotNull
    val todo_id: Int,
    @ColumnInfo(name = "todo_task")
    @NotNull
    val todo_task: String
):Serializable
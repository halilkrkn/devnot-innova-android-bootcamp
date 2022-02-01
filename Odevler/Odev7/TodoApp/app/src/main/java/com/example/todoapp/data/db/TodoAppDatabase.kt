package com.example.todoapp.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.todoapp.data.model.Todo

@Database(
    entities = [Todo::class],
    version = 1
)
abstract class TodoAppDatabase: RoomDatabase() {
    abstract fun todoAppDao(): TodoAppDao

    companion object {
        var INSTANCE: TodoAppDatabase? = null

        fun databaseAccess(context: Context): TodoAppDatabase? {
            if (INSTANCE == null) {
                synchronized(TodoAppDatabase::class) {
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        TodoAppDatabase::class.java,
                        "todoList.sqlite"
                    )
                        .createFromAsset("todoList.sqlite")
                        .build()
                }
            }
            return INSTANCE
        }
    }
}
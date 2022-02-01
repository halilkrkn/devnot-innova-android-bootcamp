package com.example.todoapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.todoapp.data.model.Todo
import com.example.todoapp.databinding.ItemTodoListBinding
import com.example.todoapp.fragments.todolist.TodoListFragmentDirections
import com.example.todoapp.fragments.todolist.TodoListViewModel
import com.google.android.material.snackbar.Snackbar

class TodoAppAdapter(
    val mContext: Context,
    val todoList: List<Todo>,
    val viewModel: TodoListViewModel
) : RecyclerView.Adapter<TodoAppAdapter.TodoAppViewHolder>() {

    inner class TodoAppViewHolder(val binding: ItemTodoListBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(todo: Todo) {
            binding.apply {
                todoList = todo
                itemCard.setOnClickListener {
                    val action = TodoListFragmentDirections.todoDetailActions(todo)
                    Navigation.findNavController(it).navigate(action)
                }

                imageViewTodoDelete.setOnClickListener {
                    Snackbar.make(it, "${todo.todo_task} silinsin mi?", Snackbar.LENGTH_LONG)
                        .setAction("EVET") {
                            Snackbar.make(it, "${todo.todo_task} Silindi?", Snackbar.LENGTH_LONG)
                                .show()
                                viewModel.deleteTodo(todo)
                        }
                        .show()
                }


            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoAppViewHolder {
        val layoutInflater = LayoutInflater.from(mContext)
        val binding = ItemTodoListBinding.inflate(layoutInflater, parent, false)
        return TodoAppViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TodoAppViewHolder, position: Int) {
        val todoPosition = todoList[position]
        holder.bind(todoPosition)
    }

    override fun getItemCount(): Int {
        return todoList.size
    }
}
package com.example.todoapp.fragments.todoadd

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import com.example.todoapp.R
import com.example.todoapp.data.model.Todo
import com.example.todoapp.databinding.FragmentTodoAddBinding
import com.example.todoapp.fragments.todolist.TodoListViewModel
import com.example.todoapp.fragments.todolist.TodoListViewModelFactory

class TodoAddFragment : Fragment() {
    private lateinit var binding: FragmentTodoAddBinding
    private lateinit var viewModel: TodoAddViewModel
    private lateinit var viewModels: TodoListViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_todo_add, container,false)
        binding.todoAddFragment = this

        binding.todoToolbarTitle = "Todo Add"

        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel: TodoAddViewModel by viewModels {
            TodoAddViewModelFactory(requireActivity().application)
        }
        viewModel = tempViewModel
        val tempViewModels: TodoListViewModel by viewModels {
            TodoListViewModelFactory(requireActivity().application)
        }
        viewModels = tempViewModels
    }

    fun todoAdd(todo_task:String,view: View){
        viewModel.insertTodo(todo_task)
        Navigation.findNavController(view).navigate(R.id.action_todoAddFragment_to_todoListFragment)
    }
}
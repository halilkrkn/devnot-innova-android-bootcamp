package com.example.todoapp.fragments.tododetail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.example.todoapp.R
import com.example.todoapp.data.model.Todo
import com.example.todoapp.databinding.FragmentTodoDetailBinding

class TodoDetailFragment : Fragment() {
    private lateinit var binding: FragmentTodoDetailBinding
    private lateinit var viewModel: TodoDetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_todo_detail,container,false)
        binding.todoDetailFragment = this
        binding.todoDetailToolbarTitle = "Todo Detail"

        val todoList: TodoDetailFragmentArgs by navArgs()
        val todo = todoList.todoList
        binding.todoUpdate = todo

        return binding.root

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel: TodoDetailViewModel by viewModels{
            TodoDetailViewModelFactory(requireActivity().application)
        }
        viewModel = tempViewModel
    }
    
    fun todoUpdate(todo: Todo){
        viewModel.todoUpdate(todo)
    }
}
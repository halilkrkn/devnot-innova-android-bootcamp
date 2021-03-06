package com.example.todoapp.fragments.todolist

import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import com.example.todoapp.R
import com.example.todoapp.adapter.TodoAppAdapter
import com.example.todoapp.databinding.FragmentTodoListBinding
import com.example.todoapp.repository.TodoAppRepository

class TodoListFragment(): Fragment() {

    private lateinit var binding: FragmentTodoListBinding
    private lateinit var viewModel: TodoListViewModel
    private lateinit var todoAppAdapter: TodoAppAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_todo_list, container, false)
        binding.todoListFragment = this


        binding.apply {

            todoListToolbarTitle = "Todo List"
            //toolbarımız üzerinde menüyü desteklemesi için tollbara yetkinlik kazandırdık.
            (activity as AppCompatActivity).setSupportActionBar(toolbarTodoList)


            viewModel.todoList.observe(viewLifecycleOwner){
                todoAppAdapter = TodoAppAdapter(requireContext(),it,viewModel)
                recyclerViewTodoList.apply {
                    adapterTodo = todoAppAdapter
                    setHasFixedSize(true)
                }
            }
        }
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel: TodoListViewModel by viewModels(){
            TodoListViewModelFactory(requireActivity().application)
        }
        viewModel = tempViewModel
        setHasOptionsMenu(true)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)

        inflater.inflate(R.menu.search_menu,menu)

        val searchItem = menu.findItem(R.id.search_menu)
        val searchView = searchItem.actionView as SearchView

        searchView.queryHint = "Arama Yap"
        searchView.setOnQueryTextListener(object: SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String): Boolean {
                viewModel.searchTodo(query)
                searchView.clearFocus()
                return true
            }

            override fun onQueryTextChange(newText: String): Boolean {
                viewModel.searchTodo(newText)
                return true
            }

        })


    }

    fun todoListFab(view: View){
        Navigation.findNavController(view).navigate(R.id.todoAddAction)
    }

    override fun onResume() {
        super.onResume()
        viewModel.getAllTodo()
    }

}
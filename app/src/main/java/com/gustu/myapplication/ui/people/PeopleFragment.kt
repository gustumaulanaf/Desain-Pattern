package com.gustu.myapplication.ui.people

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.gustu.myapplication.R
import com.gustu.myapplication.databinding.FragmentPeopleBinding
import com.gustu.myapplication.ui.home.MainActivity

class PeopleFragment : Fragment() {
    val parent: MainActivity by lazy {
        activity as MainActivity
    }
    lateinit var binding: FragmentPeopleBinding
    private val viewModel: PeopleViewModel by lazy {
        PeopleViewModel()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPeopleBinding.inflate(inflater, container, false).apply {
            viewModel = this@PeopleFragment.viewModel
            lifecycleOwner = this@PeopleFragment
        }
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initView()
        observe()
    }

    private fun observe() {
        viewModel.loading.observe(viewLifecycleOwner) {
            binding.swipePeople.isRefreshing = it
        }
        viewModel.actionState.observe(viewLifecycleOwner) {
            if (it.isConsume) {
                Log.i("ActionState", "isConsume")
            } else if (it.isSuccess) {
            }
        }
    }

    private fun initView() {
        binding.rvPeople.adapter = PeopleAdapter(parent)
        viewModel.listPeople()
        binding.swipePeople.setOnRefreshListener {
            viewModel.listPeople()
        }
    }


}
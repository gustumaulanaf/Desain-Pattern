package com.gustu.myapplication.ui.people

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gustu.myapplication.data.model.ActionState
import com.gustu.myapplication.data.model.ResultsItem
import com.gustu.myapplication.data.repository.PeopleRepository
import kotlinx.coroutines.launch

class PeopleViewModel : ViewModel() {
    val repo: PeopleRepository by lazy {
        PeopleRepository()
    }
    val loading = MutableLiveData(false)
    val actionState = MutableLiveData<ActionState<*>>()
    val listResp = MutableLiveData<List<ResultsItem>>()

    fun listPeople() {
        viewModelScope.launch {
            loading.value = true
            val resp = repo.listPeople()
            actionState.value = resp
            listResp.value = resp.data
            loading.value = false
        }
    }
}
package com.gustu.myapplication.data.repository

import com.gustu.myapplication.data.model.ActionState
import com.gustu.myapplication.data.model.PeopleResponse
import com.gustu.myapplication.data.model.ResultsItem
import com.gustu.myapplication.data.remote.API
import com.gustu.myapplication.data.remote.RetrofitApi
import retrofit2.await
import java.lang.Exception

class PeopleRepository {
    private val api: API by lazy {
        RetrofitApi.newsService()
    }

    suspend fun listPeople(): ActionState<List<ResultsItem>> {
        return try {
            val list = api.getPeople().await()
            ActionState(list.results)
        } catch (e: Exception) {
            ActionState(message = e.message, isSuccess = false)
        }
    }
}
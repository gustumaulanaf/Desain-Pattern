package com.gustu.myapplication.data.remote

import com.gustu.myapplication.data.model.PeopleResponse
import retrofit2.Call
import retrofit2.http.GET

interface API {
    @GET("people")
    fun getPeople():Call<PeopleResponse>
}
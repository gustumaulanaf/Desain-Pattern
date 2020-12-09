package com.gustu.myapplication.ui.auth

import android.content.Context
import com.gustu.myapplication.data.model.ActionState
import com.gustu.myapplication.data.repository.AuthRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

object AppAuth {
    fun logout(context:Context,callback:((ActionState<Boolean>)->Unit)?=null){
        val repo = AuthRepository(context)
        CoroutineScope(Dispatchers.IO).launch {
            val response  = repo.logout()
            withContext(Dispatchers.Main){
                callback?.invoke(response)
            }
        }
    }
}
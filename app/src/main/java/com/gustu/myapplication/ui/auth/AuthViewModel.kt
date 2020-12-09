package com.gustu.myapplication.ui.auth

import android.text.BoringLayout
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gustu.myapplication.data.model.ActionState
import com.gustu.myapplication.data.model.AuthUser
import com.gustu.myapplication.data.repository.AuthRepository
import kotlinx.coroutines.launch

class AuthViewModel(val repo: AuthRepository) : ViewModel() {
    val autUser = repo.authUser
    val isLogin = repo.isLogin
    val authLogin = MutableLiveData<ActionState<AuthUser>>()
    val authRegister = MutableLiveData<ActionState<AuthUser>>()
    val authLogout = MutableLiveData<ActionState<Boolean>>()

    val email = MutableLiveData<String>()
    val password = MutableLiveData<String>()
    val fullName = MutableLiveData<String>()

    fun login() {
        viewModelScope.launch {
            val response = repo.login(email.value ?: "", password.value ?: "")
            authLogin.value = response
        }
    }

    fun register() {
        viewModelScope.launch {
            val response = repo.register(
                AuthUser(
                    email = email.value ?: "",
                    pass = password.value ?: "",
                    fullName = fullName.value ?: ""
                )
            )
            authRegister.value = response
        }
    }

    fun logout() {
        viewModelScope.launch {
            val response = repo.logout()
            authLogout.value = response
        }
    }
}
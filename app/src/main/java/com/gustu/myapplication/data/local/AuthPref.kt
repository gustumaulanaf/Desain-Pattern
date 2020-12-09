package com.gustu.myapplication.data.local

import android.content.Context
import android.content.SharedPreferences
import com.gustu.myapplication.data.model.ActionState
import com.gustu.myapplication.data.model.AuthUser
import com.gustu.myapplication.util.getObject
import com.gustu.myapplication.util.putObject

class AuthPref(val context: Context) {
    private val sp: SharedPreferences by lazy {
        context.getSharedPreferences(
            AuthPref::class.java.name,
            Context.MODE_PRIVATE
        )
    }

    companion object {
        const val AUTH_USER = "auth_user"
        const val IS_LOGIN = "is_login"
    }

    var authUser: AuthUser?
        get() = sp.getObject(AUTH_USER)
        private set(value) = sp.edit().putObject(AUTH_USER, value).apply()

    var isLogin: Boolean
        get() = sp.getBoolean(IS_LOGIN, false)
        private set(value) = sp.edit().putBoolean(IS_LOGIN, value).apply()

    suspend fun login(email: String, password: String): ActionState<AuthUser> {
        val user = authUser
        return if (user == null) {
            ActionState(message = "Anda belum terdatar", isSuccess = false)
        } else if (user.email.isBlank() || user.pass.isBlank()) {
            ActionState(message = "Email dan password tidak boleh kosong", isSuccess = false)
        } else if (user.email == email && user.pass == password) {
            isLogin = true
            ActionState(message = "Anda berhasil login")
        } else {
            ActionState(message = "Email atau password salah", isSuccess = false)
        }
    }

    suspend fun register(user: AuthUser): ActionState<AuthUser> {
        return if (user.email.isBlank() || user.pass.isBlank()) {
            ActionState(message = "Email atau password tidak boleh kosong", isSuccess = false)
        } else {
            authUser = user
            ActionState(user, message = "Anda berhasil mendaftar")
        }
    }

    suspend fun logout(): ActionState<Boolean> {
        isLogin = false
        return ActionState(true, message = "Anda berhasil Logout")
    }
}

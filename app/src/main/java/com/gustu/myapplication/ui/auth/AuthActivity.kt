package com.gustu.myapplication.ui.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.gustu.myapplication.R
import com.gustu.myapplication.data.model.AuthUser
import com.gustu.myapplication.databinding.ActivityAuthBinding
import com.gustu.myapplication.ui.home.MainActivity

class AuthActivity : AppCompatActivity() {
    lateinit var binding: ActivityAuthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_auth)
    }

    fun onSuccess(user: AuthUser?) {
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}
package com.gustu.myapplication.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.gustu.myapplication.R
import com.gustu.myapplication.databinding.ActivityMainBinding
import com.gustu.myapplication.ui.auth.AppAuth
import com.gustu.myapplication.ui.auth.AuthActivity

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
//        binding.btLogout.setOnClickListener {
//            AppAuth.logout(this) {
//                startActivity(Intent(this, AuthActivity::class.java))
//                finish()
//            }
//        }
        binding.btNav.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.action_home -> navigate(R.id.homeFragment)
                R.id.action_people -> navigate(R.id.peopleFragment)
                R.id.action_profile -> navigate(R.id.profileFragment)
                else -> false
            }
        }
    }

    private fun navigate(fragment: Int): Boolean {
        findNavController(R.id.navHostMain).navigate(fragment)
        return true
    }
}
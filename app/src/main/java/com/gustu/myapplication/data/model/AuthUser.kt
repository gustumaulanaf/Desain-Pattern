package com.gustu.myapplication.data.model

data class AuthUser(
    var id: Int = 0,
    var email: String = "",
    var pass: String = "",
    var fullName: String = ""
)
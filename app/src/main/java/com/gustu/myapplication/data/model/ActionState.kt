package com.gustu.myapplication.data.model

data class ActionState<T>(
    var data: T? = null,
    var message: String? = null,
    var isSuccess: Boolean = true,
    var isConsume: Boolean = false
)

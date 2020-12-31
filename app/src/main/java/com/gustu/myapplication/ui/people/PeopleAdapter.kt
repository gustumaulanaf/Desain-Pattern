package com.gustu.myapplication.ui.people

import android.content.Context
import android.content.Intent
import androidx.databinding.ViewDataBinding
import com.bumptech.glide.Glide
import com.gustu.myapplication.R
import com.gustu.myapplication.data.model.ResultsItem
import com.gustu.myapplication.databinding.ItemPeopleBinding
import com.gustu.myapplication.ui.base.BaseAdapter

class PeopleAdapter(val c: Context) : BaseAdapter<ResultsItem>(R.layout.item_people) {
    override fun onBind(binding: ViewDataBinding?, data: ResultsItem) {
        val mBinding = binding as ItemPeopleBinding
        Glide.with(c).load(data.picture?.medium).into(mBinding.imgPeople)
    }

    override fun onClick(binding: ViewDataBinding?, data: ResultsItem) {
        val intent = Intent(c, PeopleActivity::class.java)
        intent.putExtra("result", data)
        c.startActivity(intent)
    }
}
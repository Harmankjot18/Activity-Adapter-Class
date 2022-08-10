package com.ss.activity2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class AdapterClass(var arrayList: ArrayList<DataClass1>,var clickInterface: ClickInterface): BaseAdapter() {
    override fun getCount(): Int {
        return arrayList.size
    }

    override fun getItem(p0: Int): Any {
        return 10
    }

    override fun getItemId(p0: Int): Long {
        return 10
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View{
        var initView=LayoutInflater.from(p2?.context).inflate(R.layout.adapter_layout,p2,false)
      var tvId = initView.findViewById<TextView>(R.id.tvId)
        var tvName = initView.findViewById<TextView>(R.id.tvName)
        tvId.setText(arrayList[p0].id.toString())
        tvName.setText(arrayList[p0].name)
        tvName.setOnClickListener {
            clickInterface.onNameClicked(arrayList[p0].name?:"")
        }
     return initView
    }
}
package com.ss.activity2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListAdapter
import com.ss.activity2.databinding.ActivityMainBinding
import com.ss.activity2.databinding.ActivityWebViewBinding
import com.ss.activity2.databinding.AdapterLayoutBinding

class MainActivity : AppCompatActivity(), ClickInterface {
    lateinit var listAdapter : AdapterClass
    lateinit var listBinding: ActivityMainBinding
    var arrayList:ArrayList<DataClass1> =ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        listBinding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(listBinding.root)
        listAdapter =  AdapterClass(arrayList,this)
        listBinding.list.adapter =listAdapter
        arrayList.add(DataClass1(1,"hello"))
        arrayList.add(DataClass1(1,"heyy"))
        arrayList.add(DataClass1(1,"harman"))

    }
    override fun onNameClicked(name: String) {
        System.out.println("name $name")
    }
}
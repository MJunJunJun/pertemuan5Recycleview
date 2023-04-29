package com.junaedi.pertemuan5recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.junaedi.pertemuan5recycleview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var adapter: ListViewAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val listStudent= arrayListOf(
            MyContact("12345","Adam Pratama","081234567890"),
            MyContact("12346","Junaedi tamvan","081234567891"),
            MyContact("12347","Ello wod","081234567892"),
            MyContact("12348","Wudi Wupekel","081234567893"),
            MyContact("12349","Dola Emong","081234567894"),
            MyContact("12350","Nubing nubi","081234567895"),
            MyContact("12351","Ramadhan","081234567896"),
            MyContact("12352","Fitri","081234567897"),
            MyContact("12353","Minal","081234567898"),
            MyContact("12354","Aidzin","081234567899"),
            MyContact("12355","Wal Faidzin","081234567999")
        )

        adapter= ListViewAdapter(listStudent)
        val  layoutManager=LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        binding.rvContact.layoutManager=layoutManager
        binding.rvContact.adapter=adapter


    }
}
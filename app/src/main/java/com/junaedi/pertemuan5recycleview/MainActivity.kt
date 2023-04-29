package com.junaedi.pertemuan5recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.junaedi.pertemuan5recycleview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val listStudent= arrayListOf(
            MyContact("12345","Adam Pratama","081234567890","https://kompaspedia.kompas.id/wp-content/uploads/2021/10/Logo-PDI-Perjuangan-Vector.png"),
            MyContact("12346","Junaedi tamvan","081234567891","https://kompaspedia.kompas.id/wp-content/uploads/2021/10/Logo-PDI-Perjuangan-Vector.png"),
            MyContact("12347","Ello wod","081234567892","https://kompaspedia.kompas.id/wp-content/uploads/2021/10/Logo-PDI-Perjuangan-Vector.png"),
            MyContact("12348","Wudi Wupekel","081234567893","https://kompaspedia.kompas.id/wp-content/uploads/2021/10/Logo-PDI-Perjuangan-Vector.png"),
            MyContact("12349","Dola Emong","081234567894","https://kompaspedia.kompas.id/wp-content/uploads/2021/10/Logo-PDI-Perjuangan-Vector.png"),
            MyContact("12350","Nubing nubi","081234567895","https://kompaspedia.kompas.id/wp-content/uploads/2021/10/Logo-PDI-Perjuangan-Vector.png"),
            MyContact("12351","Ramadhan","081234567896","https://kompaspedia.kompas.id/wp-content/uploads/2021/10/Logo-PDI-Perjuangan-Vector.png"),
            MyContact("12352","Fitri","081234567897","https://kompaspedia.kompas.id/wp-content/uploads/2021/10/Logo-PDI-Perjuangan-Vector.png"),
            MyContact("12353","Minal","081234567898","https://kompaspedia.kompas.id/wp-content/uploads/2021/10/Logo-PDI-Perjuangan-Vector.png"),
            MyContact("12354","Aidzin","081234567899","https://kompaspedia.kompas.id/wp-content/uploads/2021/10/Logo-PDI-Perjuangan-Vector.png"),
            MyContact("12355","Wal Faidzin","081234567999","https://kompaspedia.kompas.id/wp-content/uploads/2021/10/Logo-PDI-Perjuangan-Vector.png")
        )

        ///ubahnya disini
        gridView(listStudent)



    }
    private  fun  listView(value: ArrayList<MyContact>){
        val adapter= ListViewAdapter(this,value)
        val  layoutManager=LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        binding.rvContact.layoutManager=layoutManager
        binding.rvContact.adapter=adapter

    }
    private fun  gridView(value: ArrayList<MyContact>){
        val adapter= GridViewAdapter(this,value)
        val  layoutManager=GridLayoutManager(this,2, LinearLayoutManager.VERTICAL,false)
        binding.rvContact.layoutManager=layoutManager
        binding.rvContact.adapter=adapter
    }
    private fun  cardView(value: ArrayList<MyContact>){
        val adapter= CardViewAdapter(this,value)
        val  layoutManager=LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        binding.rvContact.layoutManager=layoutManager
        binding.rvContact.adapter=adapter
    }
}
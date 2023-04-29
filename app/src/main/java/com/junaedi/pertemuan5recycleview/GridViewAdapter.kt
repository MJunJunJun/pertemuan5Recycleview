package com.junaedi.pertemuan5recycleview

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.junaedi.pertemuan5recycleview.databinding.GridviewLayoutBinding
import com.junaedi.pertemuan5recycleview.databinding.ListviewLayoutBinding


class GridViewAdapter(private val context: Context, private val listStudent : ArrayList<MyContact>): RecyclerView.Adapter<GridViewAdapter.ViewHolder>() {
    class ViewHolder(val binding : GridviewLayoutBinding) : RecyclerView.ViewHolder(binding.root)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=GridviewLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(view)
    }
    override fun getItemCount(): Int {
        return listStudent.size
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.txtNama.text=listStudent[position].nama
        Glide.with(holder.itemView.context).load(listStudent[position].foto).into(holder.binding.images)
        holder.binding.cardView.setOnClickListener {
            val intent= Intent(context,DetailActivity::class.java)
            intent.putExtra("nim",listStudent[position].nim)
            intent.putExtra("nama",listStudent[position].nama)
            intent.putExtra("telepon",listStudent[position].nomorTelepon)
            intent.putExtra("foto",listStudent[position].foto)
            context.startActivity(intent)
        }

    }
}
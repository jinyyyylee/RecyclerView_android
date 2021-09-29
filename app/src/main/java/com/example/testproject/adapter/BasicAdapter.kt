package com.example.testproject.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.testproject.BasicData
import com.example.testproject.R

class BasicAdapter(private val context : Context) :
    RecyclerView.Adapter<BasicAdapter.ViewHolder>() {

    lateinit var basicdata : MutableList<BasicData>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BasicAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_recycler,parent,false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: BasicAdapter.ViewHolder, position: Int) {
        val profileImg : ImageView = holder.itemView.findViewById(R.id.followlist_prof_img)
        val profilename : TextView = holder.itemView.findViewById(R.id.followlist_prof_name)

        Glide.with(holder.itemView)
            .load(basicdata[position].image)
            .apply(RequestOptions().centerCrop())
            .into(profileImg)
        profilename.text = basicdata[position].name
    }

    override fun getItemCount(): Int {
        return basicdata.size
    }

    inner class ViewHolder(view : View) :  RecyclerView.ViewHolder(view){

    }
}
package com.example.testproject.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.testproject.GridData
import com.example.testproject.R

class GridAdapter(private val context : Context) : RecyclerView.Adapter<GridAdapter.ViewHolder>() {

    lateinit var gridData : MutableList<GridData>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridAdapter.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_grid_recycler,parent,false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: GridAdapter.ViewHolder, position: Int) {
        val grid_img : ImageView = holder.itemView.findViewById(R.id.grid_img)

        Glide.with(holder.itemView)
            .load(gridData[position].grid_img)
            .apply(RequestOptions().centerCrop())
            .into(grid_img)
    }

    override fun getItemCount(): Int {
        return gridData.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    }
}
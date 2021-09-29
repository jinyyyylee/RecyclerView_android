package com.example.testproject.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.testproject.CalenderData
import com.example.testproject.R

class CalenderAdapter(private val context : Context) : RecyclerView.Adapter<CalenderAdapter.ViewHolder>()  {

    lateinit var calenderdata : MutableList<CalenderData>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CalenderAdapter.ViewHolder {

    }

    override fun onBindViewHolder(holder: CalenderAdapter.ViewHolder, position: Int) {
        var backimg = holder.itemView.findViewById<ImageView>(R.id.calender_backimg)
        var day = holder.itemView.findViewById<TextView>(R.id.calender_day)

        Glide.with(holder.itemView)
            .load(calenderdata[position].back_img)
            .apply(RequestOptions().centerCrop())
            .into(backimg)

        day.text = calenderdata[position].day
    }

    override fun getItemCount(): Int {

        return calenderdata.size
    }
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    }
}
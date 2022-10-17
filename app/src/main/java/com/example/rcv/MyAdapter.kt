package com.example.rcv

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter(private val newsList: ArrayList<News>,private val context: Context):
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {


    @SuppressLint("SuspiciousIndentation")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
      val itemView=LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem=newsList[position]
        holder.titleImage.setImageResource(currentItem.titleImage)
        holder.tvHeading.text=currentItem.heading
        holder.cost.text=currentItem.Cost
        holder.tvHeading.setOnClickListener{
            val intent= Intent(context,Detail::class.java)
            intent.putExtra("name",currentItem.description)
            intent.putExtra("image",currentItem.titleImage)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
       return newsList.size
    }

    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val titleImage : ShapeableImageView =itemView.findViewById(R.id.title_image)
        val tvHeading : TextView=itemView.findViewById(R.id.tvHeading)
        val cost:TextView=itemView.findViewById(R.id.Cost)


    }
}
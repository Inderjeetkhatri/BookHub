package com.example.bookhub.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.bookhub.R
import com.example.bookhub.model.Book

import kotlinx.android.synthetic.main.recycler_dashboard_single_row.view.*

class DashboardRecyclerAdapter(val context:Context, val itemList:ArrayList<Book>) : RecyclerView.Adapter<DashboardRecyclerAdapter.DashboardViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DashboardViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.recycler_dashboard_single_row,
            parent,false)
        return DashboardViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: DashboardViewHolder, position: Int) {
        val book=itemList[position]
        holder.txtBookName.text=book.bookName
        holder.txtBookAuthor.text=book.bookAuthor
        holder.txtBookCost.text=book.bookCost
        holder.txtBookRating.text=book.bookRating

        holder.llContent.setOnClickListener {
            Toast.makeText(context,"clicked on ${holder.txtBookName.text}",Toast.LENGTH_SHORT).show()
        }
    }

    class DashboardViewHolder(view:View) : RecyclerView.ViewHolder(view){

        val txtBookName :TextView=view.findViewById(R.id.txtBookName)
        val txtBookAuthor :TextView=view.findViewById(R.id.txtBookAuthor)
        val txtBookCost :TextView=view.findViewById(R.id.txtBookCost)
        val txtBookRating :TextView=view.findViewById(R.id.txtBookRating)
        val llContent: LinearLayout = view.findViewById(R.id.llContent)
    }

}


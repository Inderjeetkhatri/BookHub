package com.example.bookhub.fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bookhub.R
import com.example.bookhub.adapter.DashboardRecyclerAdapter
import com.example.bookhub.model.Book

class DashboardFragment : Fragment() {

    lateinit var recyclerDashboaard : RecyclerView
    lateinit var layoutManager : RecyclerView.LayoutManager

    val bookList = arrayListOf<String>(
        "Chemistry","Accounts","Physics","Mathematics","Biology","Economics","Computer Network"
        ,"Compiler Design","Soft Computing","Data Mining","Discrete Mathematics","Machine Learning",
        "Artificial Intelligence","Deep Learning","Data Science"
    )
    lateinit var recyclerAdapter: DashboardRecyclerAdapter

    val bookInfoList = arrayListOf<Book>(
        Book("A","1","1","4.1"),
        Book("B","2","2","4.2"),
        Book("C","3","3","4.3"),
        Book("D","4","4","4.4"),
        Book("E","5","5","4.5"),
        Book("F","6","6","4.6"),
        Book("G","7","7","4.7"),
        Book("H","8","8","4.8"),
        Book("I","9","9","4.9"),
        Book("J","10","10","5.0")
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view=inflater.inflate(R.layout.fragment_dashboard, container, false)

        recyclerDashboaard=view.findViewById(R.id.recyclerDashboard)
        layoutManager = LinearLayoutManager(activity)
        recyclerAdapter= DashboardRecyclerAdapter(activity as Context,bookInfoList)
        recyclerDashboaard.adapter=recyclerAdapter
        recyclerDashboaard.layoutManager=layoutManager

        recyclerDashboaard.addItemDecoration(
            DividerItemDecoration(
            recyclerDashboaard.context,
                (layoutManager as LinearLayoutManager).orientation
        )
        )

        return view
    }

}

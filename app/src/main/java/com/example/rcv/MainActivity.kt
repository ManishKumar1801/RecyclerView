package com.example.rcv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.rcv.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var newRecyclerView: RecyclerView
    private  lateinit var newArrayList: ArrayList<News>
    lateinit var imageId:Array<Int>
    lateinit var heading :Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)
        with(binding){

            imageId= arrayOf(
                R.drawable.images,
                R.drawable.img,
                R.drawable.img_1,
                R.drawable.img_2,
                R.drawable.img_3,
                R.drawable.img_4,
                R.drawable.img_5,
                R.drawable.img_6,
                R.drawable.img_7,
                R.drawable.img_8,
                R.drawable.img_9,
                R.drawable.img_10


            )
            heading= arrayOf(
                "Boat is very useful in the time of flood",
                "Boat is very useful in the time of flood",
                "Boat is very useful in the time of flood",
                "Boat is very useful in the time of flood",
                "Boat is very useful in the time of flood",
                "Boat is very useful in the time of flood",
                "Boat is very useful in the time of flood",
                "Boat is very useful in the time of flood",
                "Boat is very useful in the time of flood",
                "Boat is very useful in the time of flood",
                "Boat is very useful in the time of flood",
                "Boat is very useful in the time of flood",

            )

            newRecyclerView=findViewById(R.id.recyclerView)
            newRecyclerView.layoutManager=LinearLayoutManager(this@MainActivity)
            newRecyclerView.setHasFixedSize(true)

            newArrayList= arrayListOf<News>()
            getUserdata()

        }
    }

    private fun getUserdata() {
        for(i in imageId.indices){
            val news=News(imageId[i],heading[i])
            newArrayList.add(news)

        }

        newRecyclerView.adapter=MyAdapter(newArrayList)

    }
}
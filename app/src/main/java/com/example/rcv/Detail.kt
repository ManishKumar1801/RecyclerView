package com.example.rcv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.rcv.databinding.ActivityDetailBinding

class Detail : AppCompatActivity() {
    private  lateinit var binding:ActivityDetailBinding
    private var imagevalue=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        with(binding){
            val bundle=intent.extras
            if(bundle!=null){
                imagevalue=bundle.getInt("image")
            }
            image.setImageResource(imagevalue)
            val name=intent.getStringExtra("name")
            Description.text=name
        }
    }
}
package com.example.mindset

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_page3.*

class Page3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page3)
        intro.setOnClickListener(){
            val intent = Intent(this,Page4::class.java)
            startActivity(intent)
        }
    }
}
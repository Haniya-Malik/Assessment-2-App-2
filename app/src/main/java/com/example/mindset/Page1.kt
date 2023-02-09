package com.example.mindset

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_page1.*

class Page1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page1)
        welcome.setOnClickListener(){
            val intent = Intent(this,Page2::class.java)
            startActivity(intent)
        }
    }
}
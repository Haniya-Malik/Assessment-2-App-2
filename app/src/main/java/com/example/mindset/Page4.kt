package com.example.mindset

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_page4.*

class Page4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page4)
        // create arrays of quotes and authors
        val quotes = resources.getStringArray(R.array.quotes)
        val authors = resources.getStringArray(R.array.authors)
        // set onClickListener for the button
        refresh.setOnClickListener {
            // generate a random number
            val random = (quotes.indices).random()

            // set the text of the textview
            quote.text = quotes[random]
            author.text = authors[random]
        }
        info.setOnClickListener(){
            val myDialoug = Dialog(this)
            myDialoug.setContentView(R.layout.popup)
            myDialoug.setCancelable(true)
            myDialoug.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            myDialoug.show()
        }
    }
}

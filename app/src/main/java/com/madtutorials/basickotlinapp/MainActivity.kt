package com.madtutorials.basickotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val message = "Hello World From Kotlin"
        val duration = Toast.LENGTH_LONG
        val toast = Toast.makeText(applicationContext,message,duration)

        toast.show()

        //short_hand
        Toast.makeText(applicationContext,"Hello Form Kotlin",Toast.LENGTH_LONG).show()
    }
}

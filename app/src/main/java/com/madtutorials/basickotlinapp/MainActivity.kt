package com.madtutorials.basickotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val message = "Welcome From Kotlin"
        val duration = Toast.LENGTH_LONG
        val toast = Toast.makeText(applicationContext,message,duration)

    /* Remove this comment to see both the toasts
        toast.show()
    */
        //short_hand
        Toast.makeText(applicationContext,"Welcome Form Kotlin",Toast.LENGTH_LONG).show()

        val editext = findViewById<EditText>(R.id.editText) //get edittext using id
        val button = findViewById<Button>(R.id.toastButton) //get button using id

        button.setOnClickListener { //setting listener function to button , using lambda expression , called when button clicked
            val message2 = editext.text.toString() //get input from edittext and convert to text

            Toast.makeText(applicationContext, message2, Toast.LENGTH_SHORT).show() //display toast with input
        }

    }
}

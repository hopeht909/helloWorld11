package com.example.kotlinone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val message = " Hello world"
       if(message.length >= 10){
           println("the message length is more than 10 char and its it ${message.length}" )
       }
        else {
           println("the message length is less than 10 char and its it ${message.length}" )
       }
       Log.d("ameera_abduallah" , message)


    }
}
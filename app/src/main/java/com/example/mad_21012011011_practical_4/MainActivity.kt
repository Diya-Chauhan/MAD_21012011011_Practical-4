package com.example.mad_21012011011_practical_4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val login:Button=findViewById(R.id.Login)
        val signup:Button=findViewById(R.id.Signup)
        login.setOnClickListener{
        }
    }
}
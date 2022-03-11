package com.example.assignment3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
const val TAG2 = "MainActivity2"

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Toast.makeText(this, "SA onCreate", Toast.LENGTH_SHORT).show();
        val name = intent.getStringExtra("name")
        val Mail = intent.getStringExtra("Mail")
        val gender = intent.getStringExtra("gender")


        val displaytext:TextView = findViewById(R.id.display)

        displaytext.text= "Hello ${name}, your email id is ${Mail} , and your gender is ${gender} "

        Toast.makeText(this, "\"Hello ${name}, your email id is ${Mail} , and your gender is ${gender} ", Toast.LENGTH_SHORT).show()
        
    }
    override fun onResume() {
        super.onResume()
        Log.d(TAG2, "onResume Called")
        Toast.makeText(this, "SA onResume", Toast.LENGTH_SHORT).show();
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG2, "onPause Called")
        Toast.makeText(this, "SA onPause", Toast.LENGTH_SHORT).show();
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG2, "onStop Called")
        Toast.makeText(this, "SA onStop", Toast.LENGTH_SHORT).show();
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG2, "onDestroy Called")
        Toast.makeText(this, "SA onDestroy", Toast.LENGTH_SHORT).show();
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG2, "onRestart Called")
        Toast.makeText(this, "SA onRestart", Toast.LENGTH_SHORT).show();
    }
}
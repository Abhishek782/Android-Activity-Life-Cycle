package com.example.assignment3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*

const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "FA onCreate", Toast.LENGTH_SHORT).show();

        val button:Button  = findViewById(R.id.submit)
        val Name:EditText = findViewById(R.id.name)
        val Mail:EditText = findViewById(R.id.mail)
        val gender:RadioGroup = findViewById(R.id.options)




        button.setOnClickListener {
            val intent =Intent(this, MainActivity2::class.java)

            val inputname = Name.editableText.toString()
            val inputmail = Mail.editableText.toString()
            val selectedOption =  gender.checkedRadioButtonId
            val op:RadioButton = findViewById(selectedOption)
            val gendername = op.text


            intent.putExtra("name",inputname)
            intent.putExtra("Mail",inputmail)
            intent.putExtra("gender",gendername)
            startActivity(intent)
        }

    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume Called")
        Toast.makeText(this, "FA onResume", Toast.LENGTH_SHORT).show();
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause Called")
        Toast.makeText(this, "FA onPause", Toast.LENGTH_SHORT).show();

    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop Called")
        Toast.makeText(this, "FA onStop", Toast.LENGTH_SHORT).show();
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy Called")
        Toast.makeText(this, "FA onDestroy", Toast.LENGTH_SHORT).show();
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart Called")
    }

}

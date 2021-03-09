package com.example.quizzapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class EnterNameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enter_name)

        val name_enter = findViewById<Button>(R.id.name_enter)
        val name_edit = findViewById<TextView>(R.id.name_edit)

        name_enter.setOnClickListener{


            if(name_edit.text.toString().isEmpty()){
                Toast.makeText(this , "Please enter your name", Toast.LENGTH_SHORT).show()
            }else{
                val intent =  Intent(this, SelectCategoryActivity::class.java).apply {
                    putExtra(EXTRA_MESSAGE, name_edit.text.toString())
                }
                startActivity(intent)
                finish()
            }
        }
    }
}
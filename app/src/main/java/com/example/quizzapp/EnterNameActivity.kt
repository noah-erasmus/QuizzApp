package com.example.quizzapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_enter_name.*

class EnterNameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enter_name)

        //Input Listener - Name Entry
        name_enter.setOnClickListener{

            //If no name is given
            if(name_edit.text.toString().isEmpty()){
                Toast.makeText(this , "Please enter your name", Toast.LENGTH_SHORT).show()

            //Else there is a value
            }else{

                //Navigate to Category Select
                val intent =  Intent(this, SelectCategoryActivity::class.java).apply {
                    putExtra(EXTRA_MESSAGE, name_edit.text.toString())
                }
                startActivity(intent)
                finish()
            }
        }
    }
}
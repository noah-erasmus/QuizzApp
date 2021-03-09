package com.example.quizzapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.Button
import android.widget.TextView

class SelectCategoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_category)

        val hello_user = findViewById<TextView>(R.id.hello_user)

        val userName = intent.getStringExtra(EXTRA_MESSAGE)

        hello_user.text = "Hello " + userName
    }




}
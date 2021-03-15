package com.example.quizzapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.util.Log
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_select_category.*
import kotlin.math.log

class SelectCategoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_category)

        val userName = intent.getStringExtra(EXTRA_MESSAGE)

        hello_user.text = "Hello " + userName

        onewordtitles.setOnClickListener{
            val intent = Intent(this, AnswerActivity::class.java)
            intent.putExtra("question_number", 1)
            intent.putExtra("category_number", 1)
            startActivity(intent)
            finish()
        }

        oscarwinners.setOnClickListener{
            val intent = Intent(this, AnswerActivity::class.java)
            intent.putExtra("question_number", 1)
            intent.putExtra("category_number", 2)
            startActivity(intent)
            finish()
        }

        generaltrivia.setOnClickListener{
            val intent = Intent(this, AnswerActivity::class.java)
            intent.putExtra("question_number", 1)
            intent.putExtra("category_number", 3)
            startActivity(intent)
            finish()
        }
    }




}
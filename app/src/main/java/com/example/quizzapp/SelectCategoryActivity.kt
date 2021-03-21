package com.example.quizzapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_select_category.*
import kotlin.math.log

class SelectCategoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_category)

        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val editor =  sharedPref.edit()

        //Get username value from putExtra
        val userName = sharedPref.getString(Constants.USERNAME, "Noah")

        //Custom greeting text
        hello_user.text = "Hello ${userName}"

        var totalLevels = sharedPref.getInt(Constants.CATEGORY1_LEVEL, 1)
                                + sharedPref.getInt(Constants.CATEGORY2_LEVEL, 1)
                                + sharedPref.getInt(Constants.CATEGORY3_LEVEL, 1)

        totallevel_view.text = "${
        sharedPref.getInt(Constants.CATEGORY1_LEVEL, 1) + sharedPref.getInt(com.example.quizzapp.Constants.CATEGORY2_LEVEL, 1) + sharedPref.getInt(com.example.quizzapp.Constants.CATEGORY3_LEVEL, 1)
        }"

        //Navigation listener - One Word Titles
        onewordtitles.setOnClickListener{
            val intent = Intent(this, AnswerActivity::class.java)
            intent.putExtra("question_number", 1)
            intent.putExtra("category_number", 1)
            startActivity(intent)
            finish()
        }

        //Navigation listener - Oscar Winners
        oscarwinners.setOnClickListener{
            val intent = Intent(this, AnswerActivity::class.java)
            intent.putExtra("question_number", 1)
            intent.putExtra("category_number", 2)
            startActivity(intent)
            finish()
        }

        //Navigation listener - General Trivia
        generaltrivia.setOnClickListener{
            val intent = Intent(this, AnswerActivity::class.java)
            intent.putExtra("question_number", 1)
            intent.putExtra("category_number", 3)
            startActivity(intent)
            finish()
        }

        levelreset_btn.setOnClickListener{
            editor.clear()
            editor.apply()
            val intent = Intent(this, SelectCategoryActivity::class.java)
            startActivity(intent)
            finish()
        }
    }




}
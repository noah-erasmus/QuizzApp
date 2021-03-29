package com.example.quizzapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_level_finish.*

class LevelFinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level_finish)

        //Navigation listener - Category Select
        selectcategory_btn.setOnClickListener{
            val intent = Intent(this, SelectCategoryActivity::class.java)
            startActivity(intent)
            finish()
        }

        //Prepare shared preferences
        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val editor =  sharedPref.edit()

        //Import category number and determine category level
        var categoryNumber = intent.getIntExtra("category_number", 1)
        var categoryLevel = 1
        if(categoryNumber == 1){
            categoryLevel = sharedPref.getInt(Constants.CATEGORY1_LEVEL, 1)
        }else if(categoryNumber == 2){
            categoryLevel = sharedPref.getInt(Constants.CATEGORY2_LEVEL, 1)
        }else if(categoryNumber == 3){
            categoryLevel = sharedPref.getInt(Constants.CATEGORY3_LEVEL, 1)
        }

        //Increment category level
        var newLevel = categoryLevel + 1

        //Check if level passed based on imported right answers, Update UI
        val rightAnswers = intent.getIntExtra("right_answers", 0)
        if(rightAnswers >= 3){
            completion_status.text = "COMPLETE"
        }else{
            completion_status.text = "INCOMPLETE"
            newLevel--
        }

        //Check if max level reached and Update UI
        if(newLevel == 4){
            nextlevel_btn.text = "Receive prize"
        }

        //Update UI
        level_count.text = "LEVEL ${categoryLevel}"
        if(rightAnswers == 1){
            answersmeter_count.text == "1"
            answersmeter_progress.setImageResource(R.drawable.answers_meter_1)
        }else if(rightAnswers == 2){
            answersmeter_count.text == "2"
            answersmeter_progress.setImageResource(R.drawable.answers_meter_2)
        }else if(rightAnswers == 3){
            answersmeter_count.text == "3"
            answersmeter_progress.setImageResource(R.drawable.answers_meter_3)
        }else if(rightAnswers == 4){
            answersmeter_count.text == "4"
            answersmeter_progress.setImageResource(R.drawable.answers_meter_4)
        }else if(rightAnswers == 5){
            answersmeter_count.text == "5"
            answersmeter_progress.setImageResource(R.drawable.answers_meter_5)
        }
        answersmeter_count.text = rightAnswers.toString()

        //Store category level in shared preferences
        if(categoryNumber == 1){
            editor.apply{
                putInt(Constants.CATEGORY1_LEVEL, newLevel)
                apply()
            }
        }else if(categoryNumber == 2){
            editor.apply{
                putInt(Constants.CATEGORY2_LEVEL, newLevel)
                apply()
            }
        }else if(categoryNumber == 3){
            editor.apply{
                putInt(Constants.CATEGORY3_LEVEL, newLevel)
                apply()
            }
        }

        //Navigation listener - Next Level/Prize, check if max level, pass question number & category number
        nextlevel_btn.setOnClickListener{
            if(newLevel == 4){
                val intent = Intent(this, PrizeActivity::class.java)
                intent.putExtra("category_number", categoryNumber)
                startActivity(intent)
                finish()
            }else if(newLevel < 4){
                val intent = Intent(this, AnswerActivity::class.java)
                intent.putExtra("question_number", 1)
                intent.putExtra("category_number", categoryNumber)
                startActivity(intent)
                finish()
            }

        }

    }
}
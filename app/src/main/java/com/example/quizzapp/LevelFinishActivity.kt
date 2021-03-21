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

        selectcategory_btn.setOnClickListener{
            val intent = Intent(this, SelectCategoryActivity::class.java)
            startActivity(intent)
            finish()
        }

        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val editor =  sharedPref.edit()

        val rightAnswers = intent.getIntExtra("right_answers", 0)

        var categoryNumber = intent.getIntExtra("category_number", 1)
        var categoryLevel = 1
        if(categoryNumber == 1){
            categoryLevel = sharedPref.getInt(Constants.CATEGORY1_LEVEL, 1)
        }else if(categoryNumber == 2){
            categoryLevel = sharedPref.getInt(Constants.CATEGORY2_LEVEL, 1)
        }else if(categoryNumber == 3){
            categoryLevel = sharedPref.getInt(Constants.CATEGORY3_LEVEL, 1)
        }

        var newLevel = categoryLevel + 1

        if(rightAnswers >= 3){
            completion_status.text = "COMPLETE"
        }else{
            completion_status.text = "INCOMPLETE"
            newLevel--
        }

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

        nextlevel_btn.setOnClickListener{
            val intent = Intent(this, AnswerActivity::class.java)
            intent.putExtra("question_number", 1)
            intent.putExtra("category_number", categoryNumber)
            startActivity(intent)
            finish()
        }

        level_count.text = "LEVEL ${categoryLevel}"


    }
}
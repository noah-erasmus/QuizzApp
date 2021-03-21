package com.example.quizzapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_answer_result.*

class AnswerResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer_result)

        var questionNumber = intent.getIntExtra("question_number", 1)
        questionNumber++
        var answerStatus = intent.getStringExtra("answer_status")
        var rightAnswers = intent.getIntExtra("right_answers", 0)

        nextquestion_btn.setOnClickListener{
            if(answerStatus == "correct"){
                val intent = Intent(this, AnswerActivity::class.java)
                intent.putExtra("question_number", questionNumber)
                intent.putExtra("right_answers", rightAnswers)
                startActivity(intent)
                finish()
            }else if(answerStatus == "incorrect"){
                val intent = Intent(this, AnswerActivity::class.java)
                intent.putExtra("question_number", questionNumber)
                intent.putExtra("right_answers", rightAnswers)
                startActivity(intent)
                finish()
            }

        }

        selectcategory_btn.setOnClickListener{
            val intent = Intent(this, SelectCategoryActivity::class.java)
            startActivity(intent)
            finish()
        }

        if(answerStatus == "correct"){
            result_img.setImageResource(R.drawable.tick)
        }else{
            result_img.setImageResource(R.drawable.cross)
        }

    }
}
package com.example.quizzapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_answer_result.*

class AnswerResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer_result)

        //putExtra Import: question number, answer status, right answers & category number
        var questionNumber = intent.getIntExtra("question_number", 1)
        questionNumber++
        var answerStatus = intent.getStringExtra("answer_status")
        var rightAnswers = intent.getIntExtra("right_answers", 0)
        val categoryNumber = intent.getIntExtra("category_number", 1)

        //Update UI
        if(answerStatus == "correct"){
            correctincorrect.text = "CORRECT"
        }else if(answerStatus == "incorrect"){
            correctincorrect.text = "INCORRECT"
        }

        //Navigation listener - Next Question, pass question number, right answers & answer status
        nextquestion_btn.setOnClickListener{
            val intent = Intent(this, AnswerActivity::class.java)
            intent.putExtra("question_number", questionNumber)
            intent.putExtra("right_answers", rightAnswers)
            intent.putExtra("category_number", categoryNumber)
            startActivity(intent)
            finish()
        }

        //Navigation listener - Category Select
        selectcategory_btn.setOnClickListener{
            val intent = Intent(this, SelectCategoryActivity::class.java)
            startActivity(intent)
            finish()
        }

        //Set result image
        if(answerStatus == "correct"){
            result_img.setImageResource(R.drawable.tick)
        }else{
            result_img.setImageResource(R.drawable.cross)
        }

    }
}
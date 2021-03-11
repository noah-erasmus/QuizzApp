package com.example.quizzapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_answer.*

class AnswerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer)

        val questionslist = Constants.getQuestions()

        val questionNumber = 1
        val question = questionslist[questionNumber-1]

        quiz_question.text = question.question
        answer1.text = question.optionOne
        answer2.text = question.optionTwo
        answer3.text = question.optionThree
        answer4.text = question.optionFour

        progressbar.progress = questionNumber
        progress.text = "$questionNumber" + "/" + questionslist.size

        var answer: RadioButton
        answer_submit.setOnClickListener{
            var id: Int = answer_options.checkedRadioButtonId
            if(id != 1){
                answer = findViewById(id)
                Toast.makeText(this, "Checked answer: ${answer.text}", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Please select your answer.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
package com.example.quizzapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
    }
}
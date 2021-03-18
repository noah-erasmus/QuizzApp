package com.example.quizzapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_answer.*

class AnswerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer)

        back2categories_btn.setOnClickListener{
            val intent = Intent(this, SelectCategoryActivity::class.java)
            startActivity(intent)
            finish()
        }

        var questionNumber = intent.getIntExtra("question_number", 1)
        var questionslist = Constants.getCategory1()

        var categoryNumber = intent.getIntExtra("category_number", 1)

        if(categoryNumber.equals(1)){
            questionslist = Constants.getCategory1()
        }else if(categoryNumber.equals(2)){
            questionslist = Constants.getCategory2()
        }else{
            questionslist = Constants.getCategory3()
        }

        val question = questionslist[questionNumber-1]



        quiz_question.text = question.question
        answer1.text = question.optionOne
        answer2.text = question.optionTwo
        answer3.text = question.optionThree
        answer4.text = question.optionFour
        question_count.text = "Question ${question.id}"

        var answer: RadioButton
        answer_submit.setOnClickListener{

            var id: Int = answer_options.checkedRadioButtonId
            if(id != -1){
                answer = findViewById(id)



                var rightAnswers: Int = 0
                var wrongAnswers: Int = 0

                if(answer.text.equals(question.correctAnswer)){
                    rightAnswers++

                    val alertDialogBuilder = AlertDialog.Builder(this)
                    alertDialogBuilder.setTitle("CORRECT!")
                    alertDialogBuilder.setMessage("Ready for the next question?")
                    alertDialogBuilder.setPositiveButton("Continue"){dialog, which ->
                        var intent = Intent(this, AnswerActivity::class.java)
                        questionNumber++
                        if(questionNumber.equals((6))){
                            intent = Intent(this, LevelFinishActivity::class.java)
                            startActivity(intent)
                            finish()
                        }else{
                            intent.putExtra("question_number", questionNumber)
                            startActivity(intent)
                            finish()
                        }
                    }
                    alertDialogBuilder.setNegativeButton("Categories"){dialog, which ->
                        val intent = Intent(this, SelectCategoryActivity::class.java)
                        startActivity(intent)
                        finish()
                    }
                    alertDialogBuilder.show()
                }else{
                    wrongAnswers++
                    val alertDialogBuilder = AlertDialog.Builder(this)
                    alertDialogBuilder.setTitle("INCORRECT!")
                    alertDialogBuilder.setMessage("Want to try again?")
                    alertDialogBuilder.setPositiveButton("Retry"){dialog, which ->
                        val intent = Intent(this, AnswerActivity::class.java)
                        intent.putExtra("question_number", questionNumber)
                        startActivity(intent)
                        finish()
                    }
                    alertDialogBuilder.setNegativeButton("Categories"){dialog, which ->
                        val intent = Intent(this, SelectCategoryActivity::class.java)
                        startActivity(intent)
                        finish()
                    }
                    alertDialogBuilder.show()
                }
            }else{
                Toast.makeText(this, "Please select your answer.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
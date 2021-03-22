package com.example.quizzapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_answer.*
import kotlinx.android.synthetic.main.activity_level_finish.*

class AnswerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer)

        //Prepare shared preferences
        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val editor =  sharedPref.edit()

        //Navigation listener - Category Select
        back2category_btn.setOnClickListener{
            val intent = Intent(this, SelectCategoryActivity::class.java)
            startActivity(intent)
            finish()
        }

        //Find and use selected category
        var questionslist = Constants.getCategory1_1()
        var categoryNumber = intent.getIntExtra("category_number", 1)
        if(categoryNumber.equals(1)){
            val categoryLevel = sharedPref.getInt(Constants.CATEGORY1_LEVEL, 1)
            if(categoryLevel == 1){
                questionslist = Constants.getCategory1_1()
            }else if(categoryLevel == 2){
                questionslist = Constants.getCategory1_2()
            }else if(categoryLevel == 3){
                questionslist = Constants.getCategory1_3()
            }

        }else if(categoryNumber.equals(2)){
            val categoryLevel = sharedPref.getInt(Constants.CATEGORY2_LEVEL, 1)
            questionslist = Constants.getCategory2_1()
            if(categoryLevel == 1){
                questionslist = Constants.getCategory2_1()
            }else if(categoryLevel == 2){
                questionslist = Constants.getCategory2_2()
            }
        }else if(categoryNumber.equals(3)){
            val categoryLevel = sharedPref.getInt(Constants.CATEGORY3_LEVEL, 1)
            if(categoryLevel == 1){
                questionslist = Constants.getCategory3_1()
            }else if(categoryLevel == 2){
                questionslist = Constants.getCategory3_2()
            }

        }

        //Track progress in category
        var questionNumber = intent.getIntExtra("question_number", 1)
        val question = questionslist[questionNumber - 1]
        var progressCounter = 1

        //Fill UI with question data
        quiz_question.text = question.question
        answer1.text = question.optionOne
        answer2.text = question.optionTwo
        answer3.text = question.optionThree
        answer4.text = question.optionFour
        question_count.text = "Question ${question.id}"

        //Answer Status Tracker
        var q1Status = sharedPref.getString(Constants.Q1STATUS, "neutral")
        var q2Status = sharedPref.getString(Constants.Q2STATUS, "neutral")
        var q3Status = sharedPref.getString(Constants.Q3STATUS, "neutral")
        var q4Status = sharedPref.getString(Constants.Q4STATUS, "neutral")
        var q5Status = sharedPref.getString(Constants.Q5STATUS, "neutral")
        if(q1Status == "neutral"){
            q1_status.setImageResource(R.drawable.status_neutral)
        }else if(q1Status == "correct"){
            q1_status.setImageResource(R.drawable.tick_small)
        }else if(q1Status == "incorrect"){
            q1_status.setImageResource(R.drawable.cross_small)
        }
        if(q2Status == "neutral"){
            q2_status.setImageResource(R.drawable.status_neutral)
        }else if(q2Status == "correct"){
            q2_status.setImageResource(R.drawable.tick_small)
        }else if(q1Status == "incorrect"){
            q2_status.setImageResource(R.drawable.cross_small)
        }
        if(q3Status == "neutral"){
            q3_status.setImageResource(R.drawable.status_neutral)
        }else if(q3Status == "correct"){
            q3_status.setImageResource(R.drawable.tick_small)
        }else if(q1Status == "incorrect"){
            q3_status.setImageResource(R.drawable.cross_small)
        }
        if(q4Status == "neutral"){
            q4_status.setImageResource(R.drawable.status_neutral)
        }else if(q4Status == "correct"){
            q4_status.setImageResource(R.drawable.tick_small)
        }else if(q4Status == "incorrect"){
            q4_status.setImageResource(R.drawable.cross_small)
        }
        if(q5Status == "neutral"){
            q5_status.setImageResource(R.drawable.status_neutral)
        }else if(q1Status == "correct"){
            q5_status.setImageResource(R.drawable.tick_small)
        }else if(q1Status == "incorrect"){
            q5_status.setImageResource(R.drawable.cross_small)
        }

        //Listen for selected answer submission
        var answer: RadioButton
        answer_submit.setOnClickListener{

            //Store ID of selected option in an integer
            var id: Int = answer_options.checkedRadioButtonId

            //If an option is selected
            if(id != -1){

                //Select answer element by ID
                answer = findViewById(id)

                //Declare counters for wrong & right answers
                var rightAnswers: Int = intent.getIntExtra("right_answers", 0)
                var wrongAnswers: Int = intent.getIntExtra("wrong_answers", 0)

                //If the element's text matches the question's correct answer
                if(answer.text.equals(question.correctAnswer)){

                    //Increment counter
                    rightAnswers++

                    //Navigate to success activity or level finish
                    var intent = Intent(this, AnswerResultActivity::class.java)
                    if(questionNumber.equals((5))){
                        intent = Intent(this, LevelFinishActivity::class.java)
                        intent.putExtra("category_number", categoryNumber)
                        intent.putExtra("right_answers",rightAnswers)
                        startActivity(intent)
                        finish()
                    }else{
                        intent.putExtra("question_number", questionNumber)
                        intent.putExtra("category_number", categoryNumber)
                        intent.putExtra("answer_status", "correct")
                        intent.putExtra("right_answers",rightAnswers)
                        startActivity(intent)
                        finish()
                    }

                    //Outdated - Build success dialog
//                    val alertDialogBuilder = AlertDialog.Builder(this)
//                    alertDialogBuilder.setTitle("CORRECT!")
//                    alertDialogBuilder.setMessage("Ready for the next question?")
//                    alertDialogBuilder.setPositiveButton("Continue"){dialog, which ->
//                        var intent = Intent(this, AnswerActivity::class.java)
//                        questionNumber++
//                        if(questionNumber.equals((6))){
//                            intent = Intent(this, LevelFinishActivity::class.java)
//                            startActivity(intent)
//                            finish()
//                        }else{
//                            intent.putExtra("question_number", questionNumber)
//                            startActivity(intent)
//                            finish()
//                        }
//                    }
//                    alertDialogBuilder.setNegativeButton("Categories"){dialog, which ->
//                        val intent = Intent(this, SelectCategoryActivity::class.java)
//                        startActivity(intent)
//                        finish()
//                    }
//                    alertDialogBuilder.show()

                //Else the correct answer is not selected
                }else{

                    if(questionNumber.equals((5))){
                        intent = Intent(this, LevelFinishActivity::class.java)
                        intent.putExtra("category_number", categoryNumber)
                        intent.putExtra("right_answers",rightAnswers)
                        startActivity(intent)
                        finish()
                    }else{
                        //Navigate to result activity
                        var intent = Intent(this, AnswerResultActivity::class.java)
                        intent.putExtra("question_number", questionNumber)
                        intent.putExtra("answer_status", "incorrect")
                        intent.putExtra("right_answers",rightAnswers)
                        startActivity(intent)
                        finish()
                    }



                    //Outdated - Build failure dialog
//                    val alertDialogBuilder = AlertDialog.Builder(this)
//                    alertDialogBuilder.setTitle("INCORRECT!")
//                    alertDialogBuilder.setMessage("Want to try again?")
//                    alertDialogBuilder.setPositiveButton("Retry"){dialog, which ->
//                        val intent = Intent(this, AnswerActivity::class.java)
//                        intent.putExtra("question_number", questionNumber)
//                        intent.putExtra("category_number", categoryNumber)
//                        startActivity(intent)
//                        finish()
//                    }
//                    alertDialogBuilder.setNegativeButton("Categories"){dialog, which ->
//                        val intent = Intent(this, SelectCategoryActivity::class.java)
//                        startActivity(intent)
//                        finish()
//                    }
//                    alertDialogBuilder.show()

                }

            //Else an option is not selected
            }else{
                Toast.makeText(this, "Please select your answer.", Toast.LENGTH_SHORT).show()
            }

        }

    }
}
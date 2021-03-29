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

        //Prepare shared preferences
        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val editor =  sharedPref.edit()

        //Get username & avatar value from shared preferences
        val userName = sharedPref.getString(Constants.USERNAME, "Noah")
        val avatar = sharedPref.getString(Constants.AVATAR, "astronaut")

        //Update UI for profile card
        val cat1Level = sharedPref.getInt(Constants.CATEGORY1_LEVEL, 0)
        val cat2Level = sharedPref.getInt(Constants.CATEGORY2_LEVEL, 0)
        val cat3Level = sharedPref.getInt(Constants.CATEGORY3_LEVEL, 0)
        hello_user.text = "${userName}"
        if(avatar == "astronaut"){
            user_avatar.setImageResource(R.drawable.astronaut_white)
        }else if(avatar == "nurse"){
            user_avatar.setImageResource(R.drawable.nurse_white)
        }else if(avatar == "waitress"){
            user_avatar.setImageResource(R.drawable.waitress_white)
        }else if(avatar == "chef"){
            user_avatar.setImageResource(R.drawable.chef_white)
        }else if(avatar == "shipcaptain"){
            user_avatar.setImageResource(R.drawable.shipcaptain_white)
        }else if(avatar == "concierge"){
            user_avatar.setImageResource(R.drawable.concierge_white)
        }
        if(cat1Level == 4){
            cat1Trophy.setImageResource(R.drawable.full_trophy)
        }
        if(cat2Level == 4){
            cat2Trophy.setImageResource(R.drawable.full_trophy)
        }
        if(cat3Level == 4){
            cat3Trophy.setImageResource(R.drawable.full_trophy)
        }

        //Set progress indicators
        var category1Progress = sharedPref.getInt(Constants.CATEGORY1_LEVEL, 1) * 33.3
        category1Progress--
        onewordtitles_progress.progress = category1Progress.toInt()
        var category2Progress = sharedPref.getInt(Constants.CATEGORY2_LEVEL, 1) * 33.3
        category2Progress--
        oscarwinners_progress.progress = category2Progress.toInt()
        var category3Progress = sharedPref.getInt(Constants.CATEGORY3_LEVEL, 1) * 33.3
        category3Progress--
        generaltrivia_progress.progress = category3Progress.toInt()
        category1Progress /= 33.3
        onewordtitles_counter.text = "${category1Progress.toString().substringBefore(".")}/3"
        category2Progress /= 33.3
        oscarwinners_counter.text = "${category2Progress.toString().substringBefore(".")}/3"
        category3Progress /= 33.3
        generaltrivia_counter.text = "${category3Progress.toString().substringBefore(".")}/3"


        //Total category levels from shared preferences
        totallevel_view.text = "${
        sharedPref.getInt(Constants.CATEGORY1_LEVEL, 1) + sharedPref.getInt(com.example.quizzapp.Constants.CATEGORY2_LEVEL, 1) + sharedPref.getInt(com.example.quizzapp.Constants.CATEGORY3_LEVEL, 1) - 3
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

        //Button to reset shared preferences
        levelreset_btn.setOnClickListener{
            editor.clear()
            editor.apply()
            val intent = Intent(this, EnterNameActivity::class.java)
            startActivity(intent)
            finish()
        }
    }




}
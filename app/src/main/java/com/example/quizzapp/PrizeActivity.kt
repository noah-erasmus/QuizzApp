package com.example.quizzapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_prize.*
import kotlinx.android.synthetic.main.activity_select_category.*

class PrizeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prize)

        //Navigation listener - Trophy Case
        trophycase_btn.setOnClickListener{
            val intent = Intent(this, SelectCategoryActivity::class.java)
            intent.putExtra("question_number", 1)
            intent.putExtra("category_number", 3)
            startActivity(intent)
            finish()
        }

        //Navigation listener - Select Category
        selectcategory_btn.setOnClickListener{
            val intent = Intent(this, SelectCategoryActivity::class.java)
            intent.putExtra("question_number", 1)
            intent.putExtra("category_number", 3)
            startActivity(intent)
            finish()
        }
    }
}
package com.example.quizzapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_level_finish.*

class LevelFinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level_finish)

        newcategory_btn.setOnClickListener{
            val intent = Intent(this, SelectCategoryActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
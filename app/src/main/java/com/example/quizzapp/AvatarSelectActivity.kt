package com.example.quizzapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_avatar_select.*
import kotlinx.android.synthetic.main.activity_enter_name.*

class AvatarSelectActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_avatar_select)

        //Prepare shared preferences
        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val editor =  sharedPref.edit()

        //Input Listeners for each avatar
        astronaut.setOnClickListener{
            editor.apply{
                putString(Constants.AVATAR, "astronaut")
                apply()
            }
            //Navigate to Category Select
            val intent =  Intent(this, SelectCategoryActivity::class.java)
            startActivity(intent)
            finish()
        }
        waitress.setOnClickListener{
            editor.apply{
                putString(Constants.AVATAR, "waitress")
                apply()
            }
            //Navigate to Category Select
            val intent =  Intent(this, SelectCategoryActivity::class.java)
            startActivity(intent)
            finish()
        }
        chef.setOnClickListener{
            editor.apply{
                putString(Constants.AVATAR, "chef")
                apply()
            }
            //Navigate to Category Select
            val intent =  Intent(this, SelectCategoryActivity::class.java)
            startActivity(intent)
            finish()
        }
        shipcaptain.setOnClickListener{
            editor.apply{
                putString(Constants.AVATAR, "shipcaptain")
                apply()
            }
            //Navigate to Category Select
            val intent =  Intent(this, SelectCategoryActivity::class.java)
            startActivity(intent)
            finish()
        }
        nurse.setOnClickListener{
            editor.apply{
                putString(Constants.AVATAR, "nurse")
                apply()
            }
            //Navigate to Category Select
            val intent =  Intent(this, SelectCategoryActivity::class.java)
            startActivity(intent)
            finish()
        }
        concierge.setOnClickListener{
            editor.apply{
                putString(Constants.AVATAR, "concierge")
                apply()
            }
            //Navigate to Category Select
            val intent =  Intent(this, SelectCategoryActivity::class.java)
            startActivity(intent)
            finish()
        }
    }


}
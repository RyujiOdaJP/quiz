package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.decorView.systemUiVisibility =  (View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                or View.SYSTEM_UI_FLAG_FULLSCREEN
                or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)

        btnStart.setOnClickListener{
            if (enterName.text.toString().isEmpty()) {
                Toast.makeText(this, "please enter your name", Toast.LENGTH_SHORT).show()
            } else {
                //  Intent オブジェクトに記述することによって、別のアプリでアクティビティを開始できます
                val intent = Intent(this, QuizQuestionActivity::class.java)
                intent.putExtra(Constants.USE_NAME, enterName.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}
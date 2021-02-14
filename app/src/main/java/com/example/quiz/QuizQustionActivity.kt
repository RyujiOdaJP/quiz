package com.example.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_quiz_qustion.*

class QuizQustionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_qustion)

        val questionList = Constants.getQuestions()
        Log.d("Question Size", "${questionList.size}")

        val currentPosition = 1
        val question: Question = questionList[currentPosition - 1]

        progressBar.progress = currentPosition
        tvProgress.text = "${currentPosition}" + "/" + "${progressBar.max}"

        tvQuestion.text = question.question
        ivImage.setImageResource(question.image)
        tv_option_one.text = question.optionOne
        tv_option_two.text = question.optionTwo
        tv_option_three.text = question.optionThree
        tv_option_four.text = question.optionFour
        btnSubmit.text = "SUBMIT"
    }
}

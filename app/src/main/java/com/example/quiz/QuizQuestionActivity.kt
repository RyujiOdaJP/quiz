package com.example.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_quiz_question.*

class QuizQuestionActivity : AppCompatActivity() {

    private var mCurrentPosition = 1
    private var mQuestionList: ArrayList<Question>? = null
    private var mSelectedOptionPosition: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_question)

        mCurrentPosition = 1
        mQuestionList = Constants.getQuestions()

        setQuestion()

    }

    private fun setQuestion() {

        mCurrentPosition = 1
        val question = mQuestionList?.get(mCurrentPosition - 1)

        progressBar.progress = mCurrentPosition
        tvProgress.text = "${mCurrentPosition}" + "/" + "${progressBar.max}"

        tvQuestion.text = question?.question

        if (question != null) {
            ivImage.setImageResource(question.image)
            tv_option_one.text = question.optionOne
            tv_option_two.text = question.optionTwo
            tv_option_three.text = question.optionThree
            tv_option_four.text = question.optionFour
        }

        btnSubmit.text = "SUBMIT"
    }
}

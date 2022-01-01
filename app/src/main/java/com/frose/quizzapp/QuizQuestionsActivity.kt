package com.frose.quizzapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_quiz_questions.*

class QuizQuestionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        val questionsList = Constants.getQuestions()
        Log.i("Questions Size", "${questionsList.size}")

        var currentPosition = 1

        var currQuestion = questionsList[currentPosition - 1]
        tvQuestion.text = currQuestion.question
        questionImage.setImageResource(currQuestion.image)
        progressBar.setProgress(currentPosition)
        tvProgress.text = "$currentPosition" + "/" +"${progressBar.max}"
        textViewQ1.text = currQuestion.optionOne
        textViewQ2.text = currQuestion.optionTwo
        textViewQ3.text = currQuestion.optionThree
        textViewQ4.text = currQuestion.optionFour
    }
}
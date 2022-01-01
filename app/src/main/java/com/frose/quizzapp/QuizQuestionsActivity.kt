package com.frose.quizzapp

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_quiz_questions.*
import java.lang.reflect.Type

class QuizQuestionsActivity : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition:Int = 1
    private var mQuestionsList: List<Question>? = null
    private var mSelectedQuestionPostition: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)
        textViewOpt1.setOnClickListener(this)
        textViewOpt2.setOnClickListener(this)
        textViewOpt3.setOnClickListener(this)
        textViewOpt4.setOnClickListener(this)

        mQuestionsList = Constants.getQuestions()
       setQuestion()

    }

    private fun setQuestion(){

        mCurrentPosition = 1

        setDefault()

        var currQuestion = mQuestionsList!![mCurrentPosition - 1]
        tvQuestion.text = currQuestion.question
        questionImage.setImageResource(currQuestion.image)
        progressBar.setProgress(mCurrentPosition)
        tvProgress.text = "$mCurrentPosition" + "/" +"${progressBar.max}"
        textViewOpt1.text = currQuestion.optionOne
        textViewOpt2.text = currQuestion.optionTwo
        textViewOpt3.text = currQuestion.optionThree
        textViewOpt4.text = currQuestion.optionFour
    }

    private fun setDefault()
    {
        val options = ArrayList<TextView>()
        options.add(0, textViewOpt1)
        options.add(1, textViewOpt2)
        options.add(2, textViewOpt3)
        options.add(3, textViewOpt4)

        for (option in options)
        {
            option.setTextColor(Color.parseColor("#7A6666"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this,
                R.drawable.default_option_border_bg)
        }
    }

    override fun onClick(p0: View?) {
        when (p0?.id){
            textViewOpt1.id ->{
                setSelected(p0 as TextView, 1)
            }
            textViewOpt2.id ->{
                setSelected(p0 as TextView, 2)
            }
            textViewOpt3.id ->{
                setSelected(p0 as TextView, 3)
            }
            textViewOpt4.id ->{
                setSelected(p0 as TextView, 4)
            }
        }
    }

    private fun setSelected(tv: TextView, sPosition:Int)
    {
        setDefault()
        mSelectedQuestionPostition = sPosition
        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(this,
            R.drawable.selected_option_border_bg)
    }
}
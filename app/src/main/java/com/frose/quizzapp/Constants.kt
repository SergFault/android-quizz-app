package com.frose.quizzapp

object Constants{
    fun getQuestions() : List<Question>
    {
        val questionList = ArrayList<Question>()

        questionList.add(
            Question(1, "Which country does this flag belong to?",
            R.drawable.bahamas,
                "Bahamas",
                "Australia",
                "Armenia",
                "Austria",
                1
            )
        )
        return questionList
    }
}
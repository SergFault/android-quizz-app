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
        questionList.add(
            Question(2, "Which country does this flag belong to?",
                R.drawable.france,
                "Bahamas",
                "France",
                "Armenia",
                "Austria",
                2
            )
        )
        questionList.add(
            Question(3, "Which country does this flag belong to?",
                R.drawable.israel,
                "Bahamas",
                "France",
                "Armenia",
                "Israel",
                4
            )
        )
        questionList.add(
            Question(4, "Which country does this flag belong to?",
                R.drawable.italy,
                "Bahamas",
                "Italy",
                "Armenia",
                "Israel",
                2
            )
        )
        questionList.add(
            Question(5, "Which country does this flag belong to?",
                R.drawable.turkey,
                "Bahamas",
                "Italy",
                "Turkey",
                "Israel",
                3
            )
        )
        questionList.add(
            Question(6, "Which country does this flag belong to?",
                R.drawable.usa,
                "USA",
                "Italy",
                "Turkey",
                "Israel",
                1
            )
        )
        questionList.add(
            Question(7, "Which country does this flag belong to?",
                R.drawable.brazil,
                "USA",
                "Italy",
                "Turkey",
                "Brazil",
                4
            )
        )
        questionList.add(
            Question(8, "Which country does this flag belong to?",
                R.drawable.iceland,
                "USA",
                "Iceland",
                "Turkey",
                "Israel",
                2
            )
        )
        questionList.add(
            Question(9, "Which country does this flag belong to?",
                R.drawable.russia,
                "USA",
                "Italy",
                "Turkey",
                "Russia",
                4
            )
        )
        questionList.add(
            Question(10, "Which country does this flag belong to?",
                R.drawable.spain,
                "Spain",
                "Italy",
                "Turkey",
                "Israel",
                1
            )
        )
        return questionList
    }
}
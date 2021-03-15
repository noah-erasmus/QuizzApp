package com.example.quizzapp

object Constants {

    fun getQuestions(): ArrayList<Question>{

        val questionsList = ArrayList<Question>()

        val que1 = Question(1,
        "Deep-core drillers are tapped by NASA to split an asteroid heading directly to the Earth.",
        "Interstellar",
        "Gravity",
        "Armageddon",
        "Contact",
        "Armageddon")

        val que2 = Question(2,
        "This classic horror film features a prom massacre.",
        "Carrie",
        "Scream",
        "Psycho",
        "It",
        "Carrie")

        val que3 = Question(3,
        "The star of this movie is a little pig who thinks he is a sheep dog.",
        "Range",
        "Babe",
        "Gordy",
        "Ferdinand",
        "Babe")

        val que4 = Question(4,
        "Which of the following was directed by Martin Scorsese?",
        "Scarface",
        "Heat",
        "Munich",
        "Casino",
        "Casino")

        val que5 = Question(5,
        "Which of the following films was a musical?",
        "Shaft",
        "Evita",
        "Ghost",
        "Hitch",
        "Evita")

        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)
        questionsList.add(que4)
        questionsList.add(que5)

        return questionsList
    }

}
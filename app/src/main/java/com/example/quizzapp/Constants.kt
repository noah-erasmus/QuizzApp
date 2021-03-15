package com.example.quizzapp

object Constants {

    fun getCategory1(): ArrayList<Question>{

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

    fun getCategory2(): ArrayList<Question>{

        val questionsList = ArrayList<Question>()

        val que1 = Question(1,
                "Which Steven Spielberg film won best picture?",
                "Jaws",
                "Schindler's List",
                "Saving Private Ryan",
                "Jurassic Park",
                "Schindler's List")

        val que2 = Question(2,
                "For which film did Morgan Freeman win an Oscar?",
                "Driving Miss Daisy",
                "Invictus",
                "Million Dollar Baby",
                "The Shawshank Redemption",
                "Million Dollar Baby")

        val que3 = Question(3,
                "For which film did Tom Cruise not receive an Oscar nomination?",
                "Jerry Maguire",
                "Born on the Fourth of July",
                "Far and Away",
                "Magnolia",
                "Far and Away")

        val que4 = Question(4,
                "Which person has lost the most Oscars for which s/he was nominated?",
                "John Williams",
                "Meryl Streep",
                "Leonardo DiCaprio",
                "Peter O'Toole",
                "John Williams")

        val que5 = Question(5,
                "Which actor won an Oscar for portraying an Oscar winner?",
                "Cate Blanchett",
                "Tom Hanks",
                "Michelle Williams",
                "Robert Downey Jr",
                "Cate Blanchett")

        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)
        questionsList.add(que4)
        questionsList.add(que5)

        return questionsList
    }

    fun getCategory3(): ArrayList<Question>{

        val questionsList = ArrayList<Question>()

        val que1 = Question(1,
                "What was the first movie in the Marvel Cinematic Universe?",
                "Spiderman",
                "Ironman",
                "Batman",
                "The Avengers",
                "Ironman")

        val que2 = Question(2,
                "What term is used to describe the the western films directed by Italian director Sergio Leone?",
                "Tuscan Westerns",
                "Mafia Westerns",
                "Neapolitan Westerns",
                "Spaghetti Westerns",
                "Spaghetti Westerns")

        val que3 = Question(3,
                "In the 'Godfather' series, where was Vito Corleone born?",
                "Rome",
                "New York City",
                "Corleone, Sicily",
                "Athens",
                "Corleone, Sicily")

        val que4 = Question(4,
                "Which of the following is filmmaker Michael Bay known for?",
                "Romantic comedy",
                "Fanciful costume design",
                "Sweeping western landscapes",
                "Explosions",
                "Explosions")

        val que5 = Question(5,
                "For which of these movies did Leonardo DiCaprio win an Oscar for Best Actor?",
                "Blood Diamond",
                "The Last King of Scotland",
                "The Revenant",
                "Titanic",
                "The Revenant")

        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)
        questionsList.add(que4)
        questionsList.add(que5)

        return questionsList
    }
}
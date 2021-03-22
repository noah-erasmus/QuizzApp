package com.example.quizzapp

object Constants {

    const val CATEGORY1_LEVEL : String = "category1_level"
    const val CATEGORY2_LEVEL : String = "category2_level"
    const val CATEGORY3_LEVEL : String = "category3_level"

//    const val TOTAL_LEVELS : String = "totallevels"
    const val USERNAME : String = "Noah"

    fun getCategory1_1(): ArrayList<Question>{

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

    fun getCategory1_2(): ArrayList<Question>{

        val questionsList = ArrayList<Question>()

        val que1 = Question(1,
            "Of all the gin joints, in all the towns, in all the world, she walks into mine.",
            "Cocktail",
            "Oklahoma!",
            "Casablanca",
            "Maverick",
            "Casablanca")

        val que2 = Question(2,
            "Which of the following movies was NOT directed by Stephen Spielberg?",
            "Amistad",
            "Braveheart",
            "Lincoln",
            "Jaws",
            "Braveheart")

        val que3 = Question(3,
            "A dream within a dream within a dream ...",
            "Memento",
            "Glass",
            "Enchanted",
            "Inception",
            "Inception")

        val que4 = Question(4,
            "A biographical film about a legendary Mexican painter.",
            "Sabrina",
            "Matilda",
            "Frida",
            "Elizabeth",
            "Frida")

        val que5 = Question(5,
            "Tom Hanks starred in all these movies EXCEPT",
            "Shopgirl",
            "Philadelphia",
            "Big",
            "Sully",
            "Shopgirl")

        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)
        questionsList.add(que4)
        questionsList.add(que5)

        return questionsList
    }

    fun getCategory1_3(): ArrayList<Question>{

        val questionsList = ArrayList<Question>()

        val que1 = Question(1,
            "City boy Ren McCormack moves to a small town where the city council has banned rock music and dancing.",
            "Flashdance",
            "Stomp!",
            "Chicago",
            "Footloose",
            "Footloose")

        val que2 = Question(2,
            "Swing away, Merrill. Merrill, swing away.",
            "Moneyball",
            "Caddyshack",
            "Signs",
            "Rocky",
            "Signs")

        val que3 = Question(3,
            "A spoiled heiress suffers amnesia and gets tricked into thinking she is married to a carpenter with four sons.",
            "Overboard",
            "Parenthood",
            "Pleasantville",
            "Stepmom",
            "Overboard")

        val que4 = Question(4,
            "This film includes characters named Maximus, Lucius, Proximo, and Commodus.",
            "Glory",
            "Centurion",
            "Legion",
            "Gladiator",
            "Gladiator")

        val que5 = Question(5,
            "This film is set in the future, when polar ice caps have melted and sea levels cover every continent.",
            "Sharknado",
            "Poseidon",
            "Splash",
            "Waterworld",
            "Waterworld")

        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)
        questionsList.add(que4)
        questionsList.add(que5)

        return questionsList
    }

    fun getCategory2_1(): ArrayList<Question>{

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

    fun getCategory2_2(): ArrayList<Question>{

        val questionsList = ArrayList<Question>()

        val que1 = Question(1,
            "Which film featuring Oprah was nominated for Best Picture?",
            "Beloved",
            "Charlotte's Web",
            "Selma",
            "The Butler",
            "Selma")

        val que2 = Question(2,
            "For which film did Meryl Streep win Best Actress?",
            "The Iron Lady",
            "Julie & Julia",
            "Out Of Africa",
            "The Hours",
            "The Iron Lady")

        val que3 = Question(3,
            "Who are the only siblings ever to win lead acting awards?",
            "Ben & Casey Affleck",
            "Ethel & Lionel Barrymore",
            "Jake & Maggie Gyllenhaal",
            "Joane Fontaine & Olivia de Havilland",
            "Joane Fontaine & Olivia de Havilland")

        val que4 = Question(4,
            "Which of these people did NOT win a posthumous Oscar?",
            "Heath Ledger",
            "Howard Ashman",
            "John Wayne",
            "Walt Disney",
            "John Wayne")

        val que5 = Question(5,
            "Which year were the Academy Awards first televised",
            "1953",
            "1960",
            "1949",
            "1965",
            "1953")

        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)
        questionsList.add(que4)
        questionsList.add(que5)

        return questionsList
    }

    fun getCategory2_3(): ArrayList<Question>{

        val questionsList = ArrayList<Question>()

        val que1 = Question(1,
            "Which is the most recently added Oscar category?",
            "Best Visual Effects",
            "Best Documentary Short Subject",
            "Best Animated Feature",
            "Best Makeup & Hairstyling",
            "Best Animated Feature")

        val que2 = Question(2,
            "Which Oscar recipient had actress and activist Sacheen Littlefeather decline the award on their behalf?",
            "Jane Fonda",
            "Marlon Brando",
            "Sissy Spacek",
            "Warren Beatty",
            "Marlon Brando")

        val que3 = Question(3,
            "For which film did Tom Cruise not receive an Oscar nomination?",
            "Jerry Maguire",
            "Born on the Fourth of July",
            "Far and Away",
            "Magnolia",
            "Far and Away")

        val que4 = Question(4,
            "Which film won the most Oscars without winning Best Picture?",
            "The Ten Commandments",
            "Mary Poppins",
            "Raging Bull",
            "Cabaret",
            "Cabaret")

        val que5 = Question(5,
            "Whose nearly six-minute speech inspired the Academy to set a 45-second time limit?",
            "Greer Garson",
            "Halle Berry",
            "Sally Field",
            "Matthew McConaughey",
            "Greer Garson")

        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)
        questionsList.add(que4)
        questionsList.add(que5)

        return questionsList
    }

    fun getCategory3_1(): ArrayList<Question>{

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

    fun getCategory3_2(): ArrayList<Question>{

        val questionsList = ArrayList<Question>()

        val que1 = Question(1,
            "Which of these actors DIDN'T appear in 'Pulp Fiction'?",
            "Bruce Willis",
            "John Turturro",
            "Samuel L Jackson",
            "Uma Thurman",
            "John Turturro")

        val que2 = Question(2,
            "What sport was featured in the 1993 movie 'Cool Runnings'?",
            "Billiards",
            "Bowling",
            "Badminton",
            "Bobsled",
            "Bobsled")

        val que3 = Question(3,
            "Which of the following actors never starred as the Joker?",
            "Joaquin Phoenix",
            "Jim Carrey",
            "Heath Ledger",
            "Jack Nicholson",
            "Jim Carrey")

        val que4 = Question(4,
            "Who was the villain in 'Aladdin'?",
            "Jafar",
            "Ursula",
            "Scar",
            "Genie",
            "Jafar")

        val que5 = Question(5,
            "Which of the following things did Forrest Gump never do?",
            "Fight in the Vietname War",
            "Play the violin",
            "Play ping pong",
            "Work on a shrimp boat",
            "Play the violin")

        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)
        questionsList.add(que4)
        questionsList.add(que5)

        return questionsList
    }

    fun getCategory3_3(): ArrayList<Question>{

        val questionsList = ArrayList<Question>()

        val que1 = Question(1,
            "Where was the movie 'Good Will Hunting' set?",
            "Seattle",
            "London",
            "Boston",
            "Los Angeles",
            "Boston")

        val que2 = Question(2,
            "Which 1984 film featured a main character named Axel Foley?",
            "Back To The Future",
            "Beverley Hills Cop",
            "Footloose",
            "The Breakfast Club",
            "Beverley Hills Cop")

        val que3 = Question(3,
            "What is Dorothy's surname in The Wizard of Oz?",
            "Bale",
            "Gale",
            "Hale",
            "Yale",
            "Gale")

        val que4 = Question(4,
            "n which country was actor Russell Crowe born?",
            "USA",
            "New Zealand",
            "Australia",
            "Canada",
            "New Zealand")

        val que5 = Question(5,
            "In the 2004 film '50 First Dates', who plays the female lead opposite Adam Sandler?",
            "Drew Barrymore",
            "Sandra Bullock",
            "Emma Watson",
            "Reese Witherspoon",
            "Drew Barrymore")

        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)
        questionsList.add(que4)
        questionsList.add(que5)

        return questionsList
    }
}
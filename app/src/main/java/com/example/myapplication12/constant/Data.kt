package com.example.myapplication12.constant

//вопросы про футбол
var listQuestionFootballEasy = listOf("how many players are on the football team?","Which country hosted the first official football game?","how long does one time last?","How many referees usually direct a football match?","the most prestigious football club tournament?","Which country has won the most FIFA World Cups?","How many zones are marked for corner kicks?","A famous football player from Argentina?","a famous footballer from Portugal?","a famous footballer from England?")
var listQuestionFootballMiddle = listOf("Who won the last Champions League final?","which team won the last World Cup?","from how many meters do penalties kick?","how long does the extra time last ?","what is the width of the football goal?","the most decorated football player in history?","the most titled football club?","the most titled English football club?","what is it called when a player scored 5 goals in a match?","who of the players has not won the World Cup?")
var listQuestionFootballHard = listOf("Which club has won the Champions League most often?","Which club bought Neymar for a record transfer in 2017?","when was the first FIFA World Cup held?","when video replays (VAR) were first used?","when was the first match in the history of the Olympics held?","which football clubs are located in the same city?","Which club has never won the Champions League?","How many titles has Lionel Messi won?","the most titled Italian club?","the most titled Russian club?")

//вопросы про баскетбол
var listQuestionBasketEasy = listOf("What is the goal in basketball?","How many players in each team on the field?","How long does one period in NBA basketball last?","What is the name of the line from which free throws are made?","What is the diameter of the basketball basket?","What size of ball is used in men's basketball?","What is the size of the ball used in women's basketball?","What is the distance from the basket to the three-point line?","when was the first official basketball game?","when was basketball included in the Olympic program?")
var listQuestionBasketMiddle = listOf("What is the size of the basketball court?","What is a \"flop\" in basketball?","the maximum number of fouls before elimination?","What game period is called the \"harmonious quarter\"?","How high is the basketball hoop?","What game element is called \"pick and roll\"?","What is a rebound in basketball?","the maximum time to attack in the NBA?","What types of free throws exist in basketball?"," which team did Michael Jordan play for?")
var listQuestionBasketHard = listOf("What is a \"fastbreak\" in basketball?","what is a \"post-up\"?","What does \"NCAA\" mean in the context of basketball?","What is a \"crossover\" in basketball and how is it used?","a player who can play both forward and center positions?","choosing NBA players from colleges and international leagues?","What is a \"block shot\" in basketball?","The year the National Basketball Association was founded?","Which player is considered the best sniper in NBA history?","Which basketball player acquired the nickname \"The King\"?")

//вопросы про хоккей
var listQuestionHockeyEasy = listOf("what is the main equipment in hockey?","the number of the hockey team during the game?","what does a puck look like in hockey?","what is the name of the goalie zone?","who wears the captain's armband?","the year hockey was declared an official Olympic sport?","the action when they remove the puck from their zone?","Which hockey player is called a \"goalkeeper\"?","Which hockey players wear numbers 1, 2 and 3?","is hockey an Olympic sport?")
var listQuestionHockeyMiddle = listOf("What are hockey sanctions in the game?","What does \"an empty-net goal\" mean?","What is the \"hockey draft\"?","What 3 zones are there on the hockey field?","by what letter can you find the team captain?","What does the term overtime mean?","choosing the team that will attack first","What does \"scoring a hat trick\" mean in hockey?","What is \"high sticking\" in hockey?","how many periods in hockey?")
var listQuestionHockeyHard = listOf("What is a \"cross check\" in hockey?","What is a \"hockey scoring average point\"?","What is a \"neutral zone hockey zone\"?","a goal is scored when...","What does the term \"goal camera\" mean in hockey?","who can replace the captain in hockey?","In what year was the first official hockey game held?","When was the International Hockey Federation created?","When was the first official women's hockey game held?","In what year did the \"Twilight Final\" in hockey take place?")

//правильные ответы на легкие вопросы про футбол
var mapCorrectAnswerFootballEasy = mapOf(listQuestionFootballEasy[0] to "11",listQuestionFootballEasy[1] to "England",listQuestionFootballEasy[2] to "45 minutes",listQuestionFootballEasy[3] to "3",
                                         listQuestionFootballEasy[4] to "UEFA Champions League",listQuestionFootballEasy[5] to "Brazil National Team",listQuestionFootballEasy[6] to "4",
                                         listQuestionFootballEasy[7] to "L.Messi",listQuestionFootballEasy[8] to "C. Ronaldo",listQuestionFootballEasy[9] to "D.Beckham")

//правильные ответы на средние вопросы про футбол
var mapCorrectAnswerFootballMiddle = mapOf(listQuestionFootballMiddle[0] to "Manchester City",listQuestionFootballMiddle[1] to "Argentina",listQuestionFootballMiddle[2] to "11",listQuestionFootballMiddle[3] to "15",
                                           listQuestionFootballMiddle[4] to "7,32 meters",listQuestionFootballMiddle[5] to "L.Messi",listQuestionFootballMiddle[6] to "Real Madrid",
                                           listQuestionFootballMiddle[7] to "Manchester United",listQuestionFootballMiddle[8] to "penta trick",listQuestionFootballMiddle[9] to "C.Ronaldo")

//правильные ответы на сложные вопросы про футбол
var mapCorrectAnswerFootballHard = mapOf(listQuestionFootballHard[0] to "Real Madrid",listQuestionFootballHard[1] to "PSG",listQuestionFootballHard[2] to "1930",listQuestionFootballHard[3] to "2016",
                                         listQuestionFootballHard[4] to "1900",listQuestionFootballHard[5] to "West Ham United and Chelsea",listQuestionFootballHard[6] to "Arsenal",
                                         listQuestionFootballHard[7] to "44",listQuestionFootballHard[8] to "FC Milan",listQuestionFootballHard[9] to "FC Spartak")

//
var mapCorrectAnswerBasketEasy = mapOf(listQuestionBasketEasy[0] to "Throw the ball into the opponent's basket",listQuestionBasketEasy[1] to "5",listQuestionBasketEasy[2] to "12",listQuestionBasketEasy[3] to "Free Throw line",
                                       listQuestionBasketEasy[4] to "45 centimeters",listQuestionBasketEasy[5] to "7",listQuestionBasketEasy[6] to "6",
                                       listQuestionBasketEasy[7] to "6.75 meters",listQuestionBasketEasy[8] to "1892",listQuestionBasketEasy[9] to "1936")

var mapCorrectAnswerBasketMiddle = mapOf(listQuestionBasketMiddle[0] to "28*15 meters",listQuestionBasketMiddle[1] to "Artificial fall of a player to get a foul",listQuestionBasketMiddle[2] to "5",listQuestionBasketMiddle[3] to "Second quarter",
                                         listQuestionBasketMiddle[4] to "3.05 meters",listQuestionBasketMiddle[5] to "Combination of pass and screening",listQuestionBasketMiddle[6] to "Capturing the ball after an unsuccessful attempt to throw",
                                         listQuestionBasketMiddle[7] to "24 seconds",listQuestionBasketMiddle[8] to "1 point and 2 points",listQuestionBasketMiddle[9] to "Chicago Bulls")

var mapCorrectAnswerBasketHard = mapOf(listQuestionBasketHard[0] to "Fast attacking transition from defense to attack",listQuestionBasketHard[1] to "playing in the near post",listQuestionBasketHard[2] to "National Association of Collegiate Athleticism",listQuestionBasketHard[3] to "movement when the player quickly changes direction",
                                       listQuestionBasketHard[4] to "Forward center",listQuestionBasketHard[5] to "NBA Draft",listQuestionBasketHard[6] to "A defensive action aimed at blocking a throw",
                                       listQuestionBasketHard[7] to "1946",listQuestionBasketHard[8] to "Рэй Аллен",listQuestionBasketHard[9] to "Lebron James")

//правильные ответы на легкие вопросы про хоккей
var mapCorrectAnswerHockeyEasy = mapOf(listQuestionHockeyEasy[0] to "hockey stick",listQuestionHockeyEasy[1] to "6",listQuestionHockeyEasy[2] to "black,round,flat",listQuestionHockeyEasy[3] to "goalie zone",
                                       listQuestionHockeyEasy[4] to "captain",listQuestionHockeyEasy[5] to "1924",listQuestionHockeyEasy[6] to "clearing",
                                       listQuestionHockeyEasy[7] to "goalie",listQuestionHockeyEasy[8] to "goalkeepers",listQuestionHockeyEasy[9] to "yes")

//правильные ответы на средние вопросы про хоккей
var mapCorrectAnswerHockeyMiddle = mapOf(listQuestionHockeyMiddle[0] to "penalties for violating the rules",listQuestionHockeyMiddle[1] to "a goal when the goalkeeper is not on the ice",listQuestionHockeyMiddle[2] to "selection of new players in the hockey league",listQuestionHockeyMiddle[3] to "Attack zone,middle zone and defensive zone",
                                         listQuestionHockeyMiddle[4] to "C",listQuestionHockeyMiddle[5] to "extra time after a draw",listQuestionHockeyMiddle[6] to "Coin toss or draw",
                                         listQuestionHockeyMiddle[7] to "Three goals scored by one player",listQuestionHockeyMiddle[8] to "the stick is raised above the opponent's shoulders",listQuestionHockeyMiddle[9] to "3")

//правильные ответы на сложные вопросы про хоккей
var mapCorrectAnswerHockeyHard = mapOf(listQuestionHockeyHard[0] to "using a stick to physically influence an opponent",listQuestionHockeyHard[1] to "Statistics reflecting the average number of goals",listQuestionHockeyHard[2] to "This is a tactic of controlling the central part of the ice",listQuestionHockeyHard[3] to "the puck completely crossed the gate cavity",
                                       listQuestionHockeyHard[4] to "The camera located inside the gate",listQuestionHockeyHard[5] to "assistant captain",listQuestionHockeyHard[6] to "1875",
                                       listQuestionHockeyHard[7] to "1908",listQuestionHockeyHard[8] to "1892",listQuestionHockeyHard[9] to "1957")

var mapWrongAnswerFootballEasy = mapOf(listQuestionFootballEasy[0]+"wrong1" to "8",listQuestionFootballEasy[0]+"wrong2" to "9",listQuestionFootballEasy[0]+"wrong3" to "10",
                                       listQuestionFootballEasy[1]+"wrong1" to "Russia",listQuestionFootballEasy[1]+"wrong2" to "France",listQuestionFootballEasy[1]+"wrong3" to "Germany",
                                       listQuestionFootballEasy[2]+"wrong1" to "30 minutes",listQuestionFootballEasy[2]+"wrong2" to "60 minutes",listQuestionFootballEasy[2]+"wrong3" to "40 minutes",
                                       listQuestionFootballEasy[3]+"wrong1" to "1",listQuestionFootballEasy[3]+"wrong2" to "2",listQuestionFootballEasy[3]+"wrong3" to "4",
                                       listQuestionFootballEasy[4]+"wrong1" to "La Liga",listQuestionFootballEasy[4]+"wrong2" to "BundesLiga",listQuestionFootballEasy[4]+"wrong3" to "Ligue 1",
                                       listQuestionFootballEasy[5]+"wrong1" to "England",listQuestionFootballEasy[5]+"wrong2" to "France",listQuestionFootballEasy[5]+"wrong3" to "Argentina",
                                       listQuestionFootballEasy[6]+"wrong1" to "2",listQuestionFootballEasy[6]+"wrong2" to "6",listQuestionFootballEasy[6]+"wrong3" to "3",
                                       listQuestionFootballEasy[7]+"wrong1" to "C.Ronaldo",listQuestionFootballEasy[7]+"wrong2" to "L.Suarez",listQuestionFootballEasy[7]+"wrong3" to "T.Muller",
                                       listQuestionFootballEasy[8]+"wrong1" to "K.Mbappe",listQuestionFootballEasy[8]+"wrong2" to "Ibrahimovich",listQuestionFootballEasy[8]+"wrong3" to "F.Totti",
                                       listQuestionFootballEasy[9]+"wrong1" to "Rivaldo",listQuestionFootballEasy[9]+"wrong2" to "Pele",listQuestionFootballEasy[9]+"wrong3" to "E.Hazard")

var mapWrongAnswerFootballMiddle = mapOf(
                                         listQuestionFootballMiddle[0]+"wrong1" to "Barcelona", listQuestionFootballMiddle[0]+"wrong2" to "Juventus", listQuestionFootballMiddle[0]+"wrong3" to "Liverpool",
                                         listQuestionFootballMiddle[1]+"wrong1" to "Brasilia", listQuestionFootballMiddle[1]+"wrong2" to "France", listQuestionFootballMiddle[1]+"wrong3" to "Germany",
                                         listQuestionFootballMiddle[2]+"wrong1" to "10", listQuestionFootballMiddle[2]+"wrong2" to "15", listQuestionFootballMiddle[2]+"wrong3" to "9",
                                         listQuestionFootballMiddle[3]+"wrong1" to "10", listQuestionFootballMiddle[3]+"wrong2" to "20", listQuestionFootballMiddle[3]+"wrong3" to "25",
                                         listQuestionFootballMiddle[4]+"wrong1" to "5,05", listQuestionFootballMiddle[4]+"wrong2" to "6,85", listQuestionFootballMiddle[4]+"wrong3" to "8,05",
                                         listQuestionFootballMiddle[5]+"wrong1" to "C.Ronaldo", listQuestionFootballMiddle[5]+"wrong2" to "R.Lewandowski", listQuestionFootballMiddle[5]+"wrong3" to "Xavi",
                                         listQuestionFootballMiddle[6]+"wrong1" to "AC Milan", listQuestionFootballMiddle[6]+"wrong2" to "Barcelona", listQuestionFootballMiddle[6]+"wrong3" to "Arsenal",
                                         listQuestionFootballMiddle[7]+"wrong1" to "Liverpool", listQuestionFootballMiddle[7]+"wrong2" to "Chelsea", listQuestionFootballMiddle[7]+"wrong3" to "Arsenal",
                                         listQuestionFootballMiddle[8]+"wrong1" to "gekto-trick", listQuestionFootballMiddle[8]+"wrong2" to "ponto-trick", listQuestionFootballMiddle[8]+"wrong3" to "five",
                                         listQuestionFootballMiddle[9]+"wrong1" to "L.Messi", listQuestionFootballMiddle[9]+"wrong2" to "M.Close", listQuestionFootballMiddle[9]+"wrong3" to "Pele")

var mapWrongAnswerFootballHard = mapOf(listQuestionFootballHard[0]+"wrong1" to "Barcelona", listQuestionFootballHard[0]+"wrong2" to "FC Milan", listQuestionFootballHard[0]+"wrong3" to "QPR",
                                       listQuestionFootballHard[1]+"wrong1" to "Man City", listQuestionFootballHard[1]+"wrong2" to "Bayern Munchen", listQuestionFootballHard[1]+"wrong3" to "Barcelona",
                                       listQuestionFootballHard[2]+"wrong1" to "1920", listQuestionFootballHard[2]+"wrong2" to "1940", listQuestionFootballHard[2]+"wrong3" to "1950",
                                       listQuestionFootballHard[3]+"wrong1" to "2014", listQuestionFootballHard[3]+"wrong2" to "2015", listQuestionFootballHard[3]+"wrong3" to "2010",
                                       listQuestionFootballHard[4]+"wrong1" to "1903", listQuestionFootballHard[4]+"wrong2" to "1896", listQuestionFootballHard[4]+"wrong3" to "1899",
                                       listQuestionFootballHard[5]+"wrong1" to "Borussia and Bayern Munchen", listQuestionFootballHard[5]+"wrong2" to "Barcelona and Real Madrid", listQuestionFootballHard[5]+"wrong3" to "FC Milan and Juventus",
                                       listQuestionFootballHard[6]+"wrong1" to "Barcelona", listQuestionFootballHard[6]+"wrong2" to "Man City", listQuestionFootballHard[6]+"wrong3" to "Hamburg",
                                       listQuestionFootballHard[7]+"wrong1" to "50", listQuestionFootballHard[7]+"wrong2" to "40", listQuestionFootballHard[7]+"wrong3" to "38",
                                       listQuestionFootballHard[8]+"wrong1" to "Inter Milan", listQuestionFootballHard[8]+"wrong2" to "Fiorentina", listQuestionFootballHard[8]+"wrong3" to "Juventus",
                                       listQuestionFootballHard[9]+"wrong1" to "Zenit", listQuestionFootballHard[9]+"wrong2" to "Dinamo Moskow", listQuestionFootballHard[9]+"wrong3" to "Rubin")

var mapWrongAnswerBasketEasy = mapOf(listQuestionBasketEasy[0]+"wrong1" to "protect your basketball hoop",listQuestionBasketEasy[0]+"wrong2" to "score 50 points",listQuestionBasketEasy[0]+"wrong3" to "score 100 points",
                                     listQuestionBasketEasy[1]+"wrong1" to "4",listQuestionBasketEasy[1]+"wrong2" to "6",listQuestionBasketEasy[1]+"wrong3" to "11",
                                     listQuestionBasketEasy[2]+"wrong1" to "15",listQuestionBasketEasy[2]+"wrong2" to "10",listQuestionBasketEasy[2]+"wrong3" to "5",
                                     listQuestionBasketEasy[3]+"wrong1" to "dotted line",listQuestionBasketEasy[3]+"wrong2" to "thick line",listQuestionBasketEasy[3]+"wrong3" to "the central line",
                                     listQuestionBasketEasy[4]+"wrong1" to "50 centimeters",listQuestionBasketEasy[4]+"wrong2" to "52 centimeters",listQuestionBasketEasy[4]+"wrong3" to "30 centimeters",
                                     listQuestionBasketEasy[5]+"wrong1" to "5",listQuestionBasketEasy[5]+"wrong2" to "4",listQuestionBasketEasy[5]+"wrong3" to "6",
                                     listQuestionBasketEasy[6]+"wrong1" to "7",listQuestionBasketEasy[6]+"wrong2" to "5",listQuestionBasketEasy[6]+"wrong3" to "4",
                                     listQuestionBasketEasy[7]+"wrong1" to "6 meters",listQuestionBasketEasy[7]+"wrong2" to "8.75 meters",listQuestionBasketEasy[7]+"wrong3" to "10 meters",
                                     listQuestionBasketEasy[8]+"wrong1" to "1890",listQuestionBasketEasy[8]+"wrong2" to "1790",listQuestionBasketEasy[8]+"wrong3" to "1901",
                                     listQuestionBasketEasy[9]+"wrong1" to "1926",listQuestionBasketEasy[9]+"wrong2" to "1935",listQuestionBasketEasy[9]+"wrong3" to "1912")

var mapWrongAnswerBasketMiddle = mapOf(listQuestionBasketMiddle[0]+"wrong1" to "30*17 meters",listQuestionBasketMiddle[0]+"wrong2" to "20*15 meters",listQuestionBasketMiddle[0]+"wrong3" to "28*10 meters",
                                       listQuestionBasketMiddle[1]+"wrong1" to "quick goal",listQuestionBasketMiddle[1]+"wrong2" to "end of the game",listQuestionBasketMiddle[1]+"wrong3" to "throwing the ball",
                                       listQuestionBasketMiddle[2]+"wrong1" to "6",listQuestionBasketMiddle[2]+"wrong2" to "2",listQuestionBasketMiddle[2]+"wrong3" to "4",
                                       listQuestionBasketMiddle[3]+"wrong1" to "first quarter",listQuestionBasketMiddle[3]+"wrong2" to "third quarter",listQuestionBasketMiddle[3]+"wrong3" to "final quarter",
                                       listQuestionBasketMiddle[4]+"wrong1" to "3 meters",listQuestionBasketMiddle[4]+"wrong2" to "3.5 meters",listQuestionBasketMiddle[4]+"wrong3" to "3.25 meters",
                                       listQuestionBasketMiddle[5]+"wrong1" to "a combination of dribbling and passing",listQuestionBasketMiddle[5]+"wrong2" to "combination of fast gears",listQuestionBasketMiddle[5]+"wrong3" to "a combination with a sharp breakthrough forward",
                                       listQuestionBasketMiddle[6]+"wrong1" to "loss",listQuestionBasketMiddle[6]+"wrong2" to "pass",listQuestionBasketMiddle[6]+"wrong3" to "quick pass",
                                       listQuestionBasketMiddle[7]+"wrong1" to "20 seconds",listQuestionBasketMiddle[7]+"wrong2" to "23 seconds",listQuestionBasketMiddle[7]+"wrong3" to "22 seconds",
                                       listQuestionBasketMiddle[8]+"wrong1" to "3 point and 4 points",listQuestionBasketMiddle[8]+"wrong2" to "2 point and 3 points",listQuestionBasketMiddle[8]+"wrong3" to "3 point and 4 points",
                                       listQuestionBasketMiddle[9]+"wrong1" to "Los Angeles Lakers",listQuestionBasketMiddle[9]+"wrong2" to "Boston Celtics",listQuestionBasketMiddle[9]+"wrong3" to "Golden State Warriors")

var mapWrongAnswerBasketHard = mapOf(listQuestionBasketHard[0]+"wrong1" to "switching from attack to defense",listQuestionBasketHard[0]+"wrong2" to "aggressive defense",listQuestionBasketHard[0]+"wrong3" to "aggressive attack",
                                     listQuestionBasketHard[1]+"wrong1" to "playing in your zone",listQuestionBasketHard[1]+"wrong2" to "the opponent 's game",listQuestionBasketHard[1]+"wrong3" to "playing in the center of the field",
                                     listQuestionBasketHard[2]+"wrong1" to "National Association of Athletes of the USA",listQuestionBasketHard[2]+"wrong2" to "national Association of All Athletes",listQuestionBasketHard[2]+"wrong3" to "National Association of Young Players",
                                     listQuestionBasketHard[3]+"wrong1" to "smooth dribbling",listQuestionBasketHard[3]+"wrong2" to "false throw",listQuestionBasketHard[3]+"wrong3" to "blind pass",
                                     listQuestionBasketHard[4]+"wrong1" to "midfielder",listQuestionBasketHard[4]+"wrong2" to "striker",listQuestionBasketHard[4]+"wrong3" to "almoner",
                                     listQuestionBasketHard[5]+"wrong1" to "buying players",listQuestionBasketHard[5]+"wrong2" to "auction of players",listQuestionBasketHard[5]+"wrong3" to "competitions",
                                     listQuestionBasketHard[6]+"wrong1" to "miss when throwing",listQuestionBasketHard[6]+"wrong2" to "severe violation of the rules",listQuestionBasketHard[6]+"wrong3" to "jogging",
                                     listQuestionBasketHard[7]+"wrong1" to "1945",listQuestionBasketHard[7]+"wrong2" to "1946",listQuestionBasketHard[7]+"wrong3" to "1947",
                                     listQuestionBasketHard[8]+"wrong1" to "Rick Barry",listQuestionBasketHard[8]+"wrong2" to "Dave Bing",listQuestionBasketHard[8]+"wrong3" to "Paul Arizin",
                                     listQuestionBasketHard[9]+"wrong1" to "Walt Frazier",listQuestionBasketHard[9]+"wrong2" to "Magic Johnson",listQuestionBasketHard[9]+"wrong3" to "Michael Jordan")

var mapWrongAnswerHockeyEasy = mapOf(listQuestionHockeyEasy[0]+"wrong1" to "ball",listQuestionHockeyEasy[0]+"wrong2" to "the gun",listQuestionHockeyEasy[0]+"wrong3" to "skates",
                                     listQuestionHockeyEasy[1]+"wrong1" to "4",listQuestionHockeyEasy[1]+"wrong2" to "7",listQuestionHockeyEasy[1]+"wrong3" to "5",
                                     listQuestionHockeyEasy[2]+"wrong1" to "red,round",listQuestionHockeyEasy[2]+"wrong2" to "blue,round",listQuestionHockeyEasy[2]+"wrong3" to "multicolored,round",
                                     listQuestionHockeyEasy[3]+"wrong1" to "protective zone",listQuestionHockeyEasy[3]+"wrong2" to "back area",listQuestionHockeyEasy[3]+"wrong3" to "home zone",
                                     listQuestionHockeyEasy[4]+"wrong1" to "coach",listQuestionHockeyEasy[4]+"wrong2" to "goalkeeper",listQuestionHockeyEasy[4]+"wrong3" to "the oldest",
                                     listQuestionHockeyEasy[5]+"wrong1" to "1920",listQuestionHockeyEasy[5]+"wrong2" to "1934",listQuestionHockeyEasy[5]+"wrong3" to "1922",
                                     listQuestionHockeyEasy[6]+"wrong1" to "puck selection",listQuestionHockeyEasy[6]+"wrong2" to "pressure",listQuestionHockeyEasy[6]+"wrong3" to "attack",
                                     listQuestionHockeyEasy[7]+"wrong1" to "striker",listQuestionHockeyEasy[7]+"wrong2" to "defender",listQuestionHockeyEasy[7]+"wrong3" to "reserve",
                                     listQuestionHockeyEasy[8]+"wrong1" to "striker",listQuestionHockeyEasy[8]+"wrong2" to "defender",listQuestionHockeyEasy[8]+"wrong3" to "midfielder",
                                     listQuestionHockeyEasy[9]+"wrong1" to "no",listQuestionHockeyEasy[9]+"wrong2" to "will be coming soon",listQuestionHockeyEasy[9]+"wrong3" to "used to be")

var mapWrongAnswerHockeyMiddle = mapOf(listQuestionHockeyMiddle[0]+"wrong1" to "reducing the team's score",listQuestionHockeyMiddle[0]+"wrong2" to "removing a trainer",listQuestionHockeyMiddle[0]+"wrong3" to "stopping the game",
                                       listQuestionHockeyMiddle[1]+"wrong1" to "own goal",listQuestionHockeyMiddle[1]+"wrong2" to "a goal into your empty net",listQuestionHockeyMiddle[1]+"wrong3" to "goal across the field",
                                       listQuestionHockeyMiddle[2]+"wrong1" to "transfer window",listQuestionHockeyMiddle[2]+"wrong2" to "buying players",listQuestionHockeyMiddle[2]+"wrong3" to "selling players",
                                       listQuestionHockeyMiddle[3]+"wrong1" to "home,medium,long distance",listQuestionHockeyMiddle[3]+"wrong2" to "lower,middle,upper",listQuestionHockeyMiddle[3]+"wrong3" to "right,middle,left",
                                       listQuestionHockeyMiddle[4]+"wrong1" to "A",listQuestionHockeyMiddle[4]+"wrong2" to "K",listQuestionHockeyMiddle[4]+"wrong3" to "Z",
                                       listQuestionHockeyMiddle[5]+"wrong1" to "last 10 minutes of the game",listQuestionHockeyMiddle[5]+"wrong2" to "the last attack",listQuestionHockeyMiddle[5]+"wrong3" to "the first period",
                                       listQuestionHockeyMiddle[6]+"wrong1" to "at random",listQuestionHockeyMiddle[6]+"wrong2" to "the team that is visiting",listQuestionHockeyMiddle[6]+"wrong3" to "the team playing at home",
                                       listQuestionHockeyMiddle[7]+"wrong1" to "score 2 goals",listQuestionHockeyMiddle[7]+"wrong2" to "score 1 goal",listQuestionHockeyMiddle[7]+"wrong3" to "score 4 goals",
                                       listQuestionHockeyMiddle[8]+"wrong1" to "playing with a long stick",listQuestionHockeyMiddle[8]+"wrong2" to "hitting an opponent with a stick",listQuestionHockeyMiddle[8]+"wrong3" to "throwing a stick at an opponent",
                                       listQuestionHockeyMiddle[9]+"wrong1" to "2",listQuestionHockeyMiddle[9]+"wrong2" to "1",listQuestionHockeyMiddle[9]+"wrong3" to "4")

var mapWrongAnswerHockeyHard = mapOf(listQuestionHockeyHard[0]+"wrong1" to "distraction with a stick", listQuestionHockeyHard[0]+"wrong2" to "club breakage", listQuestionHockeyHard[0]+"wrong3" to "hitting the stick with the stick",
                                     listQuestionHockeyHard[1]+"wrong1" to "average number of successful passes",listQuestionHockeyHard[1]+"wrong2" to "maximum number of goals",listQuestionHockeyHard[1]+"wrong3" to "maximum number of intercepts",
                                     listQuestionHockeyHard[2]+"wrong1" to "this is the goalie's area",listQuestionHockeyHard[2]+"wrong2" to "this is the middle zone",listQuestionHockeyHard[2]+"wrong3" to "this is a zone for coaches",
                                     listQuestionHockeyHard[3]+"wrong1" to "the puck touched the wall of the gate",listQuestionHockeyHard[3]+"wrong2" to "the puck passed between the goalkeeper's legs",listQuestionHockeyHard[3]+"wrong3" to "the puck bounced back out of the gate",
                                     listQuestionHockeyHard[4]+"wrong1" to "camera on top of the gate",listQuestionHockeyHard[4]+"wrong2" to "camera under the gate",listQuestionHockeyHard[4]+"wrong3" to "camera next to the gate",
                                     listQuestionHockeyHard[5]+"wrong1" to "coach",listQuestionHockeyHard[5]+"wrong2" to "goalkeeper",listQuestionHockeyHard[5]+"wrong3" to "the oldest",
                                     listQuestionHockeyHard[6]+"wrong1" to "1876",listQuestionHockeyHard[6]+"wrong2" to "1877",listQuestionHockeyHard[6]+"wrong3" to "1878",
                                     listQuestionHockeyHard[7]+"wrong1" to "1909",listQuestionHockeyHard[7]+"wrong2" to "1907",listQuestionHockeyHard[7]+"wrong3" to "1906",
                                     listQuestionHockeyHard[8]+"wrong1" to "1896",listQuestionHockeyHard[8]+"wrong2" to "1893",listQuestionHockeyHard[8]+"wrong3" to "1890",
                                     listQuestionHockeyHard[9]+"wrong1" to "1967",listQuestionHockeyHard[9]+"wrong2" to "1955",listQuestionHockeyHard[9]+"wrong3" to "1953")
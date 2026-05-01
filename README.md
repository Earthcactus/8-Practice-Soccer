# 8-Practice-Soccer

## Teams and Games

* For the team and game data, we put them into a private data field because only the team should     access this information.

* We used constructors in the team and game classes to assign each of their values so that when the object is created, it's initialized.

* Getters and Setters were used so that other classes can access the private data fields.

* Then we created print methods to print team and game stats at the end of the season.



## Main Class

* We used an array for the four different teams and an ArrayList to store the different games played if the weather allowed it.

* The random generator is used to generate random temperatures paired with an if statement for determining whether a game is played that day, checking if the temp is <= 32 degres.

* Next, after that, the pairing for the teams. We decided that team four is always selected to play in the first game as the home team, if a game is played. Then we used a switch statement to randomly select the team playing against team four, and to determine which teams are playing against each other in the second game.

* The setters are used here to update the date in the game and team class.

* The countOfWinters variable is used to track if there are three weeks of cold weather, and if there are, the season ends, and the results of the season are printed.

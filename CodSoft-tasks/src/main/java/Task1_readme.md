## Number Guessing Game 

This Java program is a simple number guessing game. The user is asked to guess a random number between 1 and 10. The game continues until the user correctly guesses the number or reaches the maximum number of guesses (3).

### Code Overview
---------------

* The program's execution begins in the `main` method.
* It initializes several variables:
	+ `userChoice`: an integer to store the user's menu selection
	+ `min` and `max`: integers to define the range of the random number (1-10)
	+ `guessCount`: an integer to keep track of the number of guesses
	+ `random`: a `Random` object to generate a random number
	+ `randomNum`: an integer to store the randomly generated number
	+ `scanner`: a `Scanner` object to read user input
	+ `userGuess`: an integer to store the user's guess

### Game Menu
------------

A `do-while` loop is used to handle the main game menu.

* It displays a menu with options to "Start Game" or "Exit".
* It reads the user's choice and executes the corresponding logic.

### Game Logic
-------------

A `while` loop is used to run the game as long as the user has chosen "Start Game" and the player hasn't guessed correctly.

* Inside the loop:
	+ It prompts the user for a guess.
	+ It adds the entered guess to the `userGuess` variable.
	+ It checks if the guess is correct, too low, or too high and provides feedback.
	+ It increments the `guessCount` variable to keep track of the number of attempts.
	+ If the user reaches the maximum number of guesses without guessing correctly, the game ends and the correct answer is revealed.

### Replay Option
----------------

After each game, the user is asked if they want to play again.

* If they choose "Yes," the game loop restarts with a new random number.

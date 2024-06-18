Number Game
==========

### Overview

This Java program is a simple number guessing game where the user has to guess a randomly generated number between 1 and 10.

### Game Menu
-------------

The game starts with a menu that allows the user to select an option:

```java
System.out.println("""
                   Welcome to the Number Guessing Game!
                   Please select an option:
                   1. Start Game
                   2. Exit""");
```

The user's selection is stored in the `userChoice` variable.

### Game Logic
-------------

If the user selects option 1, the game logic is executed:

```java
while (userChoice == 1 && userGuess!= randomNum) {
    System.out.print("Enter your guess(1-10): ");
    userGuess = scanner.nextInt();
    System.out.println("Your guess is: " + userGuess);

    guessCount++;

    if (userGuess == randomNum) {
        System.out.println("Congratulations! Your guess is correct.");
    } else if (userGuess < randomNum) {
        System.out.println("Oops! Your guess is too low.");
    } else {
        System.out.println("Oops! Your guess is too high.");
    }

    if (guessCount == 3 && userGuess!= randomNum) {
        System.out.println(
                "You have reached the maximum number of guesses. The correct number was " + randomNum
                        + ".");
        break;
    }
}
```

In this code:

* The user is prompted to enter a guess between 1 and 10.
* The user's guess is stored in the `userGuess` variable.
* The `guessCount` variable is incremented to keep track of the number of guesses.
* If the user's guess is correct, a congratulatory message is displayed.
* If the user's guess is too low or too high, a hint is displayed.
* If the user reaches the maximum number of guesses (3) without guessing correctly, the correct answer is revealed and the game ends.

### Replay Option
----------------

After the game ends, the user is prompted to play again:

```java
System.out.println("Game Over! Do you want to play again? 1. Yes 2. No");
```

If the user selects option 1, the game restarts. If the user selects option 2, the game exits.

### Variables and Objects
-------------------------

* `userChoice`: stores the user's selection from the menu.
* `min` and `max`: define the range of possible numbers (1-10).
* `guessCount`: keeps track of the number of guesses.
* `random`: a `Random` object used to generate a random number.
* `randomNum`: the randomly generated number to be guessed.
* `scanner`: a `Scanner` object used to read user input.

### Requirements
--------------

* Java 8 or later

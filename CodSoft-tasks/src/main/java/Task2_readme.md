##  Student Grade Calculator Working

**Main Method:**

- The program's execution begins in the `main` method.
- First, it initializes a `Scanner` object to read input from the user.
- It asks for the number of subjects and stores it in the `numSubjects` variable.

**Input Loop:**

- A `for` loop is used to iterate over the specified number of subjects.
- Inside the loop:
    - It prompts the user for marks in each subject.
    - It adds the entered marks to the `totalMarks` variable.

**Calculating Average:**

- After the loop, it calculates the average percentage by dividing the `totalMarks` by `numSubjects`.
- It uses a type cast to ensure the result is a `double` to handle decimal values.

**Grade Logic:**

- The program uses a series of `if-else if` statements to assign a letter grade:
    - The first condition checks if the average percentage is 90 or above, assigning 'A'.
    - Each subsequent condition checks a decreasing range of percentages, assigning 'B', 'C', 'D', or 'F' accordingly.

**Output:**

- Finally, it displays the total marks, average percentage, and the calculated grade to the user.

Student Grade Calculator
=====================

### Overview

This Java program is a simple student grade calculator that calculates the total marks, average percentage, and grade based on the marks obtained in multiple subjects.

### Inputting Number of Subjects
-----------------------------

The program starts by asking the user to enter the number of subjects:

```java
System.out.println("Enter the number of subjects:");
int numSubjects = scanner.nextInt();
```

The user's input is stored in the `numSubjects` variable.

### Inputting Marks for Each Subject
---------------------------------

The program then loops through each subject, asking the user to enter the marks obtained:

```java
for (int i = 1; i <= numSubjects; i++) {
    System.out.println("Enter marks obtained in subject " + i + ":");
    int marks = scanner.nextInt();
    totalMarks += marks;
}
```

In this code:

* The loop iterates `numSubjects` times, once for each subject.
* The user is prompted to enter the marks obtained for each subject.
* The marks are stored in the `marks` variable and added to the `totalMarks` variable.

### Calculating Average Percentage
--------------------------------

After all marks have been input, the program calculates the average percentage:

```java
double averagePercentage = (double) totalMarks / numSubjects;
```

The average percentage is calculated by dividing the total marks by the number of subjects.

### Determining Grade
-------------------

The program then determines the grade based on the average percentage:

```java
char grade;
if (averagePercentage >= 90) {
    grade = 'A';
} else if (averagePercentage >= 80) {
    grade = 'B';
} else if (averagePercentage >= 70) {
    grade = 'C';
} else if (averagePercentage >= 60) {
    grade = 'D';
} else {
    grade = 'F';
}
```

In this code:

* The grade is determined based on the average percentage.
* If the average percentage is 90 or above, the grade is 'A'.
* If the average percentage is 80 or above but less than 90, the grade is 'B'.
* If the average percentage is 70 or above but less than 80, the grade is 'C'.
* If the average percentage is 60 or above but less than 70, the grade is 'D'.
* If the average percentage is less than 60, the grade is 'F'.

### Outputting Results
---------------------

Finally, the program outputs the total marks, average percentage, and grade:

```java
System.out.println("Total Marks: " + totalMarks);
System.out.println("Average Percentage: " + averagePercentage);
System.out.println("Grade: " + grade);
```

### Variables and Objects
-------------------------

* `scanner`: a `Scanner` object used to read user input.
* `numSubjects`: stores the number of subjects.
* `totalMarks`: stores the total marks obtained.
* `averagePercentage`: stores the average percentage.
* `grade`: stores the grade determined based on the average percentage.

### Requirements
--------------

* Java 8 or later

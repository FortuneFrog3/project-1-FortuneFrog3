# COP 3665 - Mobile Programming

# Project 1 - Music Trivia

## Objective:

This project is meant to help you understand the basic framework for working with and developing Android applications. This project has you creating multiple activities to handle a multiple choice music trivia game. You will need to adhere to the constraints given in this description and ensure that you are completing all objectives. 

## Learning Outcomes:

- Creation of an Android project
- Basic understanding of Android activities, layouts, and event handling
- Creating a data class in Kotlin that stores data for a question
- Using string IDs to access values
- Gain familiarity with submitting your work through Github

## Preparation:

To complete this project, you need to make sure that you have read and watched all material from the first two weeks of the course. You also need to have gone through our "GeoQuiz" lab as well.

You must use Android Studio to generate starter code for the project and add it to this repository. Once you have generated the files, you may need to add the files to git so they are able to be committed.

## Problem Description:

You are asked to create a music lyrics trivia game that builds upon the work done in the "GeoQuiz" lab. In this game, players are asked a total of five multiple choice (4 choices each) music trivia questions. Answering each question correctly gives the user 10 points. An incorrect answer will not give them any points.

You have been given the quiz questions and answers in a file called `quiz_questions.txt` in this repo. There is a star placed by each correct answer.

## Overview of the Interface:

The interface will display one question at a time, along with the four possible answers. It will also display the user's total score at the bottom of the screen. When the user answers a question correctly, the score will increase by 10 points. Since we haven't covered how to change screens yet, the app will continue to loop and ask the same questions repeatedly.

### Sample run of program

Here's an animated GIF file showing the solution in action. Note that the questions will continue looping for the user.
![animation of the app being used](Project-1-demo.gif)

## Model:

### The Question Class

A psuedocode sketch of this class:
```
Question(textResId: Int, answerId: Int, choiceIds: List<Int>)
```

This class is responsible for storing information pertaining to a specific question in the game. It should be a Data class. Note that integers are used instead of strings for holding questions and answers. This is a result of strings being referenced by Ids. Also, note that each Question contains text, the Id of the correct answer, and a list of the Ids for all the possible answers.

## Additional Requirements:

Your application must function as described below:

1. Your program must adhere to the all requirements provided in this description.
2. Your program must perform the functionality displayed in the video.
3. Any UI constants should be kept inside their appropriate xml files (this includes strings and colors).
4. You must use the questions and answers that are provided to you. This ensures consistency for grading purposes. 

## Important Notes:

- Projects will be graded on whether they correctly solve the problem, and whether they adhere to good programming practices.
- Projects must be received by the time specified on the due date. Late assignments will be graded based on rules found in the syllabus.
- Please review the academic honesty policy.
  - Note that viewing another student's solution, whether in whole or in part, is considered academic dishonesty.
  - Also note that submitting code obtained through the Internet or other sources, whether in whole or in part, is considered academic dishonesty. 

## Submission Instructions:

1. All code must be added and committed to your local git repository *as done in activity one or it may not be graded*.
2. All code must be pushed to the GitHub repository created when you "accepted" the assignment.
   1. After pushing, visit the web URL of your repository to verify that your code is there.
      If you don't see the code there, then we can't see it either.
   2. Please paste the URL to your repository to Canvas so we know that the app is ready to be graded
3. Your code must compile and run in a Pixel 2 emulator *as shown in the lectures or it might not be graded*.
   1. If your program will not compile, the graders will not be responsible for trying to test it.

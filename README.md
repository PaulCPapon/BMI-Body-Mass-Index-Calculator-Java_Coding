# BMI-Body-Mass-Index-Calculator-Java_Coding
This is a BMI(Body Mass Index) Calculator. I created a java command line application to calculate BMI depending on users input.



Assessment Details
Title: BMI Calculator.
Task: Write a Java program that calculate BMI (Body Mass Index).

Description
First of all, I created a command line Java project using the platform IntelliJ IDEA. I used Do While Loop to create my application. This application calculates BMI asking 2 inputs from users and it use BMI calculation formula. I choose to use do while because using do while loop it became easier to do this task.
I learned using For Loop from lecture in programming season at UWL University. I also did some research online (watched YouTube videos) to learn and understand better the concept of do while and how to use it in different scenario. 

Line 8: I import the Scanner class from Java Utility library which I will use for user input.

Line 10: I created a class called Main.

Line 13: I created the entry point of my application the main method.

Line 13-16: I created a void class method to print “Welcome message” (2 lines messages). This message gives an overall idea to the users what is the real purpose of my application and what it does.

Line 19: I created the entry point of my Java Application the main method.

Line 21: I called the void function inside the main method.

Line 24: I created a Boolean type of variable and initialized “false”, which I used in Do While Loop if user put any invalid input or input that is different than integer type to repeat the process again and again.

Line 26: Starting of my Do While Loop.

Line 27: I also used Try Catch method to get the right input from users. This is the starting point of Try catch method.

Line 29: This line is declaration of Scanner class, creating a variable called input.

Line 31-37: Asking the first input from the user (Weight in kilogram) and storing it in a double Weight variable. Then the program asks for second input Height (Height in meters) and store it as well in a double Height variable in double. I used the double because it is the right data type for weight and height, because user input could be a specific number and comma or point some numbers.

Line 41: Calculation of BMI (Body Mass Index). I calculate the BMI using the formula given by my tutor in the question (Formula: weight (kg) / [height (m)]2)

Line 35: Converting BMI value from double to String to get 2 decimal number after comma.

Lines 43-51: Checking BMI value and different scenario of Underweight, Healthy and Overweight.

Line 53: Break statement to exit from Loop and closing of try method.

Line 55-63: Checking for invalid input or error.
 

 

 
//***General idea or logic behind code or Pseudocode:
1. Ask first weight from users.
2. If users put invalid input ask again.
3. Store weight input.
4. Ask then height from users.
5. If users put invalid input ask again.
6. Store height input.
7. Calculate BMI (Body Mass Index) using formula given by tutor in question.
8. Check “If Condition” to produce right output.


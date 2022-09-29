<h3>Object-Oriented Data Structure Using Java, 4th Edition</h3>

<h4>Student: Patricia Antlitz - NECC Fall 2022 <br> Computer Science II</h4>
<h5>Chapter 2 - Exercise 11 - a, b, c</h5>

a. Create a Java interface named ```NumTrackerInterface.java```. It should have the following methods:<br>

```java
    void add(int);      // performs all calculations. Passes a parameter of type int, to receive the values through a object.int getSum();       --> returns the sum.
    int getCount();     // returns the count (how many numbers entered.)
    int getAverage();   // returns the average.
```
b. Create a class called ```Tracker1.java``` that implements the interface. This class will take the given numbers, add them, keep track of how many numbers were entered to use in the average calculation, and give an average of the sum.

- uses 3 variables:
  
```java
    int countNum;           // keeps track of the total amount of numbers given.
    int calcSum;            // holds the total of the addition
    double calcAverage;     // holds the total of the average calculation.
```
c. Create a class called ```Tracker2.java``` that implements the interface. This class should be able to accept the numbers, calculate the sum, get the count and give the average only when necessary.

- This class should have two instances variables: 
  
```java
    int countNum;   // to get the amount of numbers entered
    int calcSum;    // to add the numbers together
```

- only if necessary, method ```getAverage():```
    - The method ```add(int)``` will only perform the calculations for the sum, and the count for variables calcSum and countNum.
    - The average calculation will happen inside the method ```getAverage()``` instead.
    - The user will have to request the calculation to happen.
    - Takes a user input (yes or y to calculate, any key to skip.)
      

- Specs, used inside ``getAverage():``<br>
  ```java
      Initiates the scanner
        String userEntry;   // holds the user's answer
        double calcAverage; // holds the calculation for the average of the sum.
      If conditional statement to give the calculation or end the program.
   ```
<h5>Other:</h5>

Create a Sample class to run ``Tracker1.java``

- this is the main class: ``NumTrackerInterface_PatriciaAntlitz.java``
- both ``Tracker1`` and ``Tracker2`` objects are created in the main method

<hr>
<h5>Problems:</h5>

I followed the example give in class and through the videos on Blackboard. Because of the examples given I didn't have much trouble coding this.
My Tracker2.java file might not be exactly what the exercise is asking for, but I don't see why I would create two classes that are virtually the same, with the exception to one variable/calculation, because technically you can use Tracker1.java and just not call getAverage();
It's not like I can get rid of getAverage(); (because of the interface file). To solve that I included the average calculation inside the getAverage() instead of add(int), and asked the user if they wanted to calculate the average instead.
<hr>

<h5>Technologies</hr>
- JAVA 15.0.1


<hr>

<h3>To run:</h3>
<hr>

IDE:<br>
Build the project and run the NumTrackerInterface_PatriciaAntlitz.java file

CLI:<br>
* Navigate to the correct directory ....../NumTrackerInterface_PatriciaAntlitz/src <br>
* Run on terminal:
    * javac NumTrackerInterface_PatriciaAntlitz.java => compile
    * java NumTrackerInterface_PatriciaAntlitz.java => run

by [Patricia Antlitz - GitHub](https://github.com/patybn3)
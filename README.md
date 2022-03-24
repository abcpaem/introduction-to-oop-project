# Introduction to Object-Oriented Programming
Set of activities in Java designed to provide learners with an overview of the concepts of modelling &amp; Object-Oriented Programming (OOP) in Software Engineering.

## Activities
### Activity 1: [Introduction to Modelling](Activities/activity_1.md)
### Outcome:
- Exercise 1.1 - Introductory Reading - Modelling

### Activity 2: [Introduction to OPP, Abstraction and Encapsulation](Activities/activity_2.md)
### Outcome:
- Exercise 2.1 - Introductory Reading - Object-Oriented Programming (OOP)
- Exercise 2.2 - Introductory Reading - Class Diagrams & the Unified Modelling Language (UML)
- Exercise 2.3 - [UML Bird class diagram](Outcomes/UMLBirdClassDiagram.png)
- Exercise 2.4 - [Bird class code](src/com/techreturners/Bird.java)
- Exercise 2.5 - [Run console application](Outcomes/Exercise-2.5-Output.txt)

### Activity 3: [Introduction to Inheritance](Activities/activity_3.md)
### Outcome:
- Exercise 3.1 - Introductory Reading - Inheritance
- Exercise 3.2 - [UML Inheritance class diagram](Outcomes/UMLInheritanceClassDiagram.png)
- Exercise 3.3 - [Pigeon class code extending Bird class](src/com/techreturners/Pigeon.java)
- Exercise 3.4 - [Run console application](Outcomes/Exercise-3.4-Output.txt)
- [Optional Challenge](Outcomes/Exercise-3-Optional-Challenge-Output.txt)

### Activity 4: [Introduction to Polymorphism](Activities/activity_4.md)
### Outcome:
- Exercise 4.1 - Introductory Reading - Polymorphism & Abstract Classes
- Exercise 4.2 - [Bird class abstract](src/com/techreturners/Bird.java)
- Exercise 4.3 - [UML diagram for Bird class as abstract](Outcomes/UMLBirdAbstractClassDiagram.png)
- Exercise 4.4 - [Pigeon class with override method](src/com/techreturners/Pigeon.java)
- Exercise 4.5 - [Run console application](Outcomes/Exercise-4.5-Output.txt)
- Exercise 4.6 - [UML Penguin class diagram](Outcomes/UMLPenguinClassDiagram.png)
- Exercise 4.7 - [Penguin class code](src/com/techreturners/Penguin.java)
- Exercise 4.8 - [Run console application](Outcomes/Exercise-4.8-Output.txt)
- Exercise 4.9 - [Parrot class code](src/com/techreturners/Parrot.java) and [Console output](Outcomes/Exercise-4.9-Output.txt)

### Activity 5: [Introduction to Interfaces](Activities/activity_5.md)
### Outcome:
- Exercise 5.1 - [UML Bird class diagram with interface](Outcomes/UMLBirdClassWithInterfaceDiagram.png)
- Exercise 5.2 - [Dance interface code](src/com/techreturners/Dance.java)
- Exercise 5.3 - [Bird class with interface](src/com/techreturners/Bird.java)
- Exercise 5.4 - [Run console application](Outcomes/Exercise-5.4-Output.txt)

## Important Notes about the Exercises:

- Some classes keep mutating during the exercises, please check the class file history to see the changes in every exercise or check the commit changes for every exercise.
- Method *sleep* in Activity 3 Optional Challenge and the Dance interface methods were created with the first letter in lowercase as per Java naming conventions.

---

## Technology
This project was built using Java version 17.0.2 and the Community Edition for the IntelliJ 2021.3.2 development environment.

## How to run the app
1) cd to the project root folder in the command line
2) javac -d bin src/com/techreturners/*.java
3) java -cp bin com/techreturners/Main


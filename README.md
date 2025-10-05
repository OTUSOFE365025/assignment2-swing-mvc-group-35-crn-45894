[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/57HVEcop)
Example of an MVC design based on Swing. Answer questions 1 & 2 in this README file.

Group Members and Responsibilities
Lawrence Arryl Lopez (100910566) | Question 1 and Question 2
Harsh Patel
Shahyan Soltani 

Question 1 : Java Swing is a java toolkit that provides a set of reusable, graphical user-interface components such as buttons, labels, tables, trees, and dialogs. It's purpose is to provide these graphical user interfaces to developers so that they can create an interactive user interface. Java Swing is built on top of Java AWT (Abstract Window Toolkit) but it offers a significant increase in flexibility and control over the look of applications. In summary, Java Swing provides developers with a great amount of control over the GUI design and behaviour of their Java applications. 

Below is the UML Class diagram for the Swing Components used in the program

Question 2 : Look through the example code in the GitHub repository and explain how this example implements the MVC pattern. How does it differ from the conventional MVC pattern described in the lectures?

In the conventional MVC pattern described in the lectures, the models are the portions of a program that hold data and operations for achieving the computational goals of the program. The view portion provides a way to display a component and controllers receive and carry out commands from users. 

First examining how the example implements the MVC pattern, model.java in the provided example code does only hold data such as firstName and lastName aswell as provides the methods (getters and setters) for achieving the computational goals of the program. The View does not contain any data and only displays the user interface using swing components like JFrame, JLabel, and JButton to name a few. The controller acts a mediator between the View and the Model since it updates the model based on the input of the user and reflects the changes in the view. It seperates the data (model) and the interface (vew). In summary, this is how the example code provided implements the MVC pattern 

However, the example does differ from the conventional MVC pattern that is described within the lectures in a few different ways. 

To begin, the model is updated directly via the controller actions 

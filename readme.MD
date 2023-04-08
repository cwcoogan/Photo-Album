# Homework 8 - MVC - Model
![](https://img.shields.io/badge/Homework%208-MVC-blue) ![](https://img.shields.io/badge/Codestyle-Java-green)



Name: Chase Coogan\
Semeser: Spring 2023\
Class: CS 5004\
Github: [Github Link](https://github.com/cwcoogan)
___
## Project Outline:
This projet explores the _Model_ principle within the MVC design pattern. For the Model, I decided to store all objects and snapshots in a Hashmap. The reason I chose a Hashmap was so that I can iterate between different states of the shape based on the <K,V> pair. I explore various different Design Patterns that will be discussed below. To preface, the design patterns I implemented are as follows:

* Model-View-Controller Design Pattern
* Command Design Pattern
* Factory Design Pattern

Implementing these various Design Patterns allows my application to have better encapsulation, and allows my Model to only have access to the Commands it needs to execute the methods appropriately.
___ 
## Design Pattern:
This project follows the MVC model, as well as has integration with different design patterns such as the Command Pattern, and the Factory Pattern. File structure displayed below:

<br/>

<img src="filestructure.png" width="25%" height="40%" align="left" />
  
My file structure is broken up into various packages depending on their Design Pattern. The commands package follows the Command Design Pattern. The Command Design Pattern allows my application to encapsulate requests between the client and receiver within Command Objects. The way it works is by integrating an Interface which each ConcreteCommand class inherits to invoke various methods, allowing deeper encapsulation. Within my shapes package, I take advantage of the Factory Design Pattern by implementing a ShapeFactory. The ShapeFactory is responsible for instantiating new shapes based on the inputs. The Factory Pattern communicates with the Command Pattern through the ConcreteCommands. When a new shape is created and stored in a photoalbum, my application can then execute these commands. The photoalbum package is my model and is responsible for the storage and manipulation of the data. The data being stored and modified is the object and it's state(s).
<br clear="left"/>
<br/>
___ 

## UML Diagram:

![](UML.png)

___
## Snapshot output photo:
* This image displays the output to the terminal of the snapshot and all of it's data.

![](snapshot.png)
___ 
## Links to code:
* [Commands Package](src/commands)
* [Shapes Package](src/shapes)
* [Photoalbum Class](src/photoalbum)
* [exceptions Package](src/exceptions)
* [UML Diagram](UML.png)
* [Snapshot Output](snapshot.png)
___ 

        









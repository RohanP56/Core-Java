# Abstraction

* ***Abstraction: It's a process of hiding unnecessary data.***
* In a Abstract class there may be Abstract mrthod or concreate method.
* Abstract class will be public by default.
* We can't create object of abstract class.
* If a class in Java is declared as an abstract class and it contains one or more abstract methods, then any subclass that extends this abstract class must implement all the abstract methods.
* If the subclass is also declared as abstract, then it is not required to implement the abstract methods.

### Abstract method

* To declare abstract method, the class have to be abstracat.
* Abstract mathod will be public and void by default.

# Interface

**An interface in Java serves as a contract or a blueprint for classes. It outlines a set of methods that any class implementing the interface must provide. However, it specifies what actions must be performed without dictating how to perform them.**

* Inside interface all variables are public, static, final.
* Inside interface all methods are (public & abstract) by default.
* if we implement any interface then we have to implement all the methods or we have to declare the class as abstract class
* We can' create object of interface
* Interface can have "default" concrete method.
* Interface can have "static" concrete method.
* Interface can have "private" concrete methods.
* multiple inheritance can be implement using Interface.
* An empty interface is called Marker or Tagged Interface.

### More About Interface

- Interfaces Cannot Be Instantiated, but Their References Can Be Created.
- A Class Implements an Interface, but an Interface Extends Another Interface
- ***An Interface Can Be Empty and Is Known as a Marker or Tagged Interface***
- Interfaces Can Be Used to Achieve Multiple Inheritance in Java

# Constructor

**A constructor in Java is a special method that has the same name as the class and does not have a return type. It's used to set up new objects immediately upon creation, ensuring that the object is ready to use right after its instantiation.**

**Types of Constructor in Java:**

1. Default Constructor
2. Parameterized Constructor
3. Copy Constructor

- **Default Costructor:** A constructor that has no parameters is known as default constructor. A default constructor is invisible. And if we write a constructor with no arguments, the compiler does not create a default constructor. It is taken out.
- **Parameterized Constructor:** A constructor that has parameters is known as parameterized constructor. If we want to initialize fields of the class with our own values, then use a parameterized constructor.
- **Copy Constructor:** Unlike other constructors copy constructor is passed with another object which copies the data available from the passed object to the newly created object.

# The Shadowing Problem:

**Variable shadowing occurs when a local variable within a method or constructor has the same name as an instance variable. In such cases, the local variable takes precedence within its scope, effectively "shadowing" the instance variable. This means any attempt to use the shared name within the scope will refer to the local variable instead of the instance variable.**

### Reason for Shadowing Problem:

_The shadowing issue can lead to subtle bugs because it often does not cause immediate, visible errors in the code. Programmers expecting to initialize instance variables can inadvertently end up manipulating the constructor or method parameters instead. This can cause the object's state to not be set up correctly, leading to incorrect behavior or results in the program._

### How to fix this Problem?

**Introducing the 'this' Keyword as a Solution**, The this keyword in Java is a reference variable that refers to the current object — the object whose method or constructor is being called. You can use this to resolve the ambiguity between instance variables and parameters that have the same names.


* Called during object creation
* Name will same as class name
* There's no return type
* Call during object creation
* Creating a constructor is not mandatory java creats constructor automatically
* but we can't initialize it, if we want to initialize
* something we have to creat own Constructors
* like method overloading we can also creat constructor overloading
* Creating a constructor is not mandatory java creats constructor automatically
* but we can't initialize it, if we want to initialize something we have to
* creat own Constructors
* like method overloading we can also creat constructor overloading

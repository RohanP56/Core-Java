# Constructor

**A constructor in Java is a special method that has the same name as the class and does not have a return type. It's used to set up new objects immediately upon creation, ensuring that the object is ready to use right after its instantiation.**

**Types of Constructor in Java:**

1. Default Constructor
2. Parameterized Constructor
3. Copy Constructor

- **Default Costructor:** A constructor that has no parameters is known as default constructor. A default constructor is invisible. And if we write a constructor with no arguments, the compiler does not create a default constructor.
- **Parameterized Constructor:** A constructor that has parameters is known as parameterized constructor. If we want to initialize fields of the class with our own values, then use a parameterized constructor.
- **Copy Constructor:** Unlike other constructors copy constructor is passed with another object which copies the data available from the passed object to the newly created object.

# The Shadowing Problem:

**Variable shadowing occurs when a local variable within a method or constructor has the same name as an instance variable. In such cases, the local variable takes precedence within its scope, effectively "shadowing" the instance variable. This means any attempt to use the shared name within the scope will refer to the local variable instead of the instance variable.**

### Reason for Shadowing Problem:

_The shadowing issue can lead to subtle bugs because it often does not cause immediate, visible errors in the code. Programmers expecting to initialize instance variables can inadvertently end up manipulating the constructor or method parameters instead. This can cause the object's state to not be set up correctly, leading to incorrect behavior or results in the program._

### How to fix this Problem?

**Introducing the 'this' Keyword as a Solution**, The this keyword in Java is a reference variable that refers to the current object — the object whose method or constructor is being called. You can use this to resolve the ambiguity between instance variables and parameters that have the same names.

- Called during object creation
- Name will same as class name
- There's no return type
- Call during object creation
- Creating a constructor is not mandatory java creats constructor automatically
- but we can't initialize it, if we want to initialize
- something we have to creat own Constructors
- like method overloading we can also creat constructor overloading
- Creating a constructor is not mandatory java creats constructor automatically
- but we can't initialize it, if we want to initialize something we have to
- creat own Constructors
- like method overloading we can also creat constructor overloading

## Constructor Overloading
*Like method we can also override constructor*, provides a way to define multiple constructors in a class, each with a unique set of parameters. This is useful when you want to initialize objects in different states or with different initial values depending on the available information or specific requirements.

### Constructor chaining with this() method
Constructor chaining refers to the process of calling 1 constructor from another. One of the ways of achieving it is by using the **this() method**.

### Constructor chaining using super() method
In Java, every class implicitly extends the Object class if no other superclass is specified. This makes Object the ultimate parent class for all Java classes. When constructing an object, Java ensures that the constructors of all superclasses are called, all the way up to the Object class. This guarantees that every part of the object is initialized according to the class hierarchy from the top down. **The first statement of a constructor can be either a call to another constructor of the same class using this(), or a call to a constructor of its superclass using super()**. If neither is explicitly written by the programmer, the compiler automatically inserts a call to super(), which invokes the no-argument constructor of the superclass.

### Implicit super() call
In Java, if you don't explicitly call the superclass's constructor using super(), the Java compiler automatically inserts a call to the no-argument constructor of the superclass at the beginning of the subclass's constructor. This behavior stems from Java's design to ensure that the entire object, including its inherited parts, is correctly initialized before any subclass-specific initialization takes place.

``` Java
class Animal {
    // Constructor of Animal class
    public Animal() {
        System.out.println("An animal is created.");
    }
}

class Dog extends Animal {
    // Constructor of Dog class
    public Dog() {
        // The compiler implicitly inserts super() here
        System.out.println("A dog is created.");
    }
}

public class TestInheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();  // Creating an instance of Dog
    }
}
```
# Constructor

**A constructor in Java is a special method that has the same name as the class and does not have a return type. It's used to set up new objects immediately upon creation, ensuring that the object is ready to use right after its instantiation.**

**Types of Constructor in Java:**

1. Default Constructor
2. Parameterized Constructor
3. Copy Constructor

- **Default Costructor:** A constructor that has no parameters is known as default constructor. A default constructor is invisible. And if we write a constructor with no arguments, the compiler does not create a default constructor.
- **Parameterized Constructor:** A constructor that has parameters is known as parameterized constructor. If we want to initialize fields of the class with our own values, then use a parameterized constructor.
- **Copy Constructor:** A copy constructor is a special type of constructor used to create a new object as a duplicate of an existing object with the same data. It is particularly useful when you need a deep copy of objects to ensure that the new object has its own separate copies of any mutable objects or data structures.

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

## 'super' keyword
The super keyword in Java is a reference variable that is used to refer to the parent class objects. It is commonly used for three main purposes: to access methods of the parent class, to access the constructor of the parent class, and to access fields of the parent class if they are shadowed by subclasses.

### Why Use the super Keyword?
- **Method Overriding:** To call the parent class's method when it has been overridden in a child class.
- **Field Access:** To access fields of the parent class that are hidden or shadowed by child class fields.

## Instance blocks
Instance blocks in Java, often called initializer blocks, are blocks of code that are run every time a new instance of a class is created. **They are useful for initializing common parts of various constructors within a class or when anonymous classes are used.**

### Use Case of instance block: 
- **Common Initialization:** When multiple constructors in a class share some common initialization code, placing this code in an instance block can reduce redundancy.
- **Anonymous Classes:** In scenarios involving anonymous classes where constructor creation isn't possible, instance blocks can be used to perform initialization tasks.

#### Difference between static, Instance, Constructor: 

- **Static blocks** are executed (only once when the class is first loaded).
- **Instance blocks** run every time a class instance is created.
- **Constructors** execute after the instance block.

# Flow of Program Using All of This: 
``` Java
public class ProgramFlow {

    // Static variable
    static int staticVar = 10;

    // Instance variable
    int instanceVar = 20;

    // Static block
    static {
        System.out.println("Static block executed. staticVar = " + staticVar);
        staticVar = 30;
    }

    // Instance block
    {
        System.out.println("Instance block executed. instanceVar = " + instanceVar);
        instanceVar = 40;
    }

    // Static method
    static void staticMethod() {
        System.out.println("Static method executed. staticVar = " + staticVar);
    }

    // Instance method
    void instanceMethod() {
        System.out.println("Instance method executed. instanceVar = " + instanceVar);
    }

    // Constructor
    public FlowExample() {
        System.out.println("Constructor executed. instanceVar = " + instanceVar);
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("Main method started.");

        // Calling static method
        staticMethod();

        // Creating an instance of FlowExample
        FlowExample example = new FlowExample();

        // Calling instance method
        example.instanceMethod();

        System.out.println("Main method ended.");
    }
}
```

### Flow of Execution Explained
**1. Loading the Class:** 
- The program starts with the loading of the FlowExample class by the Java Virtual Machine (JVM).
- Static variables and static blocks are executed first. This happens only once when the class is loaded.

**2. Static Variable Initialization:**
- The static variable staticVar is initialized to 10.
- **Output:** (Nothing yet, because this is just variable initialization).

**3. Static Block Execution:**
- The static block is executed immediately after static variables are initialized.
- The static block prints the current value of staticVar (which is 10) and then updates staticVar to 30.
- **Output:**
    Static block executed. staticVar = 10

**4. Main Method Execution:**
- The JVM then starts executing the main() method because this is the entry point of the program.
- **Output:**
    Main method started.

**5. Static Method Execution:**
- The staticMethod() is called from the main() method.
- The method prints the current value of staticVar, which is 30 (updated by the static block).
- **Output:**
    Static method executed. staticVar = 30

**6. Object Creation (FlowExample):**
- When new FlowExample() is called, the following steps occur in order:
a. Instance Variable Initialization:
- The instance variable instanceVar is initialized to 20.
- **Output:** (Nothing yet, because this is just variable initialization).
b. Instance Block Execution:
- The instance block is executed immediately after instance variables are initialized.
- The instance block prints the current value of instanceVar (which is 20) and then updates instanceVar to 40.
- **Output:**
    Instance block executed. instanceVar = 20
c. Constructor Execution:
- The constructor is executed after the instance block.
- The constructor prints the current value of instanceVar, which is 40 (updated by the instance block).
- **Output:**
    Constructor executed. instanceVar = 40

**7. Instance Method Execution:**
- The instanceMethod() is called on the newly created object.
- The method prints the current value of instanceVar, which is 40.
- **Output:**
    Instance method executed. instanceVar = 40

**8. Completion of Main Method:**
- Finally, the main() method prints a message indicating it has ended.
- **Output:**
    Main method ended.


***. Summary of Output**
*The final output of the program will be:*
- Static block executed. staticVar = 10       
- Main method started.    
- Static method executed. staticVar = 30   
- Instance block executed. instanceVar = 20     
- Constructor executed. instanceVar = 40   
- Instance method executed. instanceVar = 40       
- Main method ended.

**Detailed Flow Explanation**

**- Static Initialization (Static Block and Variables):** Executed when the class is loaded. Static blocks run only once and are typically used for static variable initialization.

**- Instance Initialization (Instance Block and Variables):** Executed every time a new object of the class is created. Instance blocks are useful when you want to initialize instance variables or perform actions common to all constructors.

**- Constructor:** Runs every time an object is created, immediately after instance blocks. Used to set up the initial state of an object.

**- Static Method:** Can be called without creating an instance of the class. Static methods operate on static data members.

**- Instance Method:** Operates on instance variables and requires an object of the class to be called.

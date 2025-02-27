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


/*
Flow of Execution Explained
1. Loading the Class: 
- The program starts with the loading of the FlowExample class by the Java Virtual Machine (JVM).
- Static variables and static blocks are executed first. This happens only once when the class is loaded.

2. Static Variable Initialization:
- The static variable staticVar is initialized to 10.
- Output: (Nothing yet, because this is just variable initialization).

3. Static Block Execution:
- The static block is executed immediately after static variables are initialized.
- The static block prints the current value of staticVar (which is 10) and then updates staticVar to 30.
- Output:
    Static block executed. staticVar = 10

4. Main Method Execution:
- The JVM then starts executing the main() method because this is the entry point of the program.
- Output:
    Main method started.

5. Static Method Execution:
- The staticMethod() is called from the main() method.
- The method prints the current value of staticVar, which is 30 (updated by the static block).
- Output:
    Static method executed. staticVar = 30

6. Object Creation (FlowExample):
- When new FlowExample() is called, the following steps occur in order:
a. Instance Variable Initialization:
- The instance variable instanceVar is initialized to 20.
- Output: (Nothing yet, because this is just variable initialization).
b. Instance Block Execution:
- The instance block is executed immediately after instance variables are initialized.
- The instance block prints the current value of instanceVar (which is 20) and then updates instanceVar to 40.
- Output:
    Instance block executed. instanceVar = 20
c. Constructor Execution:
- The constructor is executed after the instance block.
- The constructor prints the current value of instanceVar, which is 40 (updated by the instance block).
- Output:
    Constructor executed. instanceVar = 40
7. Instance Method Execution:
- The instanceMethod() is called on the newly created object.
- The method prints the current value of instanceVar, which is 40.
- Output:
    Instance method executed. instanceVar = 40
8. Completion of Main Method:
- Finally, the main() method prints a message indicating it has ended.
- Output:
    Main method ended.


*. Summary of Output
    The final output of the program will be:
            - Static block executed. staticVar = 10       
            - Main method started.    
            - Static method executed. staticVar = 30   
            - Instance block executed. instanceVar = 20     
            - Constructor executed. instanceVar = 40   
            - Instance method executed. instanceVar = 40       
            - Main method ended.

    
Detailed Flow Explanation  
    - Static Initialization (Static Block and Variables):
            - Executed when the class is loaded. Static blocks run only once and are typically used for static variable initialization.

    - Instance Initialization (Instance Block and Variables):
            - Executed every time a new object of the class is created. Instance blocks are useful when you want to initialize instance variables or perform actions common to all constructors.

    - Constructor:
            - Runs every time an object is created, immediately after instance blocks. Used to set up the initial state of an object.

    - Static Method:
            - Can be called without creating an instance of the class. Static methods operate on static data members.
    - Instance Method:
            - Operates on instance variables and requires an object of the class to be called.
 */
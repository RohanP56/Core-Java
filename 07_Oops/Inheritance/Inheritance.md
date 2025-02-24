# Inheritance

- **Single Inheritance**: In single inheritance, a class inherits from one superclass only. This means there is a single parent class and a single child class.
- **Multi Level Inheritance:**  In multilevel inheritance, a class is derived from another class, which is also derived from another class. This forms a chain of inheritance, where a class can inherit from a parent class and also act as a parent class to another subclass.
- **Hierarchical Inheritance:** In hierarchical inheritance, multiple classes inherit from a single parent class. This type of inheritance allows different classes to share a common structure and behavior from a single superclass.
- **Hybrid Inheritance:** Hybrid inheritance is a combination of two or more types of inheritance. While Java does not support multiple inheritance through classes, hybrid inheritance can be simulated using a combination of multilevel and hierarchical inheritance.
- **Multiple inheritance:** Multiple inheritance is a feature where a class can inherit features (methods and attributes) from more than one parent class. This allows for a class to combine functionalities of multiple classes. However, Java does not support multiple inheritance (through classes) to avoid complexity and potential issues.

  #### Diamond Problem:


  - Class A: The base class with a method display().
  - Classes B and C: Both inherit from A and might override the display() method.
  - Class D: Inherits from both B and C.
  - The ambiguity arises because D inherits from both B and C, which both inherit from A. If D calls display(), it’s unclear whether it should use B's implementation or C's implementation.
  - Conceptual Example of the Diamond Problem


```apache
class A {
    void display() {
        System.out.println("Display from A");
    }
}

class B extends A {
    void display() {
        System.out.println("Display from B");
    }
}

class C extends A {
    void display() {
        System.out.println("Display from C");
    }
}

// Hypothetical code, not allowed in Java
class D extends B, C {
    // Which display() method should be inherited?
}

public class Main {
    public static void main(String[] args) {
        D obj = new D();
        obj.display(); // Ambiguity: Should it call B's display or C's display?
    }
}
```

**Explanation**:

- Class A defines a method display().
- Class B and Class C both inherit from A and override the display() method.
- Class D hypothetically inherits from both B and C.
- The ambiguity arises in Class D because it's unclear which display() method to inherit - from B or C.
- **Why Multiple Inheritance Through Classes is Not Allowed in Java**
  Java disallows multiple inheritance through classes to prevent the complexities and ambiguities like the diamond problem. By not supporting multiple inheritance, Java maintains simplicity, avoiding scenarios where it is unclear which inherited method or attribute should be used.

#### Inheritance and its types Summary:

- Inheritance in Java allows a class to inherit properties and behaviors from another class.
- Inheritance promotes code reusability and method overriding.
- Single inheritance: A subclass inherits from one superclass.
- Multilevel inheritance: A class inherits from another class, which in turn inherits from another class.
- Hierarchical inheritance: Multiple subclasses inherit from a single superclass.
- Multiple inheritance (not allowed through classes in Java): A class cannot inherit from more than one class to avoid complexity and ambiguity (diamond problem).
- Diamond problem: Ambiguity arises when a class inherits from two classes that both inherit from a common base class.
- Inheritance in Java helps in organizing code, reducing redundancy, and managing relationships between classes effectively.

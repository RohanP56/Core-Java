// Base class
class Parent {
    // Method to be inherited by the child class
    public void inheritedMethod() {
        System.out.println("This is the inherited method from Parent.");
    }

    // Method to be overridden by the child class
    public void overriddenMethod() {
        System.out.println("This is the overridden method from Parent.");
    }
}

// Derived class
class Child extends Parent {
    // Override the method from the Parent class
    @Override
    public void overriddenMethod() {
        System.out.println("This is the overridden method in Child.");
    }

    // Child-specific method
    public void childSpecificMethod() {
        System.out.println("This is the child-specific method.");
    }
}

// Main class to demonstrate method calls
public class MethodsInInheritance {
    public static void main(String[] args) {
        // Create an instance of Child
        Child child = new Child();

        // Call the inherited method
        child.inheritedMethod(); // Expected output: "This is the inherited method from Parent."

        // Call the overridden method
        child.overriddenMethod(); // Expected output: "This is the overridden method in Child."

        // Call the child-specific method
        child.childSpecificMethod(); // Expected output: "This is the child-specific method."
    }
}
// Final class cannot be subclassed
final class FinalClass {
    public void display() {
        System.out.println("This is a final class.");
    }
}

class Parent {
    // Final variable; its value cannot be changed once assigned
    final int finalVariable = 10;

    // Final method; cannot be overridden by subclasses
    public final void finalMethod() {
        System.out.println("This is a final method.");
    }

    public void display() {
        System.out.println("Parent class display method.");
    }
}

class Child extends Parent {
    // Attempting to override the final method will result in a compile-time error
    // Uncommenting the following code will cause a compile-time error:
    /*
    @Override
    public void finalMethod() {
        System.out.println("Attempt to override final method.");
    }
    */

    @Override
    public void display() {
        System.out.println("Child class display method.");
    }
}

public class FinalDemo {
    public static void main(String[] args) {
        // Create instance of FinalClass
        FinalClass finalClass = new FinalClass();
        finalClass.display();  // Expected output: "This is a final class."

        // Create instance of Parent class
        Parent parent = new Parent();
        parent.finalMethod();  // Expected output: "This is a final method."
        parent.display();      // Expected output: "Parent class display method."

        // Create instance of Child class
        Child child = new Child();
        child.finalMethod();   // Expected output: "This is a final method."
        child.display();       // Expected output: "Child class display method."
    }
}
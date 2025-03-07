# Member Inner Classes
*A member inner class is like a class that lives inside another class. It's defined at the member level of the outer class, right alongside methods and instance variables. Think of it as a class that's so closely related to another class that it actually lives inside it!*
``` Java
class Superhero {
    private String secretIdentity = "Bruce Wayne";

    class Sidekick {
        void revealSecret() {
            System.out.println("The hero's secret identity is: " + secretIdentity);
        }
    }

    void callSidekick() {
        Sidekick robin = new Sidekick();
        robin.revealSecret();
    }
}

public class Main {
    public static void main(String[] args) {
        Superhero batman = new Superhero();
        batman.callSidekick();

        // We can also create a sidekick directly:
        Superhero.Sidekick robin = batman.new Sidekick();
        robin.revealSecret();
    }
}
```
### Features of Member Class:
- Member inner classes can access all members of the outer class, even the private ones.
- An inner class is always associated with an instance of its outer class.
- Member inner classes can have any access modifier (public, protected, default, private).
- Inner classes can extend other classes or implement interfaces, just like regular classes.
### When Should You Use Member Inner Classes?
- When you need a helper class that's closely tied to the main class's functionality.
- When you want to encapsulate a class that will only be used by the outer class.
- In GUI programming, for event handlers that need access to the components of the main window class.
- When implementing a data structure where the inner class represents a component of the structure (e.g., a Node class inside a LinkedList class).
### How to Create and Use Member Inner Classes
``` Java
class OuterClass {
    private int secretCode = 42;

    class InnerClass {
        void reveal() {
            System.out.println("The secret code is: " + secretCode);
        }
    }

    void useInner() {
        InnerClass inner = new InnerClass();
        inner.reveal();
    }
}
```

### To use the inner class from outside:
``` Java
public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.useInner();

        // Direct creation of inner class:
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.reveal();
    }
}
```

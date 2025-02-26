
class Vehicle {
    String name = "Generic Vehicle";

    public void start() {
        System.out.println(name + " is starting.");
    }
}

class Car extends Vehicle {
    // Shadowing the name field from Vehicle
    String name = "Car";

    public void start() {
        // Call to parent method
        super.start();
        System.out.println(this.name + " is starting with a key turn.");
    }

    public void displayName() {
        // Accessing the parent class's name field using super
        System.out.println("Parent name: " + super.name);
        System.out.println("Car name: " + this.name);
    }
}


public class ConstructorChaining3_SuperKeyword {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();  // Demonstrates method access
        myCar.displayName();  // Demonstrates field access
    }
}

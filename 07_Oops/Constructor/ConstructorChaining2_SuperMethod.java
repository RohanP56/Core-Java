class Vehicle {
    int wheels;

    // Constructor of the Vehicle class
    public Vehicle(int wheels) {
        this.wheels = wheels;
        System.out.println("Vehicle with " + wheels + " wheels created.");
    }
}

class Car extends Vehicle {
    String model;

    // Constructor of the Car class
    public Car(String model) {
        super(4);  // Explicit call to the superclass constructor
        this.model = model;
        System.out.println("Car model " + model + " created.");
    }
}

public class ConstructorChaining2_SuperMethod {
    public static void main(String[] args) {
        Car myCar = new Car("Tesla Model S");  // This will invoke the Car constructor
    }
}
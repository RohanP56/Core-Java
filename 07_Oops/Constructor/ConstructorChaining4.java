class Vehicle {
    String type;

    // Constructor of Vehicle class
    public Vehicle(String type) {
        this.type = type;
        System.out.println("Vehicle constructor: A " + type + " is created.");
    }
}

class Car extends Vehicle {
    String model;

    // Primary constructor of Car class
    public Car(String type, String model) {
        super(type);  // Calls Vehicle's constructor
        this.model = model;
        System.out.println("Car constructor: Model " + model + " is created.");
    }

    // Secondary constructor of Car class
    public Car(String model) {
        this("Car", model);  // Chains to primary constructor
    }
}

public class ConstructorChaining4 {
    public static void main(String[] args) {
        Car myCar = new Car("Sedan");  // Creating an instance of Car
    }
}
/*
 * Inheritance is when properties & methods of base class are passed on to a derived class.
 * basically properties will copy from one generation to another
*/

//Base class or parent class
class Vehicle {
    int wheels = 4;
    public void startEngine() {
        System.out.println("Engine started");
    }
}

//Derived class or child class or subclass
class Car extends Vehicle {   //extends is a keyword which copies all properties of base class into the deriveds class
    String carType = "Sedan";
    public void openTrunk() {
   }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.startEngine();  // Inherited method
        myCar.openTrunk();    // Class specific method
        System.out.println("Car type: " + myCar.carType + " with " + myCar.wheels + " wheels.");
    }
}

class Vehicle {
    String make;
    String model;
    int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}

class Car extends Vehicle {
    int seatingCapacity;

    public Car(String make, String model, int year, int seatingCapacity) {
        super(make, model, year);
        this.seatingCapacity = seatingCapacity;
    }

    public void displayDetails() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Manufacturing Year: " + year);
        System.out.println("Seating Capacity: " + seatingCapacity);
    }
}

class Truck extends Vehicle {
    double payloadCapacity;

    public Truck(String make, String model, int year, double payloadCapacity) {
        super(make, model, year);
        this.payloadCapacity = payloadCapacity;
    }

    public void displayDetails() {
        System.out.println("Truck Make: " + make);
        System.out.println("Truck Model: " + model);
        System.out.println("Manufacturing Year: " + year);
        System.out.println("Payload Capacity: " + payloadCapacity + " tons");
    }
}

public class ImplicitSuperCall {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", 2021, 5);
        Truck myTruck = new Truck("Ford", "F-150", 2019, 1.2);

        myCar.displayDetails();
        myTruck.displayDetails();
    }
}
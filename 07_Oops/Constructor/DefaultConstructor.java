class Bicycle {
    int gear;
    int speed;

    // No constructor is defined by the programmer.
}

public class DefaultConstructor {
    public static void main(String[] args) {
        Bicycle myBike = new Bicycle(); // Using the default constructor provided by Java
        System.out.println("Gear: " + myBike.gear + ", Speed: " + myBike.speed); // Outputs: Gear: 0, Speed: 0
    }
}
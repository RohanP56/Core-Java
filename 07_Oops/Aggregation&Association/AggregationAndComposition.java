//  OS class which will be (Composition Class)
class OS {
	String name;

	void osWork() {
		System.out.println("Os is working");
	}
}

// Charger Class Which will be (aggregation Class)
class Charger {
	String color;

	void charge() {
		System.out.println("Charge of color " + color + " is charging.");
	}
}

// Laptop class (Enclosing Class)
class Laptop {
	OS os = new OS(); // object of "OS" class

	// Creating a method to connect with "Charger", in this method we initialize the
	// charger color and also invoke the "charge" method
	void hasA(Charger ch) {
		ch.color = "black";
		ch.charge();
	}
}

public class AggregationAndComposition {
	public static void main(String[] args) {
		Laptop lap = new Laptop(); // Object of Laptop
		lap.os.name = "MacOS";
		System.out.println(lap.os.name);
		lap.os.osWork();

		Charger chr = new Charger(); // object of charger class
		lap.hasA(chr);

		chr.color = "White";
		chr.charge();

	}
}

/*
 * Laptop with OS --> Composition
 * 
 * Laptop with Charger ---> Aggregation
 */

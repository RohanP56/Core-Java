public class parameterizedConstructor {
    public static void main(String[] args) {
        Human h1 = new Human(56, "John Wick", 6.2); // Creating a Human Object (h1)
        Human h2 = new Human(21, "Ghost Zen", 5.6); // Creating another human object(h2)
        System.out.println(h1.name + " is " + h1.age + " years old" + "and height is = " + h1.height); // here we are passsing parameters so we dont have to give ()
    }

}

class Human {
    public String name;
    public int age;
    double height;

    // This Constructor take three values
    Human(int a, String Name, double ht) {
        this.age = a;
        this.name = Name;
        this.height = ht;
    }

    // Creating a constructor --> Constructor is like a method but it don't return
    // any values

}
// A class has another class inside

class A {

    int age; // variable

    public void show() { // method
        System.out.println("In show");
    }

    class B { // B is a inner class of 'A'

        public void config() { // method of b class
            System.out.println("This is Config");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        // A's object creation
        A obj = new A();
        obj.show();

        // B's object creation
        A.B obj1 = obj.new B(); // we ahave to write(A.B) because B is not available openly 'B' is a part of 'A'
                                // also when we declare object we have to write A's Object.new B()

        // A.B obj1 = new A.B(); -----> this will work whenwe declare the class"B"
        // (inner class)as static

        obj1.config();

    }
}

/*
 * if a class is tottally dependent on another class then we declare the class
 * in side class
 * 
 * Here class"B" is totally dependent on class"A" so we declare class"B" inside
 * class"A"
 */
//UPCASTING: It is the process of converting a subclass reference to a superclass reference.

class Parent {
    void display1() {
        System.out.println("Inside parent dispaly 1");
    }

    void display2() {
        System.out.println("Inside parent dispaly 2");
    }
}

class Child extends Parent {
    @Override  //Annotation
    void display2() {
        System.out.println("Inside child dispaly 2");
    }
}

public class UpcastingInInheritance {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();

        p.display2();
        c.display1();
        c.display2();

        System.out.println("\n\n************************UPCASTING********************\n\n");

        // UPCASTING: It is the process of converting a subclass reference to a super class reference.
        // Parent p = new Child();
        p = c; 
        p.display1(); // parent class method because there only one "display1()" in parent class, so that one will be called
        p.display2(); // this will call child class method

    }

}

/*Inheritance is when properties & methods of base class are passed on to a derived class.
 * 
 * basically properties will copy from one generation to another
 */

public class inheritance {
    public static void main(String[] args) {
        Fish hilsa = new Fish();
        hilsa.eat();
        hilsa.swim();
    }
    
}

//Base class or parent class
class Animal{
    String colour;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }

}
//Derived class or child class or subclass
class Fish extends Animal{                 //extends is a keyword which copies all properties of base class into the deriveds class
    int Fins;
    void swim(){
        System.out.println("Can swim in water");
    }

}

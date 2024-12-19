public class abstract_class {
    public static void main(String[] args) {
        // Animal -> Horse -> Mustang
        Horse h = new Horse(); //creating a object
        Chicken c = new Chicken();
        Mustang myhorse = new Mustang();
        //Human hu = new Human();  ---->> Abstract class
        //Aanimal a = new Animal();  we can't create animal named object because we can't create abstact class object
        h.eat();
        h.walk();
        c.eat();
        c.walk();
        System.out.println(h.colour);
    }
    
}
//parent class
abstract class Animal{     //we can create abstract class just wite (abstract) keyword in starting
    String colour;

    //creating a constructor
    Animal(){
       System.out.println("Animal constructor called");
    }

    //Non-abstract Method
    void eat(){
        System.out.println("Animal Eats");
    }

    //Abstrcat Method
    abstract void walk();   //This is a abstract method because theres is no implimentation
}

//child class
class Horse extends Animal{
    //Constructore
    Horse(){
        System.out.println("Horse constructor called");
    }
    void walk(){                                    //but here the implimentation of walk method is mandetory
        System.out.println("Walks on 4 legs");  
    }
}

abstract class Human extends Animal{     //here i wouldn't using the abstract method so i have declare the class as abstract class
    Human(){
        System.out.println("can speak");
    }
}

//child class
class Chicken extends Animal{
    //Constructore
    Chicken(){
        System.out.println("Chicken constructor called");
    }
    void walk(){                                    //but here the implimentation of walk method is mandetory
        System.out.println("Walks on 2 legs");  
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}


/*
if i create a  abstract method in parent class then i have to impliment it in base class or i have to declare  the child class as abstract class || if there's  2 abstract class then i have to use both

Cannot create create an instance of abstract class
Can have abstractlnon-abstract methods
Can have constructors
Abstract methods cannot be overridden by a concrete subclass


if there's a constructor both Animal and Horse class then 1st will be call Animal class constructor then Horse class constructor */
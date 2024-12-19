abstract class Car{

    public abstract void drive();   //abstract method
    public abstract void fly();   //abstract method

    public void playMusic(){                      //concrete method
        System.out.println("Music plays...");
    }
}

abstract class BMW extends Car{                 //here we are not using another abs.. method (fly) so we have to declare this class as abstract class
    public void drive(){
        System.out.println("Driving....");
    }
}

class Marcedes extends Car{           //.....Though it's a concrete class so we have to use both abstract method
    public void fly(){
        System.out.println("Can fly....");
    }
    public void drive(){
        System.out.println("Can Drive....");
    }
}

public class Abstraction_New {
    public static void main(String[] args) { 

        Car c = new Marcedes();     //we can't creat object of abstract class
        c.playMusic();
        c.drive();
        c.fly();

    }
    
}


/*
* can't create object of abstract class.

* abstract method can only use inside abstract class.

* if we extending a abstract calss then we have to use all the abstract methods compulsory either if we don't use all abstract methods then we have to declare that class also a abstrct class. 

* it's not compulsory to have a abstract method inside abstract class
 */
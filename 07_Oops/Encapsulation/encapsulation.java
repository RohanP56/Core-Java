package Encapsulation;
//Encapsulation is defined as the wrapping up of data & methods under a single unit. It also implements data hiding.

public class encapsulation {
    public static void main(String[] args) {
        Human h1 = new Human();
        /*h1.name = "Rohan";
        h1.age = 11;
        
        Since these are private variable these are not accessable from this class, if we want to access them wehave to go the same class*/
        System.out.println(h1.getName() + " is "+h1.getAge()+" years old");
        
    }
    
}
class Human{
    private int age = 56;
    private String name  = "John Wick";
    
    //Creating a Method which will return the age
    public int getAge(){
        return age;
    }
    //Creating a Method which will return the name
    String getName(){  //if we does not write any thing this will be public by default
        return name;
    }
}

/*Encapsulation Encapsulation is a way to restrict the direct access to some components of an object,
 so users cannot access state values for all of the variables of a particular object*/
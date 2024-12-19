interface A{

    int age = 44;            // final and static
    String area = "Bombay";
    public abstract void show();
    void config();   //by default every method in the interface is public and abstract, so don't need to mention every time

}



class B implements A{

    public void show(){
        System.out.println("let's begin the show.... ");
    }
    public void config(){
        System.out.println("Configuration done.... ");
    }
}


interface X {

    public void run();
    
}

interface Y extends X {   //interface extends another interface

    void run();
}


public class Interface_New {
    public static void main(String[] args) {
        //A obj = new A();  can't create object of interface
        A obj = new B(); 
        obj.show();
        obj.config();

        System.out.println(A.age);   //as they are static variable so don't need to create object
        System.out.println(A.area);
    }
    
}

/*
 * When we have abstract class with only abstract method, then we use interface.
 
 * by default every method in the interface is public and abstract, so don't need to mention every time.
  
 * We can't create object of it.
 
 * similar like abstract class when we implement any interface the we have to use all of it's methods.(because here all methods are abstract)
 
 * All the variable inside the interface are final and static. these are final because interface has no memory in heap thats why these are final.
 
 * A class can implement multiple interface. 
 
 * A interface can extends another interface 
  
 * class --> class = extends
  
 * interface ---> interface = extends
  
 * interface --> class = implements
 
 */
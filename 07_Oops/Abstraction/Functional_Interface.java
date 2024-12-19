
@FunctionalInterface
interface A{
    void call();
    //void ringtone();  for the annotation that will throws error
} 


class B implements A{
    public void call(){
        System.out.println("calling...");
    }
}


public class Functional_Interface {
    public static void main(String[] args) {
        B obj = new B();
        obj.call();
    }
    
}


/*Functional Interface is that interface where only one Method is present */

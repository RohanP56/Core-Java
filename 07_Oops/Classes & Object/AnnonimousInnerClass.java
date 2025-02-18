
class A{
    public void show(){
    System.out.println("In A show");    //Method
    }
}
    
public class AnnonimousInnerClass
 {
    public static void main(String[] args)
     {
        A obj = new A()

        //Creating a Anonymous class  here we don't use a name for this class
        {
        public void show()
        {
            System.out.println("In a new Show");  //creating a method, inside anonymous
        }
    };
        obj.show();
    
    }
    
}


//In Abstract class we can't cteate object, but using abstract class we can solve it
    

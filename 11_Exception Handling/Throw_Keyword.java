//This is use when we define our custom exception
import java.util.*;

class NegativeRadiusException extends Exception{   // this class will extends exception
    
    public String toString(){
        return "Radius can't be negative";
    }
}

public class Throw_Keyword {
    public static double area(int r) throws NegativeRadiusException{
        if(r<0){
           throw new NegativeRadiusException();
        }
        double a = Math.PI * r * r;
        return a;
    }
    public static void main(String[] args) {
        try {
            double ar = area(6);
            System.out.println(ar);
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}



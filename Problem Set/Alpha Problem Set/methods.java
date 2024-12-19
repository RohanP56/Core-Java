import java.util.*;
public class methods {  
    //print function                        
    public static void printHW(){
        System.out.println("Hello World!");
    }
    //sum function
    public static int sum(int a, int b){     
        int c = a+b;
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printHW();
        System.out.print("Enter the value of a = ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b = ");
        int b = sc.nextInt();
        //this to value will be copied and give to the sum function as parameters
        System.out.print("The sum is = "+sum(a,b));
        
    }
    
}

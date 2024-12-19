//Print product of given number using methods
import java.util.Scanner;
public class product {
    static int prod(int a, int b){
        int mult = a*b;
        return mult;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st integer = ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd integer = ");
        int b = sc.nextInt();
        System.out.print("The answer is = "+prod(a,b));

    }
    
}

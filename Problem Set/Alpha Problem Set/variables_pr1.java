//in a program,input3numbers:A,B and C.You have to output the average of these 3 numbers
import java.util.Scanner;

public class variables_pr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a = ");
        float a = sc.nextFloat();
        System.out.println("Enter the value of b = ");
        float b = sc.nextFloat();
        System.out.println("Enter the value of c = ");
        float c = sc.nextFloat();
        float avg = (a+b+c)/3;
        System.out.println("The avarage of given three numbers are = "+avg);        
    }
    
}

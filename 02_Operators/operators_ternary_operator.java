import java.util.Scanner;

public class operators_ternary_operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int num = sc.nextInt();
        String type = ((num%2) ==0) ? "even" : "odd" ;
        System.out.println("The number is "+type);
    }
    
}

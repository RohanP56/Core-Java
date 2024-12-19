import java.util.*;
public class factorial_of_numbers {
    static int factorial(int num){
        int fact = 1;
       for(int i=1; i<=num;i++){
            fact = fact*i;
       }
       return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = sc.nextInt();
        System.out.printf("The factorial of %d is = %d", num, factorial(num));
    }
    
}

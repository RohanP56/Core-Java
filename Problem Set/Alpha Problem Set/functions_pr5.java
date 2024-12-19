import java.util.*;
public class functions_pr5 {
    static int sumOfDigit(int num){
        int sum = 0;
        while(num != 0){
            int rem = num%10;
            sum = sum+rem;
            num = num/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int num  = sc.nextInt();
        System.out.println("The sum of given integer digit is  = "+sumOfDigit(num));
    }
    
}

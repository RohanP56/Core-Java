//here we will enter a number, we have to calaculate sum of all digits
import java.util.*;
public class sum_of_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter : ");
        int n = sc.nextInt();
        System.out.println(sumOfDigit(n));
    }
    public static int sumOfDigit(int n) {
        if(n == 0){
            return 0;
        }
        int rem = n%10;
        n = n/10;
        int k = rem + sumOfDigit(n);
        return k;
    }
    
}

/*
    input = 5596;
    output = (5+5+9+6 = 25)

 */
//sum of n natural number
import java.util.Scanner;

public class while_ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n = ");
        int n = sc.nextInt();
        int i = 0;
        int sum = 0;
        while(i<=n){
            sum +=i;
            i++;
        }
        System.out.println("The value of sum is = "+sum);
    }
    
}

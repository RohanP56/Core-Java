//Sum of n even numbers using while loop
import java.util.Scanner;

public class ch5_pr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the iteration : ");
        int n = sc.nextInt();
        int i=0;
        int sum = 0;
        while(i<n){
            System.out.println(2*i);
            sum = sum+(i*2);
            i++;
          
        }
        
        System.out.print("The sum is = ");
        System.out.println(sum);
    }
    
}

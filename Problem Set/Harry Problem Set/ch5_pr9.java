//Sum of all numbers of a multiplication table
import java.util.Scanner;

public class ch5_pr9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=10;i++){
            //System.out.printf("%d X %d = %d\n", n, i, (n*i));  //This will print the multiplication Taxble
            sum = sum+(n*i);   //Addition of elements in multiplication Table
        }
        System.out.println("The sum is = "+sum);

    }
    
}

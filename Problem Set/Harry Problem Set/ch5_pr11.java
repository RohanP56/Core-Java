import java.util.Scanner;

//Sum of n even numbers using for loop
public class ch5_pr11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the iteration = ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0;i<n;i++){
            System.out.println(i*2);
           sum = sum+(i*2);
        }
        System.out.println("The addition of n even number is = "+sum);
    }
    
}

import java.util.Scanner;

public class loops_pr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number = ");
        int num = sc.nextInt();
        int fact = 1;
        for(int i = 1;i<=num;i++){
            fact *=i;
        }
        System.out.printf("The factorial of %d is %d",num,fact);
    }
    
}

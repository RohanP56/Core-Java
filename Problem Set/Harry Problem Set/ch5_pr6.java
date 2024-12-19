import java.util.Scanner;

//factorial using while loop
public class ch5_pr6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        int fact = 1; 
        int i= 1;
        while(i<=n){
            fact*=i;
            i++;
        }
        System.out.println("The answer is = "+fact);
    }
    
}

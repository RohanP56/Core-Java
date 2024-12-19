//Multiplication table


import java.util.Scanner;
public class ch5_pr4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number which you want to multiplicate of : ");
        int n = sc.nextInt();
        for(int i=10;i>0;i--){
            System.out.printf("%d X %d = %d\n", n, i, (n*i));
        }
        
    }
    
}

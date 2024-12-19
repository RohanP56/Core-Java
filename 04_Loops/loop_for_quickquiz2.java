import java.util.Scanner;

// Write a program to print first n odd numbers using for loop in reverse order
public class loop_for_quickquiz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the term of natural number : ");
        int n = sc.nextInt();
        for(int i = n; i>=0; i--){
            System.out.println(2*i+1);  //it print odd number of given number
        }
    }
    
}
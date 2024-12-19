//Reverse the number

import java.util.Scanner;

public class pr_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = sc.nextInt();
        int rev = 0;


        while(num>0){
           int rem = num % 10;
            rev = (rev*10)+rem;
            num = num/10;   //new number 
        }
        System.out.println("The reverse number is = "+rev);
    }
    
}
  
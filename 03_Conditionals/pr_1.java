// found the occurence of 3 in given number (5435232334737)

//  (num%10 = return the last digit)

import java.util.Scanner;

public class pr_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = sc.nextInt();
        //int num = 1236539;
        int count = 0;

        while(num>0){
           int rem = num % 10;
            if (rem == 3){
                count++;
            }
            num = num/10;   //new number 
        }
        System.out.println("The occouence the 3 is "+count+" times");
    }
}

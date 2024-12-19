//reverse of a number

import java.util.Scanner;
public class Palindrome_Number {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number  = ");
        int num = sc.nextInt();
        int rev = 0;   //assume reverse will be start from 0
        while(num>0){
            int lastDig = (num%10);   //last digit
            rev = (rev*10)+lastDig;
            num = num/10;
        }
        System.out.println("Reverse of the given number is = "+rev);
        
    }
    
}

/* 
rev = (rev*10)+lastdigit

if we need last digit of any number (number%10);

if we want to remove last digit of any number(number/10)
 */
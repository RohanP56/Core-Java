//Keep entering numbers till user enters a multiple of 10

import java.util.Scanner;

public class break_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        do{
            System.out.print("Enter your number = ");
            int n = sc.nextInt();
            if(n%10 ==0){
                System.out.println("This numbere is divisible by 10 and programm terminated");
                break;
            }
            System.out.println("The number is not divisible by 10");
        }while(true);  //this is a infine loop work unntil the user give the multiplicant of 10
    }
    
}

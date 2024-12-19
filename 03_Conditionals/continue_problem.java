import java.util.Scanner;

public class continue_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        do{
            System.out.print("Enter your number = ");
            int n = sc.nextInt();
            if(n%10 ==0){
                System.out.println("This numbere is multiplicant of 10 and programm terminated");
                continue;
            }
            System.out.println("The number is not not multiplicant of 10 and given number is = "+n);
        }while(true);  //this is a infine loop work unntil the user give the multiplicant of 10
        
    }
    
}


//Display all numbers entered by user except multiples of 10
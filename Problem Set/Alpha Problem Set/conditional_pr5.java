import java.util.Scanner;

public class conditional_pr5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the year = ");
        int y = sc.nextInt();
        if((y%4==0) && (y/400==0) || (y%100!=0)){
            System.out.println("This is leap-year");
        }
        else{
            System.out.println("This is not leap-year");
        }

    }
    
}

//reverse the given number
import java.util.Scanner;

public class rev_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int num  = sc.nextInt();
        while(num>0){
            int ld = (num%10);    //ld = last digit
            System.out.print(ld+" ");
            num = num/10;  //this will remove the last digit

        }

    }
    
}

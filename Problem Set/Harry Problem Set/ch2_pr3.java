import java.util.Scanner;

//cheak a user input number is = given number or not

public class ch2_pr3 {
    public static void main(String[] args) {
        //Let 64 is a given number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number = ");
        int num = sc.nextInt();
        System.out.println(num<=64);
    }
}

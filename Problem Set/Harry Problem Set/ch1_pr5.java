import java.util.Scanner;

//cheak whether a number is integer or not

public class ch1_pr5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a integer number = ");

        //if the number is integer it will print 'true' or print 'false'
        System.out.println(s.hasNextInt());

    }
}

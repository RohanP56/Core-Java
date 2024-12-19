//sum of three numbers
import java.util.Scanner;

public class ch1_pr1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the 1st number = ");
        float b = a.nextFloat();
        System.out.print("Enter the 2nd number = ");
        float c = a.nextFloat();
        System.out.print("Enter the 3rd number = ");
        float d = a.nextFloat();

        float ans = b+c+d;
        System.out.println("The sum of three number is = "+ans);

    }
}

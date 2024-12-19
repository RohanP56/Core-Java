import java.util.Scanner;

//convert KG to G

public class ch1_pr4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the weight in Kilogram = ");
        float kg = s.nextFloat();
        float g = 1000*kg;
        System.out.println("Your given weight in Gram is = "+g + " gram");

    }
}

//Binary to decimal coversion
import java.util.*;
public class binary_to_decimal {
    public static void binToDec(int binary){
        int k = binary;   //we have to initialize this as another variable to print it because it will be decreseing, when the loop will startes running
        int pow = 0;
        int decimal = 0;
        while(binary>0){
            int lastdigit = (binary%10);
            decimal = decimal + (lastdigit * (int)Math.pow(2, pow));   //we have to convert into int because (math.pow) returns double
            pow++;   //power have to increase by 1 every time
            binary = binary/10;    //Binary will be decrease every time (means : it will reduce it's last digit)

        }
        System.out.println("Decimal of binary "+k+" is = "+decimal);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number in Binary = ");
        int num = sc.nextInt();
        binToDec(num);
    }
    
}

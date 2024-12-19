//Decimal to Binary Conversion

import java.util.*;
public class decimal_to_binary {
    public static void decToBin(int decimal){
        int k = decimal;   //we have to initialize this as another variable to print it because it will be decreseing, when the loop will startes running
        int pow = 0;
        int binary = 0;
        while(decimal>0){
            int rem = (decimal%2);  //remainder
            binary = binary + (rem * (int)Math.pow(10, pow));   //we have to convert into int because (math.pow) returns double
            pow++;   //power have to increase by 1 every time
            decimal = decimal/2;    //Binary will be decrease every time (means : it will reduce it's last digit)

        }
        System.out.println("Binary of Decimal "+k+" is = "+binary);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number in Decimal = ");
        int num = sc.nextInt();
        decToBin(num);
        
    }
    
}

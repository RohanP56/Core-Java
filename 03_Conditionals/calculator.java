import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number = ");
        float num1 = sc.nextFloat();
        System.out.print("Enter 2nd number = ");
        float num2 = sc.nextFloat();
        System.out.print("Enter your operator = ");
        char ch = sc.next().charAt(0);
        switch(ch){
            case '+': System.out.println("\n\nAddition of the numbers is = "+(num1+num2));
            break;
            case '-': System.out.println("\n\nSubstruction of the numbers is = "+(num1-num2));
            break;
            case '*': System.out.println("\n\nMultiplication of the numbers is = "+(num1*num2));
            break;
            case '/': System.out.println("\n\nDivison of the numbers is = "+(num1/num2));
            break;
            case '%': System.out.println("\n\nRemainder between the numbers is = "+(num1%num2));
            break;
            default:System.out.println("\n\nInput is wrong");
        }
    }
    
}

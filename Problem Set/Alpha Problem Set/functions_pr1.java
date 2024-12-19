import java.util.*;
public class functions_pr1 {
    public static float sum(float a, float b, float c){
        float d = (a+b+c)/3;
        return d;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        float a = sc.nextFloat();
        System.out.print("Enter 2nd number : ");
        float b = sc.nextFloat();
        System.out.print("Enter 3rd number : ");
        float c = sc.nextFloat();
        System.out.print("The avarage of these number is = "+sum(a, b, c));
        
    }
    
}

import java.util.*;
public class functions_pr2 {
    public static boolean even(int num){
        if(num%2 == 0){
            return true;   //if the number is "even"
        }
        else{
            return false;    //if the number is "false"
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number = ");
        int num = sc.nextInt();
        System.out.println(even(num));
    }
    
}

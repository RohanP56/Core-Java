//have to figure-out max number  ---> between 10, 20, 30
import java.util.*;
public class pr_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a = ");
        int a = sc.nextInt();
        System.out.println("Input b = ");
        int b = sc.nextInt();
        System.out.println("Input c = ");
        int c = sc.nextInt();
        /*int max = 0;
        if(a>=max){
            max = a;
        }
        if(b>=max){
            max = b;
        }
        if(c>=max){
            max = c;
        }*/

        int max = Math.max(c, Math.max(a, b));

        System.out.println("Max-number is = "+max);
    }
    
}

//Find nth fibonaaci number
import java.util.*;
public class fibonacci_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter nth term : ");
        int n = sc.nextInt();
        System.out.printf("The %dth fibonacci number : %d",n,fibo(n));

    }
    public static int fibo(int n) {
        //Basecase
        if(n==0 || n==1){           //if(n<2)
            return n;
        }
        int fnm1 = fibo(n-1);    //calculate fobonacci of (n-1)
        int fnm2 = fibo(n-2);    //calculate fobonacci of (n-2)
        int fn = fnm1+fnm2;    //calculate fobonacci of n
        return fn;                    //we can also write direct ---> return fibo(n-1)+ fibo(n-2);
    }
    
}

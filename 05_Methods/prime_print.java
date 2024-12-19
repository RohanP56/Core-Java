//in this program we have to print all prime numbers into given range
//this range will satarts from 2 and ends into given iteration
import java.util.*;
public class prime_print {
    public static boolean isPrime(int n){
        if (n == 2){
        return true;
        }
    for(int i=2; i<=Math.sqrt(n); i++){
        if (n % i ==0){
        return false;
        }
    }
    return true;
}

    public static void primesInRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){   //if true
                System.out.print(i+" ");
            }
        }
        System.out.println();
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range = ");
        int n = sc.nextInt();
        primesInRange(n);
        
    }
    
}

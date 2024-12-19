import java.util.*;
public class optimize_prime_number {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int n = sc.nextInt();
        System.out.println(isPrime(n));
    }
    
}
/*
It's an alternative approach to cheak prime numbers using loop here the loop will go from [2 to squre root(given number)]
 */
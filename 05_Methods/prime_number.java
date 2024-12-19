//If number is prime it will return 'true' else return 'false'
import java.util.*;
public class prime_number {
    //function to cheak prime number
    static boolean prime(int n){
        boolean prime = true;    //we assume that the given number is prime
        for(int i=2;i<n;i++){
            if(n%i==0){
                prime = false;  //if it became false then the number will be composite number
                break;
            }
        }
        return prime;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int n = sc.nextInt();
        System.out.println(prime(n));
    }
    
}
/*
It's an approach to cheak prime numbers using loop here the loop will go from [2 to (n-1)]
 */
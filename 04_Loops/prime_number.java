import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your number = ");
        int num = sc.nextInt();
        int temp =0;   //we take a 'temp' varriable = 0 for referrence
        for(int i=2; i<num; i++){
            if(num%i ==0){
                temp = temp+1;
        }   //braces of (if)
        
    }   //braces of (loop)

    if(temp>0){
        System.out.println("it's a prime number");
    }
    else{
        System.out.println("it's not a prime number");
    }    
}
}

//prime number 2, 3, 5, 7, 11

/*
 * composite number --- .
 */

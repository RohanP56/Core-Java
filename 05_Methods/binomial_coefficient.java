//Calculate binomial co-efficient
import java.util.*;
public class binomial_coefficient {
    static int binomial(int n, int r){
        int factN = 1;
        int factR= 1;
        int k = (n-r);
        int factK = 1;
        for(int i = 1;i<=n;i++){
            factN = i*factN;
        }
        for(int i = 1;i<=r;i++){
            factR = i*factR;
        }
        for(int i = 1;i<=k;i++){
            factK = i*factK;
        }
        int binoCE = (factN/(factR*factK));
        return binoCE;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n = ");
        int n = sc.nextInt();
        System.out.print("Enter r = ");
        int r = sc.nextInt();
        System.out.println("The binomial coefficient of given numbers is = "+binomial(n,r));

    }
    
}

/*
 Binomial coefficient (nCr) = 

                       n!
                    --------
                    r!(n-r)!

 here's another method to calculate binomial coefficient = 
 step 1 --> creat a function which returns factorial of a number 
 step 2 --> creat another function which calculate (n!, r!, (n-r)! using first function, and return the calculated form */




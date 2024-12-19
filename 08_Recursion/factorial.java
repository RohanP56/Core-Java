public class factorial {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(factorial(n));
    }
    public static int factorial(int n) {
        if(n==0){     //basecase
            return 1;
        }
        int fnm1 = factorial(n-1);          //fact(n-1) = (n-1)!      calculate the, factorial of (n-1)
        int fn = n*fnm1;                     //fact n = n*(n-1)!       calculate the, factorial of n  
        return fn;
    }
}
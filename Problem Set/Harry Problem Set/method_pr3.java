public class method_pr3 {

    static int sumRec(int n){
        if(n==1){
            return 1;
        }
        return n + sumRec(n-1);   //we know to sum of n natural number is ===  n+sum(n-1)

    }
    public static void main(String[] args) {
        int number = 6;
        System.out.println(sumRec(number));
        
    }
}

/*so, here we use recursion because when we use the sumRec method   ---- in return function, 
the sumRec called itself to calculate the value*/
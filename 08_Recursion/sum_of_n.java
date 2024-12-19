public class sum_of_n {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(sum(n));
    }
    public static int sum(int n) {
        if(n==1){                   //basecase
            return 1;
        }

        return n+sum(n-1);    //sum of n = n + sum of (n-1)
        /*int k = sum(n-1);         //sum of (n-1)
        int sumn = n + k;       //sum of n = n + sum of (n-1)
        return sumn; */
    }
    
}
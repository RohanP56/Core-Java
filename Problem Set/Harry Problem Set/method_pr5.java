public class method_pr5 {

    //fibonacci series ---> 0, 1, 1, 2, 3, 5, 8, 13, 21
    static int fibo(int n){
        if(n == 1){
            return 0;
        }
        else if(n == 2){
            return 1;
        }
        else{
            return fibo(n-1)+fibo(n-2);
        }
    }
    public static void main(String[] args) {
        int n = 5 ;
        System.out.println(fibo(n));
    }
    
}

/*  fibo n = fibo(n-1)+fibo(n-2) we can calculate the value of given fibonacci iteration by addding previous two values
 
 * This logic is implimented here
*/

public class friend_pair {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(pair(n));
    }

    public static int pair(int n) {
        
        if(n==1 || n==2){
            return n;
        }

        //choice single
        int fnm1 = pair(n-1); 
        //choice pair
        int fnm2 = pair(n-2);
        int pairways = (n-1) * fnm2;

        //total ways
        int totalways = fnm1 + pairways;
        return totalways;

        //return pair(n-1) + (n-1)*pair(n-2);    ---> can also write this single statement
    }
}

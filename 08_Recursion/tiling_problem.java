public class tiling_problem {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(countTails(n));
    }
    public static int countTails(int n) {      //floor size will be (2 x n)
        //base case
        if(n==0 || n==1){
            return 1;
        }
        //choices
        //Verticle choices
        int fnm1 = countTails(n-1);
        //Horaizontal choices
        int fnm2 = countTails(n-2);
        int totalWays = fnm1+fnm2;
        return totalWays;

    }
}

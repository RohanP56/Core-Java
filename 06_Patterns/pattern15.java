public class pattern15 {
    public static void pattern(int n){
        for(int i=n;i>=1;i--){
            //have to print spaces of (n-i)
            for(int j=1; j<=(n-i); j++){
               System.out.print(" ");
            }
            //have to print * of (2*i-1)
            for(int k=1;k<=(2*i)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }
}



/*

 *********
  *******
   *****
    ***
     *
 */
import java.util.Scanner;

public class pattern_7 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n = ");
        int n = sc.nextInt();
        diamond(n);
     
    }
    public static void diamond(int n) {
        //code for 1st-half
        for(int i=1;i<=n;i++){
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

        //code for 2nd-half
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
    
            
        }
    


/*

  *  
 *** 
*****
*****
 *** 
  *  

 */
import java.util.Scanner;

public class pattern_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of last line = ");
        int n = sc.nextInt();
        patt(n);
    }
    public static void patt(int n) {
        for(int row=1; row<2*n; row++){    //outer loop
            if(row<=n){
                for(int col=1; col<=row; col++){
                    System.out.print("* ");
                   
                }
                System.out.println();
            }
            else{
                for(int col=1; col<=2*n-row; col++){
                    System.out.print("* ");
                }
                System.out.println();
                
            }
        }
    }
    
}

/*

*
* *
* * *
* * * *
* * *
* *
*

So, for n there will be (2n-1) row, end each row have row no of column

 */
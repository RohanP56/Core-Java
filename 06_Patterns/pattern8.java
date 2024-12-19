import java.util.*;

public class pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of last line = ");
        int n = sc.nextInt();

        for(int i=1; i<(2*n); i++){
            if(i<=n){
                for(int j=1; j<=i; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }else{
                for(int j=1; j<=(2*n)-i; j++ ){
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
* * * * * 
* * * * 
* * * 
* * 
* 

 */
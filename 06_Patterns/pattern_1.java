import java.util.Scanner;

public class pattern_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of last line = ");
        int n = sc.nextInt();
        for(int i = 1; i<=n;i++){
            //print one line 
            for(int j= 1; j<=i;j++){     //it maintain the line / row value
                System.out.print("* ");   //have to use print not println  (it print the (*))
            }
            System.out.println();  //after print onrline will be go next line
        }
    }
    
}
/*


 * 
 * *
 * * *
 * * * *
 * * * * *

 */

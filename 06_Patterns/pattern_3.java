import java.util.Scanner;

public class pattern_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of last line = ");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){      //line will be incremented by this loop
            for(int j=1; j<=i;j++){
                System.out.print(j+" ");    // j is a counter, which will increase time by time  (Actually printing the column number)
            }
            System.out.println();
        }
        
    }
    
}
/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
 */

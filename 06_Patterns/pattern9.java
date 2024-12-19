//Hollow Rectangle

import java.util.*;
public class pattern9 {

    public static void hollow_rectangle(int row, int col){
        for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){
                //cell = (i.j)
                if(i==1 || i==row || j==1 || j==col){           //if bounday cell then print (*)
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        hollow_rectangle(row, col);
    }
    
}

/*

Hollow rectanle

****
*  *
*  *
*  *
****
 */
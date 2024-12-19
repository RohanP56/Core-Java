//Inverted and half rotated pyramid
import java.util.*; 
public class pattern10 {

    public static void inverted_half_rotated_pyramid(int n){
        for(int i=1; i<=n; i++){
            //printing spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //printing star
            for(int j=1;j<=i;j++){   //no of star should be equal number of line
                System.out.print("*");
            }
            System.out.println();
        }
       
    }
    public static void main(String[] args) {
        int n;
        inverted_half_rotated_pyramid(5);

    }
    
}
/*    

    *
   **
  ***
 ****
*****

 */
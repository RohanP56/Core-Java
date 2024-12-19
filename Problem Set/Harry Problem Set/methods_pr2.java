import java.util.Scanner;

public class methods_pr2 {
   static void pattern(int n){

        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){

            System.out.print("*");
        }
        System.out.println(" ");
    }

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a variable = ");
        int var = in.nextInt();
        pattern(var);
    
}
}

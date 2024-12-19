//write a method to creat multiplication table of n

import java.util.Scanner;
public class methods_pr1 {

    //method of multiplication table
    static void multable(int num){
        

        for(int i = 1; i<11;i++){
            System.out.printf("%d X %d = %d\n", num, i, (num*i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number which you want to multiplication table of = ");
        int number = sc.nextInt();
        multable(number);
    }
    
}

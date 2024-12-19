//Print all Armstrong numbers from (100 - 1000)

import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int num = sc.nextInt();
        System.out.println(isArmstrong(num));*/

        for(int i = 100;i<=1000; i++){
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }
    }
    
    static boolean isArmstrong(int num){
        int original = num;
        int sum = 0;
        while(num>0){
            int rem = num%10;
            sum = sum + (rem*rem*rem);
            num = num/10;
        }
        return sum == original;
    }
}

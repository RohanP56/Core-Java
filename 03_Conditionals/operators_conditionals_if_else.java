//if-else statement in java                                                                                                             
//in java if-else statement is same as C language

import java.util.Scanner;

public class operators_conditionals_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("You can Drive a car");
        }
        else{
            System.out.println("Yoy can't drive a car");
        }
    }
    
}

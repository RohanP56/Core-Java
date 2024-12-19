import java.util.Scanner;

public class operators_relationals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        //we can also use this method
        //here we have created a boolian veriable then put it under the if condition
        /*boolean condition = (age==18);
        if(condition){   
            System.out.println("You can Drive a car");
        }*/

        if(age==18){   // in java we have to use (==) operator we can't use (=) operator like C
            System.out.println("You can Drive a car");
        }
        else{
            System.out.println("Yoy can't drive a car");
        }
    }
    





        
    }
    
//we us ethe relational operator to compare to entity

/*equal(==), notequal(!=), Greater than equal(>=), Less than equal(<=), Greater then(>), less then(<) */
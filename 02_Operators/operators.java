/*7 + 11 = 18 here 7 and 11 is operand and (+) is a operator
Arithmetic Operators --> +, -, *, /, %, ++, -- 
Assignment Operators --> =, +=
Comparison Operator --> ==, >=, <=
Loigcal Operator ---> &&, ||, !
Bitwise Operator ---> &, |

 */

public class operators{
    public static void main(String[] args) {

        // Arithmetic operator  (These can't work with booleans)
        int a = 6 % 4;   
        System.out.println(a);     //Modulo operator
        double k = 4.8 % 1.1;
        System.out.println(k);

        //Assignment opeators
        int b = 9;
        b /= 3;      
        System.out.println(b);

        //Comparison operator
        System.out.println(6==8); 
        System.out.println(5==5);
        System.out.println(65>6); 
        System.out.println(69<=6);

        //logical operator
        System.out.println(65<5 && 68>9);  //in and operator if any 1 statement is false full statement will be false
        System.out.println(65<5 || 69>9);          //in or operator if any 1 statement is true full statement will be true

        //Bitwise Operators
        System.out.println(2&3);

        //10
        //11
     //--------- AND operation
        //10





    }
}
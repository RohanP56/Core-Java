public class type_promotion {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        System.out.println((int)b);  //typecast char (b) into equivalent integer
        System.out.println((int)a);   //typecast char (a) into equivalent integer
        System.out.println(b-a);  //this is valled type promotion
        //type promotion can be done with expressions

        //if we want to print the equivalent int. of (a) then we have to type castr it but for (b-a) we don't have to type cast this method called type promotion
    }
    
}


/*
NOTE --> 1. Java automatically promotes each byte, char, short operand to int when evaluteing an expression
2. if one operand is long, float or double the whole expression is promoted to long, float, double respectively.
 */

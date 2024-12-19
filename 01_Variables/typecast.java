import java.util.Scanner;

public class typecast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = 25.51f;
        // int b = a;  if we write like this it will throws an error to make this possible we have to make this changes

        //we have to write like this
        int b = (int) a;
        System.out.println(b);   // it typecast the float value into integer 
    }
    
}


//NOTE = it does not make round-off like maths it changes the number into previous interger

// if we take 25.99999 it will print 25   it besically smalls the value


// it's a explicit conversion
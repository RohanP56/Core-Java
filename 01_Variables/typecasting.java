import java.util.*;
public class typecasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = 125; 
        int b = 125; 
        int c = 44;
        byte d = (byte) (a+b+c);
        System.out.println("Answer is = "+d);


        int k = 'A';
        System.out.println("Value of k is = "+k);     //Automatic type conversion it returns ASCAI value of  "A"


    }
    
}

/*  Though byte can store upto 256
so after 256 it will return the remainder of the calculated value*/

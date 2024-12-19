import java.util.*;    //if we import (*) all classses will be imported automatically

public class input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);    //(System.in) = it means we take input from keyboard

        //Sum of integer numbers

        System.out.print("Enter number 1 = ");           //sout is for printing anything
        int a = s.nextInt();
        System.out.print("Enter number 2 = ");
        int b = s.nextInt();
        int add = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a/b;
        int rem = a%b;
        System.out.println("The addition of two number is = "+add);
        System.out.println("The substruction of two number is = "+sub);
        System.out.println("The multiplication of two number is = "+mul);
        System.out.println("The divison of two number is = "+div);
        System.out.println("The remainder of two number is = "+rem);

        // Sum of two floating point numbers

        System.out.println("Enter 1st float value = ");
        float m = s.nextFloat();
        System.out.println("Enter 2nd float value = ");
        float n = s.nextFloat();
        float k = m + n;
        System.out.println("The addion of m+n is = "+k);

        //Boolean Method   (usew to cheak validity of codes)

        System.out.println("Taking input from user = ");  // Takes input from user
        boolean b1 = s.hasNextInt();   // it's cheak either input is valid integer or not
        System.out.println(b1);

        //Taking string as an input

        System.out.print("Enter the word / sentence = ");
        //String str  = s.next();   //the .next method only print the 1st word of the string
        String str = s.nextLine();  // This will print the full sentence
        System.out.println("The given word is = "+str);

    }
}

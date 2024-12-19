import java.util.Scanner;

//we can also input strings from user

public class strings_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name = ");
        //String name = sc.next(); // This will print only 1st word 
        String name1 = sc.nextLine();   // This will print full sentence
        //System.out.println("Entered name is = "+name);
        System.out.println("Entered name is = "+name1);
    }
    
}

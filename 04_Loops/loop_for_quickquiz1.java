import java.util.Scanner;

// creat a program to print first n odd numbers using for loop
public class loop_for_quickquiz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the term of natural number : ");
        int n = sc.nextInt();
        for(int i = 0; i<=n; i++){
            /*if(i%2!=0){     it print the odd number between the given number
                System.out.println(i);
            }*/
            System.out.println(2*i+1);  //it print odd number of given number
        }
    }
    
}

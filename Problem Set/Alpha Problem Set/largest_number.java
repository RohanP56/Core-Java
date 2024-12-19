import java.util.Scanner;
public class largest_number {
    public static void main(String[] args) {
        System.out.println("\nEnter 2 numbers\n\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number = ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number = ");
        int b = sc.nextInt();
        if(a>b){
            System.out.println("The large number is = "+a);
        }
        else if(a==b){
            System.out.println("Both are same number");
        }
        else{
            System.out.println("The large number is = "+b);
        }
    }
    
}

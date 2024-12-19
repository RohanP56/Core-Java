import java.util.Scanner;

public class fibonacci_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth value = ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int temp;
        int count =2;
        while(count<=n){
            temp = b;      //this temp for the value of b will be changed in next value so the 'temp' will be stored the value of previous (b)
            b = b+a;
            a = temp;
            count ++;
        }
        System.out.println(b);
    }
    
}

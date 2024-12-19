//do-while loop quick quiz
import java.util.Scanner;

public class loop_do_while_quickquiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the term of natural number : ");
        int n = sc.nextInt();
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i<=n);

    }
    
}

import java.util.Scanner;
public class functions_pr3 {
    static boolean palindrome(int num){
        int rev, org;   //initialize reverse, remainder, original number
        org = num;
        rev = 0;

        //printing the reverse number
        while(org!=0){
            int rem = org%10;
            rev = (rev*10)+rem;           //to clear the concept alawys use a palindrome number as an example
            org = org/10;
        }
        if(num == rev){
           return true;
        }
        else{
           return false;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int num = sc.nextInt();
        if(palindrome(num)){
            System.out.println("The number "+num+" is palindrome");
        }
        else{
            System.out.println("The number "+num+" is not-palindrome");
        }
    }
    
}

import java.util.Scanner;

//encrypt a grade by adding 8 and also decrypt it

public class ch2_pr2 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter your Grade = ");
        //Encrypt the grade
        char grade = sc.next().charAt(0);  //use to input a character
        grade = (char) (grade + 8);//we ahave to initialize it as a character either it will show an error
       // System.out.println("Your grade is = "+grade);


        //decrypt the grade
        char new_grade = (char) (grade-8);
        System.out.println("Your grade is = "+new_grade);
    }
    
}

import java.util.Scanner;

//elseif clause
//we also called it else-if ladder  (if ----> else) complete one ladder

public class ifelse_statement {
    public static void main(String[] args) {
     Scanner sc  = new Scanner(System.in);
     System.out.print("Enter your age = ");
     int age = sc.nextInt();
    if(age>=65){
        System.out.println("You are uneligible!");
    }
    
    else if(age>=45){
        System.out.println("You are Experienced!");
     }
    else if(age>=35){
        System.out.println("You are semi-Experienced!");
    }
    else if(age>=25){
        System.out.println("You are intern!");
    }
    
    }
    
}
/*  It works this way --->
That if 1st condition is true then it print the statement, if false then move to second condition then 3rd......4th.....this way */

//if we want to cheak all statements then we have to use (if) in all cases
//percentage of 5 marks

import java.util.Scanner;

public class percentage_of_marks {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter 1st subject mark = ");
        float a = s.nextFloat();
        System.out.print("Enter 2nd subject mark = ");
        float b = s.nextFloat();
        System.out.print("Enter 3rd subject mark = ");
        float c = s.nextFloat();
        System.out.print("Enter 4th subject mark = ");
        float d = s.nextFloat();
        System.out.print("Enter 5th subject mark = ");
        float e = s.nextFloat();
        float Total_marks = a+b+c+d+e;      //Total marks
        float perc = Total_marks/500*100;   //percentage

        System.out.println("The percentage is = "+perc);


    }
}

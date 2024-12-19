import java.util.Scanner;

// find out a student is pass or fail, requirment total = 40% and each subject = 33% assume 3 subject

public class ch4_pr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of sub 1 : ");
        float sub1 = sc.nextFloat();
        System.out.print("Enter marks of sub 2 : ");
        float sub2 = sc.nextFloat();
        System.out.print("Enter marks of sub 3 : ");
        float sub3 = sc.nextFloat();
        float total_marks = (sub1 + sub2+sub3)/3;
        if(total_marks>=40 && sub1>=33 && sub2>=33 && sub3>=33){
            System.out.println("You have been promoted");
        }
        else{
            System.out.println("You have been not promoted");
        }
    }
    
}

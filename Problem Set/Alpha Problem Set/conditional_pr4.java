import java.util.Scanner;
public class conditional_pr4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the day number = ");
        int wn = sc.nextInt();
        switch(wn){
            case 1:System.out.println("Monday");
            break;
            case 2:System.out.println("Tuesday");
            break;
            case 3:System.out.println("Wednesday");
            break;
            case 4:System.out.println("Thursday");
            break;
            case 5:System.out.println("Friday");
            break;
            case 6:System.out.println("Saturday");
            break;
            case 7:System.out.println("Sunday");
            break;
            default:System.out.println("Error");
        }

    }
    
}

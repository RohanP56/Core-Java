import java.util.Scanner;

//write a priogram to cheak whether a year is leap-year or not
public class ch4_pr5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year, which you want to cheak : ");
        int year = sc.nextInt();
        if(year%100 != 0 && year%4 == 0 || year%400 == 0){
            System.out.println("This is leap-Year");
        }
        else{
            System.out.println("its not leap-Year");
        }
    }
    
}

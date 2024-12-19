import java.util.Scanner;

public class loops_pr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int choise;
        int evenSum = 0;
        int oddSum = 0;
        do{
            System.out.print("Enter the number = ");
            num = sc.nextInt();
            //even case -->
            if(num%2==0){
                evenSum +=1;
            }
            //odd case ---->
            else{
                oddSum+=1;
            }
            System.out.println("Do you want to add more numbers, if yes(1) if no (0) ");
            choise = sc.nextInt();

        }while(choise==1);
        System.out.println("Sum of even number = "+evenSum);
        System.out.println("Sum of 0dd number = "+oddSum);
    }
    
}

//hre we use do-while because do-while loop run 1st timw with out cheaking condition
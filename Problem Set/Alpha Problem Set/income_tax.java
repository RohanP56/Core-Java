import java.util.Scanner;
public class income_tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income = ");
        float in = sc.nextFloat();  //income
        /*float tax1 = in*(20/100);
        float tax2 = in*(30/100);*/

        if(in<500000){
            System.out.println("Your tax is = 0");
        }
        else if(in>=500000 && in<1000000){
            System.out.println("Your tax is = "+(in*0.2));
        }
        else if(in>1000000){
            System.out.println("Your tax is = "+(in*0.3));
        }

    }
    
}

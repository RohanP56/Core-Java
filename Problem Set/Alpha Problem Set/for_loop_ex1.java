import javax.swing.plaf.FontUIResource;

public class for_loop_ex1 {
    public static void main(String[] args) {

        int num = 56987;
        while(num>0){
            int ld = (num%10);    //ld = last digit
            System.out.print(ld);
            num = num/10;  //this will remove the last digit

        }
        
    }
    
}


/*
if we need last digit of any number (number%10);

if we want to remove last digit of any number(number/10)
 */
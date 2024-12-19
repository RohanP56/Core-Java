import java.util.Scanner;

public class variables_pr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of pencil = ");
        float pencil = sc.nextFloat();
        System.out.print("Enter the value of pen = ");
        float pen = sc.nextFloat();
        System.out.print("Enter the value of eraser = ");
        float eraser = sc.nextFloat();
        float tv = (pencil+pen+eraser);
        float GST = (tv/100)*18;
        System.out.println("The total value is = "+tv);
        System.out.println("The total value is (with 18 % GST) = "+(tv + GST));
    }
    
}

import java.util.Scanner;

// Logical Operator

public class operators_logical {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        if(age>=18 && age<=65){
            System.out.println("You can Drive a car");
        }
        else{
            System.out.println("Yoy can't drive a car");
    }  */
        boolean a = true;
        boolean b = false;
    //AND operation
        if(a && b){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    // OR operation
        if(a || b){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    //NOT operation
        System.out.println("NOT a is : "+!a);
        System.out.println("NOT b is : "+!b);


    }
}

/*
 logical operadtors

 && ---> AND  (Evalutes to true if both conditions are True)
 || ---> OR   (Evalutes to true when at least one condition is True)
 !  ---> NOT  (Neglect th egiven logic{True become False and False become True})
 */
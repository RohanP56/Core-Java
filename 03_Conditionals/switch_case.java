import java.util.*;
public class switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of a fruit = ");
        String fruit = sc.next();
        switch(fruit){
        case "Mango" ->  System.out.println("The king of fruits");
        case "Apple" ->  System.out.println("Big red fruit");
        case "Palm" ->  System.out.println("Big black ball");
        case "Pineapple" ->  System.out.println("sour fruit");
        default  -> System.out.println("Enter a valid fruit");
        }

    }
    
}

//We can also write the switch case this way 
import java.util.Scanner;

//we use it when we have to make choice


//we make a menu system using Switch case

public class operators_conditional_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 ---> Dal, rice, roti");
        System.out.println("2 --->rice, chicken, roti");
        System.out.println("3 --->Butter chicken, roti");
        System.out.println("4 --->rice,roti, dal, paneer, papad");
        System.out.print("Choose any one between 1, 2, 3, 4 : ");
        int menu = sc.nextInt();
        switch(menu){
            case 1:
            System.out.println("You Ordered --> Dal, rice, roti");
            System.out.println("Enjoy your meal :) ");
            break;  //it means end the program and out from it
            case 2:
            System.out.println("You Ordered --> rice, chicken, roti");
            System.out.println("Enjoy your meal :) ");
            break;
            case 3:
            System.out.println("You Ordered --> Butter chicken, roti");
            System.out.println("Enjoy your meal :) ");
            break;
            case 4:
            System.out.println("You Ordered --> rice,roti, dal, paneer, papad");
            System.out.println("Enjoy your meal :) ");
            break;
            default:  //it will print if no one case matched with given input
            System.out.println("error : 404! not found, wrong command");
        }
        
    }
    
}

//break = it means end the program and out from it

//default = it will print if no one case matched with given input

/*Theres a updated version of switched named ---> enhanced switch
syntax   here no need to use break

case 1 ->  System.out.println("Dal, rice, roti");
case 2 -> System.out.println("rice, chicken, roti");
case 3 -> System.out.println("Butter chicken, roti"); 
default ->  System.out.println("Enjoy your Meal");
*/
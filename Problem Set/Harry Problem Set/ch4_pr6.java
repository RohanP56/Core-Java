import java.util.Scanner;

//find th etype of website

public class ch4_pr6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the site : ");
        String site = sc.next();
        if(site.endsWith(".com")){
            System.out.println("This is a Commercial Website");
        }
        else if(site.endsWith(".org")){
            System.out.println("This is a Organizational Website");
        }
        else if(site.endsWith(".in")){
            System.out.println("This is a Indian Website");
        }




         
    }
    
}

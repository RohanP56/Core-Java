// Introduction to while loop
//if the condition never become false, the loop keeps getting executed
public class loop_while {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("Starting Loop");
        while(i<50){
        System.out.println(i);
        i++;
    }
        System.out.println("Finishing the loop");

        // infinite while loop
        while(true){  //java does not spport 1 so we have to give a boolean expression 
            System.out.println("a");
        }
    }
}
    


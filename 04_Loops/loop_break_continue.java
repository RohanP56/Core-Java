//Break and continue statement


public class loop_break_continue {
    public static void main(String[] args) {
//break statement


        
        //using for loop
        for(int i=0;i<=5;i++){
            System.out.print(i+1);
            System.out.println("> java is great\n");
            if(i==2){
                System.out.println("Ending loop");
                break;  // This statement encountered the loop here and send the control to outside the loop
            }
        }

        //using while loop
        /* 
        int i = 0;
        while(i<=5)
        {
            System.out.print(i+1);
            System.out.println("> java is great\n");
            if(i==2){
                System.out.println("Ending loop");
                break;  // This statement encountered the loop here and send the control to outside the loop
            }
            i++;
        }
        //using do-while loop
        do
        {
            System.out.print(i+1);
            System.out.println("> java is great\n");
            if(i==2){
                System.out.println("Ending loop");
                break;  // This statement encountered the loop here and send the control to outside the loop
            }
            i++;
        }while(i<=5);
        */


//continue statement

        //using for loop
        /*for(int i=0;i<=5;i++){
            if(i==2){
                System.out.println("Ending loop");
                continue;  // This statement is used to immedietly move the next iteration of loop
            }
            System.out.print(i);
            System.out.println("> java is great\n");
        }*/

        //using do-while loop
        int i = 0;
        /* 
        do
        {
            i++; //when it 1st time came here it will be 1, not 0
            if(i==2){
                System.out.println("Ending loop");
                continue;  // This statement encountered the loop here and send the control to outside the loop
            }
            System.out.print(i);
            System.out.println("> java is great\n");
        }while(i<5);*/

        //using while loop

        while(i<5)
        {
            i++; //when it 1st time came here it will be 1, not 0 bcoz of (i++)
            if(i==2){
                System.out.println("Ending loop");
                continue;  // This statement encountered the loop here and send the control to outside the loop
            }
            System.out.print(i);
            System.out.println("> java is great\n");
        }
    }
}
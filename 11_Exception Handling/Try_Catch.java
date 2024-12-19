

public class Try_Catch {
    public static void main(String[] args) {
        int [] arr = new int[5];      //by default all values are zero
        System.out.println(arr[0]);   
        /*System.out.println(arr[8]);    ----> index out of bound   so program will be terminated
        System.out.println("Hello guys");    ----> It will not execute*/

        
        try {
            System.out.println(5/0);
            System.out.println(arr[8]);
        } 
        //out of index
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of bound");
        }
        //Arithmetic error
        catch (ArithmeticException e) {
            System.out.println("Can't devided by 0");
        }

        /*try {
            System.out.println(5/0);
            System.out.println(arr[8]);
        } 
        //out of index
        catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Out of bound");
        }
        */



        System.out.println("Code completelt Excuted");
    }
}

/* if any exception not define we can write "RuntimeException"


try {
    System.out.println(5/0);
    System.out.println(arr[8]);
} 
    
catch(RntimeException e) {
    System.out.println("Out of bound");
}
    

*/

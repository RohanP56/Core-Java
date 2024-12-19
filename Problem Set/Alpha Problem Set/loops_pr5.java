public class loops_pr5 {
    public static void main(String[] args) {
        for(int i = 0; i<=5; i++){
            System.out.println("i = "+i);
        }  // ---> from this instance the program is right

        //after that the "i" is declare into the loop so the scope of "i" is limited to the loop only.
       // System.out.println("I after the loop = "+i);
    }
    
}

public class resulting_data_type {
    public static void main(String[] args) {
        char c = 'j';
        int i = 54;
        int result = c + i;
        System.out.println(result);
        // char + int = int

        //increment  and decrement operator
        int a = 93;
        //System.out.println(a++);  //here a will be same bcoz first print then increment
        //System.out.println(a);   //here a incremented by previous program
        System.out.println(++a);  //here a incremented by (+1)

        int b = 56;
        System.out.println(b--);   // here b will first printed then decremented
        int k = 89;
        System.out.println(--k);  //here c will be decremented then printed
        
        //we can also increment the character
        char d = 'b';
       d++;
       System.out.println(d);   //it will be c

    }
    
}

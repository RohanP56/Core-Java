public class reverse_number {
    public static void main(String[] args) {
        int n = 123;
        reverse(n);
    }
    public static void reverse(int n) {
        if(n<10){      //before 10 all numbers are ingle digit
            System.out.println(n);
            return;
        } 
        System.out.print(n%10);    //123%10 ---> 3 will be printed
        reverse(n/10);       //123/10 ---> 12
         
        
    }
    
}

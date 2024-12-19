public class shadowing {
    static int x = 55;        //global variable we can access it from any where
    public static void main(String[] args) {
        System.out.println(x);
        int x = 90;    
        System.out.println(x);   //90 will be printed here the previous value (55) will be shadowed
        fun();
    }

    static void fun(){
        System.out.println(x);      
    }
    
}


/*Inside any scope local variable gets more priority */
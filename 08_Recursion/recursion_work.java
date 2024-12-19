public class recursion_work {
    public static void main(String[] args) {
        int n = 1;
        print(n);  //function call
    }
    /* 
    public static void print1() {
        System.out.println("1");
        print2();
    }
    public static void print2() {
        System.out.println("2");
        print3();
    }
    public static void print3() {
        System.out.println("3");
        print4();
    }
    public static void print4() {
        System.out.println("4");
        print5();
    }
    public static void print5() {
        System.out.println("5");
    }  */

    public static void print(int n) {
        if(n==5){         //Basecase
            System.out.println(n);    //n=5 will be printed
            return;
        }

        System.out.println(n);
        print(n+1);   //function call itself for (n+1)  parameter
    }  


    
}
/*  recursion actually work ---> when a function call itself

if there no base case then throws an error, either stack will be overloaded
 */
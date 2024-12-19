public class Try_Catch_Finally {
    public static void main(String[] args) {
        try {
            System.out.println(5/5);
            System.out.println(5/0);   //error
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        //System.exit();
        finally{
            System.out.println("It will execute althoug theres a error or not");
        }
        System.out.println("All execution done");
    }
}

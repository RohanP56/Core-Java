public class methods_2 {
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Value of a is = "+a);
        System.out.println("Value of b is = "+b);
    }
    public static void main(String[] args) {
        int a = 56;
        int b = 47;
        swap(a,b);
        /* But if i want to print the value of a and b it will remain unchanged, because the value get swapped under the (swap) method
        not in main method*/

        System.out.println("Value of a is = "+a);
        System.out.println("Value of b is = "+b);

    }
    
}

public class WrapperClass {
    public static void main(String[] args) {
        int a = 10; // primitive data type

        Integer num = 45;// Integer num = new Integer(45) -----> now it's an object (wrapper class)
        final int A = 55; // after using (final) key word we can't update the value of variable, also
                          // remember while use final keyword variable name will be in capital, it work
                          // only when the declared variable is primitive data type.when a non-primitive
                          // is final we can’t reassigned.
        System.out.println(A);
        // int A = 66; this will throws an error
        System.out.println(A);
    }
}

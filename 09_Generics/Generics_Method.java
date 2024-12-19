public class Generics_Method {

    public static <E> void genericMethod(E data) {
        System.out.println(data);
    }
    public static void main(String[] args) {
        genericMethod("rohan");
        genericMethod(55);
        genericMethod("hdgd65478");
    }
}

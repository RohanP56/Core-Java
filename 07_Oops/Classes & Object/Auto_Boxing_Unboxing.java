
public class Auto_Boxing_Unboxing {
    public static void main(String[] args) {
        int num1 = 7;
        Integer num2 = num1;       //auto-boxing [premitive datatype wrap into wrapperclass]
        System.out.println(num2);

        int num3 = num2;              //auto-unboxing  [wrapper class wrap into premitive datatype]
        System.out.println(num3);

        String str = "12";
        int n = Integer.parseInt(str);   //this method same like ().toString)
        System.out.println(n*3);
    }
}

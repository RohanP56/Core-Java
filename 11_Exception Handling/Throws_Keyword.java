public class Throws_Keyword {

    public static int element(int []a) throws ArrayIndexOutOfBoundsException {
        return a[8];
    }

    public static void main(String[] args) {
        int [] a = new int [5];
        try {
            element(a);
        } catch (Exception e) {
            System.out.println("Error occur : "+e.toString());
        }
    }
    
}
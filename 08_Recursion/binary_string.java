public class binary_string {
    public static void main(String[] args) {
        int n = 3;
        int lastPlace = 0;
        String str = new String("");
       printBinStr(n, lastPlace, str);

    }
    public static void printBinStr(int n, int lastPlace, String str) {
        //basecase
        if(n==0){
            System.out.println(str);
            return;
        }
        printBinStr(n-1, 0, str+"0");
        if(lastPlace == 0){
        printBinStr(n-1, 1, str+"1");
    }

}
}
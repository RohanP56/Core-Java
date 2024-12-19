public class method_pr6 {
    static int sum1(int ...arr){
        int result = 0;
        for(int a:arr){
            result +=a;
        }
        return result;
    }
    public static void main(String[] args) {
       int k =  sum1(58, 65, 74, 23);
        System.out.println(k);
    }
    
}

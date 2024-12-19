//There will be a given number we have to count the number of (0) present

public class count_zeros {
    public static void main(String[] args) {
        int n = 1023003;
        System.out.println(count(n));
    }
    public static int count(int n) {
        if(n==0){
            return 1;
        }
        else if(n<10){
            return 0;
        }
        else if(n%10 == 0){
            return 1+count(n/10);
        }
        return count(n/10);
        
    
    }
    
}

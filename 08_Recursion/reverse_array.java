import java.util.*;
public class reverse_array {
    public static void main(String[] args) {
        int [] arr = {5, 8, 3, 4, 7};
        int st = 0;
        int ed = arr.length-1;
       System.out.println(Arrays.toString(revArr(arr, st, ed)));
    }
    public static int[] revArr(int[] arr, int st, int ed) {
        //basecase
        if(st>=ed){
            return arr;
        }

        //recursion
        int temp = arr[st];
        arr[st] = arr[ed];
        arr[ed] = temp;
        return revArr(arr, st+1, ed-1);
        
    }
    
}

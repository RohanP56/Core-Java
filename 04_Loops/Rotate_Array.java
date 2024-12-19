import java.util.*;

public class Rotate_Array {
    public static void main(String[] args) {
        int [] nums = {1, 2 , 3 , 4 , 5, 6, 7}; 
        int k = 3;
        int start = 0;
        int end = nums.length-1;
        rotate(nums, k);
    }
    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length-1);   //reverse the whole array
        reverse(nums, 0, k-1);   //reverse upto k th posotion
        reverse(nums, k, nums.length-1);   //reverse remaining array
        System.out.println(Arrays.toString(nums));
    }
    public static void reverse(int [] nums, int start, int end){     //code for reverse the array
        while(start<end){
            int temp = nums[start];
            nums [start] = nums [end];
            nums [end] = temp;
            start ++;
            end --;
        }
    }
}

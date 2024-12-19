//cheak the last occurance of a given number in the array
public class last_occurance {
    public static void main(String[] args) {
        int [] arr = {12, 65, 4, 59, 44, 78, 32, 45, 65, 85};
        int i = arr.length-1;   
        int key = 12;
        System.out.println(cheak(arr, i, key));
    }
    public static int cheak(int [] arr, int i, int key) {
        //basecase   --> when all element have been cheaked
        if(i==arr.length){
            return -1; 
        }
        if(arr[i]==key){
            return i; 
        }

        return cheak(arr, i-1, key);
    }
    }

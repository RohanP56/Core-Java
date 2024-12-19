//Binary search using recursion
public class binary_search {
    public static void main(String[] args) {
        int [] arr = {2, 4, 9, 15, 25, 45, 56, 69, 77};
        int target = 02;
        int st = 0;             //initializing start
        int ed = arr.length-1;      //initializing end
        System.out.println(binSer(arr, target, st, ed));
    }

    public static int binSer(int [] arr, int target, int st, int ed) {
        int mid = (st+ed)/2; //calculating mid;

        if(st>ed){
            return -1;
        }  
        //if target = mid
        else if(arr[mid] == target){
            return mid;
        } 
        // target>mid (right shift)
        else if(arr[mid]<target){
            return binSer(arr, target, mid+1, ed);
        }
        // target<mid (left shift)
        else{
            return binSer(arr, target, st, mid-1);
        }
    }
    
}

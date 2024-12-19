//Linear search using recursion
public class linear_search {
    public static void main(String[] args) {
        int [] arr = {5, 12, 84, 65, 35, 88};
        int target = 88;
        int index = 0;
        System.out.println(linSer(arr, target, index));
    }
    public static int linSer(int [] arr, int target, int index) {
        //Basecase
        if(index == arr.length){     //element not found (index is at end of the array)
            return -1;
        }
        if(target == arr[index]){
            return index;
        }
        return linSer(arr, target, index+1);
    
}
}

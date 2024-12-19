//chaek the array is sorted or not
public class sorted_array {
    public static void main(String[] args) {
        int [] arr = {1, 5, 6, 9, 45, 6, 99};
        int i = 0;     //from there the sorting will be start
        System.out.println(isSorted(arr, i));
    }
    public static boolean isSorted(int [] arr, int i) {
        //basecase, if "i" traverse through end of array return "true"
        if(i==arr.length-1){
            return true;
        }

        if(arr[i]>arr[i+1]){        //if current element > next element
            return false;
        }

        // if current element < next element, then function will be called for all elements

       return (isSorted(arr, i+1));   
    }
}

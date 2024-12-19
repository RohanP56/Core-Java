//Modified Binary search

//sorted, rotated array with distinct numbers (in ascending order), It is rotated at a pivot point. Find the index of given element.
public class modified_binary_search {
    public static void main(String[] args) {
        int [] arr = {5, 8, 10, 12, 15, 0, 1, 3, 4};
        int target = 0; 
        int si = 0;          //starting index
        int ei = arr.length-1;    //ending index
        System.out.println(search(arr, target, si, ei));
    }
    public static int search(int [] arr, int target, int si, int ei) {
        //base case
        if(si>ei){
            return -1;    //invaild condition
        }

        //calculate mid
        int mid = (si+ei)/2;

        // if target found on mid
        if(arr[mid] == target){
            return mid;
        }

        //if target on Line:1
        if(arr[si]<=arr[mid]){
            //case:a left
            if(arr[si]<=target && target<=arr[mid]){
                return search(arr, target, si, mid-1);    //because (mid) is already searched 
            }
            else{     //case:b    right
                return search(arr, target, mid+1, ei);
            }
        }
         //if target on Line:2
        else{          
            //case:c right
            if(arr[mid]<=target && target<=arr[ei]){
                return search(arr, target, mid+1, ei);    //because (mid) is already searched 
            }
            else{     //case:d    left
                return search(arr, target, si, mid-1);
            }
        }
    }
    
}

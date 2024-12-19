//In this case the target will be more than 1 times, so we have to create a array-list and return the entire list
import java.util.ArrayList;

public class linear_search_multiple_occurance {
    public static void main(String[] args) {
        int [] arr = {5, 12, 84, 12, 65, 35, 88, 12};
        int target = 12;
        int index = 0;
        ArrayList<Integer> list = new ArrayList<>(); 
        ArrayList<Integer> ans =linSer(arr, target, index, list);
        System.out.println(ans);
    }
    public static ArrayList<Integer> linSer(int [] arr, int target, int index, ArrayList<Integer> list) {
        //Basecase
        if(index == arr.length){     //index will travel entire array
            return list; 
        }
        if(target == arr[index]){      //if target matches with the index it will added to the list
            list.add(index);
        }
        return linSer(arr, target, index+1, list);
    }
    
}

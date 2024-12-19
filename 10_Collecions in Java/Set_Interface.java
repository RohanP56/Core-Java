import java.util.*;

public class Set_Interface {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        //Set<Integer> lset = new LinkedHashSet<>();  follow the inserted order
        //Set<Integer> lset = new TreeSet<>();  TreeSet uses internally uses BST, store element in sorted order

        set.add(10);
        set.add(10); /// set does not contain duplicate element, also dont follow any order
        set.add(10);
        set.add(20);
        System.out.println(set);   //[20, 10]
    }
    
}

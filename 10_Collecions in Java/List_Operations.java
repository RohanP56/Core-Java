/*                          List(Interface)

            |                   |                       |                           |
            |                   |                       |                           |
        ArrayList           LinkedList               Vector                       Stack


*/



import java.util.*;

public class List_Operations {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        List<Integer> al2 = new LinkedList<>();

        al2.add(90);
        al2.add(55);
        al2.add(7);
        al2.add(9);

        al.add(5);     // Adding element into arraylst
        al.add(7);
        al.add(1);
        al.add(3);
        al.add(9);
        System.out.println(al);   //printin arraylist
        System.out.println(al.size());   //size of arraylist


        //get element     return the value which present in given index, use when we traverse through list 
        System.out.println(al.get(3));  

        //  set element  --->    3rd element will be set as 10
        al.set(3, 10);               
        System.out.println(al);

        al.remove(2);             //2nd index element will be removed
        System.out.println(al);

        al.remove(Integer.valueOf(7));    //remove the given integer value
        System.out.println(al);

        System.out.println(al.contains(6));   //return boolean based on the object is present in ArrayList or not

        //remove common element as compared another list [remove common element of list2 from list1]
        al.removeAll(al2);
        System.out.println(al);

        //i want to add all list2 element in list1
        al.addAll(al2);
        System.out.println(al);

        // remove all element from list1 which are not present in list2
        al.retainAll(al2);
        System.out.println(al);

        //clear full list
        al.clear();
        System.out.println(al);

        // we also add element using index value,and previous will be move forward
        System.out.println(al2);
        al2.add(2, 500);      
        System.out.println(al2);


        //Iteratot   --->  we can also iterate using for-loop  [using .size() and.get()]
        Iterator<Integer> a = al2.iterator();
        while(a.hasNext()){
            System.out.println(a.next());
        }

        //sublist
        List<Integer> smallList = al2.subList(0, 2);    //last index will be excluded
        System.out.println(smallList);



        //STACK [LIFO --> Last In Fast Out]
        Stack<String> fruits = new Stack<>();   //initializing stack

        fruits.push("apple");      // adding element into the stack
        fruits.push("grapes"); 
        fruits.push("avocado"); 
        fruits.push("guava"); 

        System.out.println(fruits);  //printing stack
        System.out.println(fruits.pop());  //last element will be popped out
        System.out.println(fruits.peek());  //return the top element but not popped out
        System.out.println(fruits.isEmpty());  //check the stack is empty or not    return true or false based on it.


        
    }
    
}

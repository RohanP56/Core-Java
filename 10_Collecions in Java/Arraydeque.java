import java.util.ArrayDeque;

public class Arraydeque {
    public static void main(String[] args) {

        ArrayDeque<Integer> dq = new ArrayDeque<>();   //double ended Queue we can add or remove element from both side of the queue
        // or,  Deque<Integer> dq = new ArrayDeque<>();

        //add element
        dq.offer(10);
        dq.offerLast(30);
        dq.offerFirst(20);
        dq.offer(40);
        dq.offer(50);          //these items added into last
        System.out.println(dq);   //[20, 10, 30, 40, 50]

        //peek element
        System.out.println(dq.peek());     //    peeek form front    
        System.out.println(dq.peekLast());    //peek from end
        System.out.println(dq.peekFirst());        //peek from front
 
        //remove element
        dq.poll();               //remove from first
        System.out.println(dq.pollLast());    //remove element from last
        System.out.println(dq.pollFirst());    //remove element from first 
        System.out.println(dq);       //[10, 30, 40, 50]

        
    }
    
}



/*using ArrayDeque we can implement both Stack and Queue

for stack ---> push [added form first], pop [remove from front], peek menthod
for queue  ---> offer [added from last], poll [remove from front], peek method


adding element --> add(added in to end), addFirst(), addLast(), offer(added end), offerFirst(), offerLast(), push(added front)
removing element --> remove(remove from front), removeFirst(), removeLast(), poll(remove from front), pollFirst(), pollLast() , pop(remove from front)
peek()  --> return top element
 */
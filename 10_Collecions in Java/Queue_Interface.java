import java.util.Queue;
import java.util.LinkedList;

public class Queue_Interface {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        //add item into queue
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.offer(50);         //offer --> also add element in queue, but if memory full then it return (True or False)
        q.offer(60);
        System.out.println(q);   ///        [10, 20, 30, 40, 50, 60]

        //remove element from queue 
        q.remove();
        q.poll();    //poll also remove element but return null if queue is empty
        System.out.println(q);                ///          [30, 40, 50, 60]
        //peek element ---> return the top element but dont remove
        System.out.println(q.peek());  ///      30

        //iterate through queue
        while(!q.isEmpty()){
            System.out.print(q.poll()+" ");
        }
        System.out.println(); 

        System.out.println(q.poll());    //this will return null because the queue is empty

    }
    
}

import java.util.PriorityQueue;
import java.util.Queue;

public class Priorityqueue {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(40);
        pq.add(10);
        pq.add(20);

        System.out.println(pq);    //default order is [samll -> Big]
        System.out.println(pq.poll());   //sammmest element will remove first
        System.out.println(pq);

        Queue<Integer> ppq = new PriorityQueue<>((a,b)->(b-a));    //custom comparetor
        ppq.add(10);
        ppq.add(45);
        ppq.add(99);
        ppq.add(80);
        ppq.add(73);
        System.out.println(ppq);    //sorted in bigger---> samlled order

    }
    
}

package collectionframework;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Queue is interface.
 *
 */

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> q=new PriorityQueue<>();
        q.add(10);
        q.add(20);
        q.offer(90);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println(q);

        System.out.println(q);
      System.out.println(q.remove());
        System.out.println(q);
       System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.element());

    }
}

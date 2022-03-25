package Collection.Queue;

import java.util.PriorityQueue;

public class PriorityQueueEx {
    public static void main(String[] args) {

        PriorityQueue<Integer> pqueue = new PriorityQueue();
        pqueue.add(10);
        pqueue.add(20);
        pqueue.add(40);
        pqueue.add(58);

        System.out.println(pqueue);
        System.out.println("Peek value"+pqueue.peek());
        System.out.println(pqueue);
        System.out.println(pqueue.poll());
        System.out.println(pqueue);
    }
}

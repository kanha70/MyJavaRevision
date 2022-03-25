package Collection.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEx {
    public static void main(String[] args) {

        Deque<Integer> de_que = new ArrayDeque<>();

        de_que.add(10);
        de_que.add(20);
        de_que.add(30);
        de_que.add(40);
        de_que.add(50);
        de_que.add(60);

        System.out.println(de_que);
        de_que.clear();

        System.out.println(de_que);

        de_que.addFirst(543);
        de_que.addLast(673);

        System.out.println(de_que);
        //AddLast() method to insert the element at the tail
        de_que.addLast(23);
        de_que.addLast(6);

        System.out.println(de_que);
    }
}

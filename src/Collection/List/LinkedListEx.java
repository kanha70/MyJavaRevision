package Collection.List;

import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<Integer>();
        for (int i = 1; i <= 5; i++)
            ll.add(i);
        //Printing all elements of Linked List;
        System.out.println(ll);

        //Removing element at index 3
        ll.remove(3);
        System.out.println(ll);

        //Printing the element one by one;
        for ( int i = 0; i < ll.size(); i++)
            System.out.print(ll.get(i)+" ");

    }
}

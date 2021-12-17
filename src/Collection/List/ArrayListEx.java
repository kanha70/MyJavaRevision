package Collection.List;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<Integer>();

        //Appending new element at the end of the list
        for (int i = 1; i <= 5; i++)
            al.add(i);
        //Printing  elements
    //    System.out.println(al);

        //Removing the element at index of 4;
     //   al.remove(2);
      //  System.out.println(al);

        //Printing the element one by one
        for (int i = 0; i <al.size(); i++)
            System.out.print(al.get(i)+" ");

    }
}
